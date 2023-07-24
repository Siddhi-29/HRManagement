
package com.bravura.project.hrmanagement.dao;

import org.springframework.jdbc.core.RowMapper;

import com.bravura.project.hrmanagement.model.Manager;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ManagerRowMapper implements RowMapper<Manager> {

    @Override
    public Manager mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Manager manager = new Manager();
        manager.setEmpId(resultSet.getInt("empId"));
        manager.setName(resultSet.getString("name"));
        manager.setEmail(resultSet.getString("email"));
        return manager;
    }
}
