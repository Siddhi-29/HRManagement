
package com.bravura.project.hrmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.bravura.project.hrmanagement.model.Candidate;
import com.bravura.project.hrmanagement.model.Manager;
import com.bravura.project.hrmanagement.service.CandidateService;
import com.bravura.project.hrmanagement.service.ManagerService;

@Controller
public class HRController {

    private final CandidateService candidateService;
    private final ManagerService managerService;

    @Autowired
    public HRController(CandidateService candidateService, ManagerService managerService) {
        this.candidateService = candidateService;
        this.managerService = managerService;
    }
    
    @GetMapping("/")
    public String showHomePage() {
      
     //   model.addAttribute("greeting", "Welcome to HR Management System!");

        return "home.jsp";
    
    }
    @GetMapping("/login")
    public String loginpage() {
      
     //   model.addAttribute("greeting", "Welcome to HR Management System!");

        return "login.jsp";
    }
    
    @GetMapping("/hr_home")
    public String hrhomepage() {
      

        return "hr_home.jsp";
    }
    
    
    @GetMapping("/viewCandidates")
    public String viewCandidates(Model model) {
        List<Candidate> candidates = candidateService.getAllCandidates();
        model.addAttribute("candidates", candidates);

        // Debug line
        System.out.println("Candidates: " + candidates);

        return "views/viewCandidates.jsp"; // Make sure the JSP filename is correct here
    }

    @GetMapping("/viewManagers")
    public String viewManagers(Model model) {
        List<Manager> managers = managerService.getAllManagers();
        model.addAttribute("managers", managers);

        // Debug line
        System.out.println("Managers: " + managers);

        return "views/viewManagers.jsp"; // Make sure the JSP filename is correct here
    }
    
    
    @GetMapping("/assignManagerForm")
    public String showAssignManagerForm(Model model) {
        List<Candidate> candidates = candidateService.getAllCandidates();
        List<Manager> managers = managerService.getAllManagers();
        model.addAttribute("candidates", candidates);
        model.addAttribute("managers", managers);
        return "views/assignManagerForm.jsp";
    }
    
    // Handler method for the URL "/assignManager/{empId}"
       @PostMapping("/assignManager/{empId}")
       public String assignManager(@PathVariable int empId, @RequestParam int managerId) {
           // Get the candidate from the database based on empId
           Candidate candidate = candidateService.getCandidateById(empId);

           if (candidate == null) {
               // Candidate not found, handle this case (e.g., show an error message)
               return "errorPage";
           }

           // Update the managerId for the candidate
           candidate.setManagerId(managerId);

           // Save the updated candidate to the database
           candidateService.saveCandidate(candidate);

           // Redirect to a success page or any other desired page
           return "redirect:/successPage";
       }
 // form submission to assign a manager to a candidate
    @PostMapping("/assignManager/{candidateEmpId}")
    public String assignManagerToCandidate(@PathVariable int candidateEmpId, @RequestParam("managerId") int managerId) {
        Candidate candidate = candidateService.getCandidateById(candidateEmpId);
        Manager manager = managerService.getManagerById(managerId);

        if (candidate != null && manager != null) {
            candidate.setManager(manager); // Set the manager for the candidate
            candidateService.updateCandidate(candidate); // Save the updated candidate to the database
        }

        return "redirect:/hr_home"; // Redirect to the HR home page after form submission
    }
    
    @GetMapping("/under_construction")
    public String showUnderConstructionPage() {
        return "views/under_construction.jsp";
    }
    
}
