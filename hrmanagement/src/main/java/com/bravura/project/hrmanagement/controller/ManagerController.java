
package com.bravura.project.hrmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.bravura.project.hrmanagement.model.Manager;
import com.bravura.project.hrmanagement.service.ManagerService;

import java.util.List;

@Controller
public class ManagerController {

    private final ManagerService managerService;

    @Autowired
    public ManagerController(ManagerService managerService) {
        this.managerService = managerService;
    }

    // Handler method for displaying the list of all managers
    @GetMapping("/managers")
    public String showAllManagers(Model model) {
        List<Manager> managers = managerService.getAllManagers();
        model.addAttribute("managers", managers);
        return "allManagers"; // Assuming you have an allManagers.jsp file to display the list
    }

    // Handler method for displaying the manager details
    @GetMapping("/manager/{empId}")
    public String showManagerDetails(@PathVariable int empId, Model model) {
        Manager manager = managerService.getManagerById(empId);
        if (manager == null) {
            return "managerNotFound"; // Assuming you have a managerNotFound.jsp file to display an error message
        }
        model.addAttribute("manager", manager);
        return "managerDetails"; // Assuming you have a managerDetails.jsp file to display the manager details
    }

    // Handler method for displaying the form to add a new manager
    @GetMapping("/addManager")
    public String showAddManagerForm(Model model) {
        model.addAttribute("manager", new Manager());
        return "addManager"; // Assuming you have an addManager.jsp file with the form to add a new manager
    }

    // Handler method for submitting the form to add a new manager
    @PostMapping("/addManager")
    public String addManager(@ModelAttribute Manager manager) {
        managerService.addManager(manager);
        return "redirect:/managers"; // Redirect to the list of all managers after adding a new manager
    }

    // Handler method for displaying the form to update a manager
    @GetMapping("/updateManager/{empId}")
    public String showUpdateManagerForm(@PathVariable int empId, Model model) {
        Manager manager = managerService.getManagerById(empId);
        if (manager == null) {
            return "managerNotFound"; // Assuming you have a managerNotFound.jsp file to display an error message
        }
        model.addAttribute("manager", manager);
        return "updateManager"; // Assuming you have an updateManager.jsp file with the form to update a manager
    }

    // Handler method for submitting the form to update a manager
    @PostMapping("/updateManager")
    public String updateManager(@ModelAttribute Manager manager) {
        managerService.updateManager(manager);
        return "redirect:/managers"; // Redirect to the list of all managers after updating a manager
    }

    // Handler method for deleting a manager
    @GetMapping("/deleteManager/{empId}")
    public String deleteManager(@PathVariable int empId) {
        managerService.deleteManagerById(empId);
        return "redirect:/managers"; // Redirect to the list of all managers after deleting a manager
    }
}
