package com.Backend.VueFrame.Model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Embeddable
public class Issue {
	
	private String issueId;

	public String getIssueId() {
		return issueId;
	}

	public void setIssueId(String issueId) {
		this.issueId = issueId;
	}

	public Issue(String issueId) {
		super();
		this.issueId = issueId;
	}

	public Issue() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
