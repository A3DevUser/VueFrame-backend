package com.Backend.VueFrame.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "VF_WORKFLOW_DETAILS")
public class WorkflowData {
	
	@Id
	@Column(name = "WORKFLOW_ID")
	private String workFlowId;
	
	@Column(name = "FORM_ID")
	private String formId;
	
	@Column(name = "WORKFLOW_NAME")
	private String workflowName;
	
	@Column(name = "PROCEDURE_NAME")
	private String procedureName;
	
	@Column(name = "NEXT_APPROVER")
	private String nextApprover;
	
	@Column(name = "CURRENT_STAGE")
	private String currentStage;
	
	@Column(name = "NEXT_STAGE")
	private String nextStage;
	
	@Column(name= "PRIVIOUS_STAGE")
	private String previousStage;
	
	@Column(name = "ACTION")
	private String action;

	public String getWorkFlowId() {
		return workFlowId;
	}

	public void setWorkFlowId(String workFlowId) {
		this.workFlowId = workFlowId;
	}

	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}

	public String getWorkflowName() {
		return workflowName;
	}

	public void setWorkflowName(String workflowName) {
		this.workflowName = workflowName;
	}

	public String getProcedureName() {
		return procedureName;
	}

	public void setProcedureName(String procedureName) {
		this.procedureName = procedureName;
	}

	public String getNextApprover() {
		return nextApprover;
	}

	public void setNextApprover(String nextApprover) {
		this.nextApprover = nextApprover;
	}

	public String getCurrentStage() {
		return currentStage;
	}

	public void setCurrentStage(String currentStage) {
		this.currentStage = currentStage;
	}

	public String getNextStage() {
		return nextStage;
	}

	public void setNextStage(String nextStage) {
		this.nextStage = nextStage;
	}

	public String getPreviousStage() {
		return previousStage;
	}

	public void setPreviousStage(String previousStage) {
		this.previousStage = previousStage;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public WorkflowData(String workFlowId, String formId, String workflowName, String procedureName,
			String nextApprover, String currentStage, String nextStage, String previousStage, String action) {
		super();
		this.workFlowId = workFlowId;
		this.formId = formId;
		this.workflowName = workflowName;
		this.procedureName = procedureName;
		this.nextApprover = nextApprover;
		this.currentStage = currentStage;
		this.nextStage = nextStage;
		this.previousStage = previousStage;
		this.action = action;
	}

	public WorkflowData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	

}
