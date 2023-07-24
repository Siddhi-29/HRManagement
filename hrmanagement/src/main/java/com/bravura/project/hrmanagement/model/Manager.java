
package com.bravura.project.hrmanagement.model;

import java.util.List;

public class Manager {

    private int empId;
    private String name;
    private String email;
    private List<Candidate> candidates; // Assuming Candidate is another class representing the candidates managed by the manager

    // Constructor
    public Manager(int empId, String name, String email) {
        this.empId = empId;
        this.name = name;
        this.email = email;
    }

    public Manager() {
		super();
	}

	// Getter and setter methods for empId
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    // Getter and setter methods for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter methods for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter and setter method for candidates
    public List<Candidate> getCandidates() {
        return candidates;
    }

    public void setCandidates(List<Candidate> candidates) {
        this.candidates = candidates;
    }
}
