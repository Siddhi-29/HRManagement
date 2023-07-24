
package com.bravura.project.hrmanagement.model;

public class Candidate {

    private int empId;
    private String name;
    private String email;
    private int managerId;
	private Manager manager;
    

	
    // Default constructor
    public Candidate() {
    }

    // Parameterized constructor
    public Candidate(int empId, String name, String email, int managerId) {
        this.empId = empId;
        this.name = name;
        this.email = email;
        this.managerId = managerId;
    }

    // Getter and Setter methods
    
    public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", managerId=" + managerId +
                '}';
    }
}
