
package com.bravura.project.hrmanagement.dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bravura.project.hrmanagement.model.ManagersWithCandidates;

@Repository
public class ManagersWithCandidatesDAO {

	private final JdbcTemplate jdbcTemplate;

	@Autowired
    public ManagersWithCandidatesDAO(JdbcTemplate jdbcTemplate) {
    	 this.jdbcTemplate = jdbcTemplate;
	}


    public List<ManagersWithCandidates> getAllMWC() {
        String sql = "SELECT * FROM manager_candidate_mapping";
        return jdbcTemplate.query(sql, new MWCRowMapper());
    }
}
