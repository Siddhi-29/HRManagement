package com.bravura.project.hrmanagement.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bravura.project.hrmanagement.model.Candidate;
import com.bravura.project.hrmanagement.model.Manager;

import java.util.List;

@Repository
public class ManagerDAO {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ManagerDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // Method to insert a new manager into the database
    public void insertManager(Manager manager) {
        String sql = "INSERT INTO managers (empId, name, email) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, manager.getEmpId(), manager.getName(), manager.getEmail());
    }

    // Method to update an existing manager in the database
    public void updateManager(Manager manager) {
        String sql = "UPDATE managers SET name = ?, email = ? WHERE empId = ?";
        jdbcTemplate.update(sql, manager.getName(), manager.getEmail(), manager.getEmpId());
    }

    // Method to delete a manager from the database based on their empId
    public void deleteManagerById(int empId) {
        String sql = "DELETE FROM managers WHERE empId = ?";
        jdbcTemplate.update(sql, empId);
    }

    // Method to retrieve a manager from the database based on their empId
    public Manager getManagerById(int empId) {
        String sql = "SELECT * FROM managers WHERE empId = ?";
        List<Manager> managers = jdbcTemplate.query(sql, new ManagerRowMapper(), empId);
        return managers.isEmpty() ? null : managers.get(0);
    }

    // Method to retrieve all managers from the database
    public List<Manager> getAllManagers() {
        String sql = "SELECT * FROM managers";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Manager.class));
    }
}
