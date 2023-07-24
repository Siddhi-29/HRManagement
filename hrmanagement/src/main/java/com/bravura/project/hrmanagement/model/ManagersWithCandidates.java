package com.bravura.project.hrmanagement.model;

public class ManagersWithCandidates {

	
	private int manager_id;
    private String manager_name;
    private String manager_email;
    private String merged_candidates;
    
    public ManagersWithCandidates() {
    
    }
    
	public ManagersWithCandidates(int manager_id, String manager_name, String manager_email, String merged_candidates) {
		super();
		this.manager_id = manager_id;
		this.manager_name = manager_name;
		this.manager_email = manager_email;
		this.merged_candidates = merged_candidates;
	}
	public int getManager_id() {
		return manager_id;
	}
	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}
	public String getManager_name() {
		return manager_name;
	}
	public void setManager_name(String manager_name) {
		this.manager_name = manager_name;
	}
	public String getManager_email() {
		return manager_email;
	}
	public void setManager_email(String manager_email) {
		this.manager_email = manager_email;
	}
	public String getMerged_candidates() {
		return merged_candidates;
	}
	public void setMerged_candidates(String merged_candidates) {
		this.merged_candidates = merged_candidates;
	}
	@Override
	public String toString() {
		return "ManagersWithCandidates [manager_id=" + manager_id + ", manager_name=" + manager_name
				+ ", manager_email=" + manager_email + ", merged_candidates=" + merged_candidates + "]";
	}
	
}
