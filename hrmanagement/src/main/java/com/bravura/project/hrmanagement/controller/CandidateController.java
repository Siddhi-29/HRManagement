
package com.bravura.project.hrmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bravura.project.hrmanagement.model.Candidate;
import com.bravura.project.hrmanagement.service.CandidateService;

@Controller
public class CandidateController {

    private final CandidateService candidateService;

    @Autowired
    public CandidateController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    // Mapping to display the form to add a new candidate
    @GetMapping("/addCandidate")
    public String showAddCandidateForm() {
        return "addCandidate";
    }

    // Mapping to handle form submission to add a new candidate
    @PostMapping("/addCandidate")
    public String addCandidate(@RequestParam("empId") int empId,
                               @RequestParam("name") String name,
                               @RequestParam("email") String email,
                               @RequestParam("managerId") int managerId) {

        // Create a new Candidate object and set its properties
        Candidate candidate = new Candidate();
        candidate.setEmpId(empId);
        candidate.setName(name);
        candidate.setEmail(email);
        candidate.setManagerId(managerId);

        // Save the new candidate in the database using the CandidateService
        candidateService.addCandidate(candidate);

        // Redirect back to the home page after adding the candidate
        return "redirect:/";
    }

    // Mapping to display the form to update an existing candidate
    @GetMapping("/updateCandidate")
    public String showUpdateCandidateForm(@RequestParam("empId") int empId, Model model) {
    	
        // Retrieve the candidate from the database using the CandidateService
        Candidate candidate = candidateService.getCandidateById(empId);
        
        // Adding the candidate object to the model to be accessed in the JSP
        model.addAttribute("candidate", candidate);

        return "updateCandidate";
    }

    // Mapping to handle form submission to update an existing candidate
    @PostMapping("/updateCandidate")
    public String updateCandidate(@RequestParam("empId") int empId,
                                  @RequestParam("name") String name,
                                  @RequestParam("email") String email,
                                  @RequestParam("managerId") int managerId) {

        // Retrieve the existing candidate from the database using the CandidateService
        Candidate candidate = candidateService.getCandidateById(empId);

        // Update the candidate's properties
        candidate.setName(name);
        candidate.setEmail(email);
        candidate.setManagerId(managerId);

        // Save the updated candidate in the database using the CandidateService
        candidateService.updateCandidate(candidate);

        // Redirect back to the home page after updating the candidate
        return "redirect:/";
    }

    // Mapping to delete a candidate
    @GetMapping("/deleteCandidate")
    public String deleteCandidate(@RequestParam("empId") int empId) {
        // Delete the candidate from the database using the CandidateService
        candidateService.deleteCandidate(empId);

        // Redirect back to the home page after deleting the candidate
        return "redirect:/";
    }
    
  
}
