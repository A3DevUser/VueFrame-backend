package com.Backend.VueFrame.Model;

import java.io.Serializable;

public class FormData implements Serializable {
	
    private String formId;
    private String stage;
    private String action;
    private String approver;
	public String getFormId() {
		return formId;
	}
	public void setFormId(String formId) {
		this.formId = formId;
	}
	public String getStage() {
		return stage;
	}
	public void setStage(String stage) {
		this.stage = stage;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getApprover() {
		return approver;
	}
	public void setApprover(String approver) {
		this.approver = approver;
	}
	public FormData(String formId, String stage, String action, String approver) {
		super();
		this.formId = formId;
		this.stage = stage;
		this.action = action;
		this.approver = approver;
	}
	public FormData() {
		super();
		// TODO Auto-generated constructor stub
	}

    
    
}