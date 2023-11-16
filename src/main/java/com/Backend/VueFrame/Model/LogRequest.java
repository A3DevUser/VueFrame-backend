package com.Backend.VueFrame.Model;

public class LogRequest {
    private String level;
    private String subject;
    private String details;
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public LogRequest(String level, String subject, String details) {
		super();
		this.level = level;
		this.subject = subject;
		this.details = details;
	}
	public LogRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
    

}