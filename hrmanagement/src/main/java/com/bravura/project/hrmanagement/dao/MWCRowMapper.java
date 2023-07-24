package com.bravura.project.hrmanagement.dao;



import org.springframework.jdbc.core.RowMapper;

import com.bravura.project.hrmanagement.model.ManagersWithCandidates;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MWCRowMapper implements RowMapper<ManagersWithCandidates> {
	
    @Override
    public ManagersWithCandidates mapRow(ResultSet rs, int rowNum) throws SQLException {
        ManagersWithCandidates mwc = new ManagersWithCandidates();
        mwc.setManager_id(rs.getInt("manager_id"));
        mwc.setManager_name(rs.getString("manager_name"));
        mwc.setManager_email(rs.getString("manager_email"));
        mwc.setMerged_candidates(rs.getString("merged_candidates"));
        return mwc;
    }
}
