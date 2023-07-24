
package com.bravura.project.hrmanagement.dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bravura.project.hrmanagement.model.Candidate;

@Repository
public class CandidateDAO {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public CandidateDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // Method to insert a new candidate into the database
    public void insertCandidate(Candidate candidate) {
        String sql = "INSERT INTO candidates (empId, name, email, managerId) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, candidate.getEmpId(), candidate.getName(), candidate.getEmail(), candidate.getManagerId());
    }

    // Method to update an existing candidate in the database
    public void updateCandidate(Candidate candidate) {
        String sql = "UPDATE candidates SET name = ?, email = ?, managerId = ? WHERE empId = ?";
        jdbcTemplate.update(sql, candidate.getName(), candidate.getEmail(), candidate.getManagerId(), candidate.getEmpId());
    }

    // Method to delete a candidate from the database based on their emp_id
    public void deleteCandidate(int empId) {
        String sql = "DELETE FROM candidates WHERE empId = ?";
        jdbcTemplate.update(sql, empId);
    }

 // Method to retrieve a candidate from the database based on their emp_id
    public Candidate getCandidateById(int empId) {
        String sql = "SELECT * FROM candidates WHERE empId = ?";
        List<Candidate> candidates = jdbcTemplate.query(sql, new CandidateRowMapper(), empId);
        return candidates.isEmpty() ? null : candidates.get(0);
    }

    // Method to retrieve all candidates from the database
    public List<Candidate> getAllCandidates() {
        String sql = "SELECT * FROM candidates";
        return jdbcTemplate.query(sql, new CandidateRowMapper());
    }
    
    
    public void save(Candidate candidate) {
        if (candidate.getEmpId() == 0) {
            // If the empId is 0, it means the candidate is new and should be inserted into the database
            insertCandidate(candidate);
        } else {
            // If the empId is not 0, it means the candidate already exists in the database and should be updated
            updateCandidate(candidate);
        }
    }
}
