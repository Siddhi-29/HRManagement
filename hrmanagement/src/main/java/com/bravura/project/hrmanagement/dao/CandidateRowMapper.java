
package com.bravura.project.hrmanagement.dao;

import org.springframework.jdbc.core.RowMapper;

import com.bravura.project.hrmanagement.model.Candidate;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CandidateRowMapper implements RowMapper<Candidate> {
	
    @Override
    public Candidate mapRow(ResultSet rs, int rowNum) throws SQLException {
        Candidate candidate = new Candidate();
        candidate.setEmpId(rs.getInt("empId")); // Use the new column name "empId"
        candidate.setName(rs.getString("name"));
        candidate.setEmail(rs.getString("email"));
        candidate.setManagerId(rs.getInt("managerId")); // Use the new column name "managerId"
        return candidate;
    }
}
