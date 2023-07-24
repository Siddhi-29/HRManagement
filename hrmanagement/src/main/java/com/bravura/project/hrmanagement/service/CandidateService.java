
package com.bravura.project.hrmanagement.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bravura.project.hrmanagement.dao.CandidateDAO;
import com.bravura.project.hrmanagement.model.Candidate;

import java.util.List;

@Service
public class CandidateService {

    private final CandidateDAO candidateDAO;

    @Autowired
    public CandidateService(CandidateDAO candidateDAO) {
        this.candidateDAO = candidateDAO;
    }

    public void addCandidate(Candidate candidate) {
        candidateDAO.insertCandidate(candidate);
    }

    public void updateCandidate(Candidate candidate) {
        candidateDAO.updateCandidate(candidate);
    }

    public void deleteCandidate(int empId) {
        candidateDAO.deleteCandidate(empId);
    }

    public Candidate getCandidateById(int empId) {
        return candidateDAO.getCandidateById(empId);
    }

    public List<Candidate> getAllCandidates() {
        return candidateDAO.getAllCandidates();
    }

	
		public void saveCandidate(Candidate candidate) {
	      
	        candidateDAO.save(candidate);
	    }
}
