package com.bravura.project.hrmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bravura.project.hrmanagement.dao.ManagersWithCandidatesDAO;
import com.bravura.project.hrmanagement.model.ManagersWithCandidates;

@Service
public class ManagersWithCandidatesService {

	private final ManagersWithCandidatesDAO mwcDAO;

	@Autowired
	public ManagersWithCandidatesService(ManagersWithCandidatesDAO mwcDAO) {
		this.mwcDAO = mwcDAO;
	}

	public List<ManagersWithCandidates> getAllMWC() {
        return mwcDAO.getAllMWC();
    }
	
	
	
}
