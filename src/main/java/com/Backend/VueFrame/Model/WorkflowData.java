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
	
	@Column(name = "STAGE")
	private String stage;
	
	@Column(name = "STATUS")
	private String status;
	
	@Column(name = "ACTION")
	private String action;
	
	@Column(name = "NEXT_APPROVER")
	private String nextApprover;
	
	@Column(name = "MAKER")
	private String maker;
	
	@Column(name = "CHECKER")
	private String checker;
	
	@Column(name = "PROCEDURE")
	private String procedure;
	
	@Column(name = "NEXT_STAGE")
	private String nextStage;
	
	@Column(name = "NEXT_STATUS")
	private String nextStatus;
	
	@Column(name = "HOOK_PROCEDURE")
	private String hookProcedure;
	
	@Column(name = "GRID_ID")
	private String gridId;
	
	
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

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getNextApprover() {
		return nextApprover;
	}

	public void setNextApprover(String nextApprover) {
		this.nextApprover = nextApprover;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getChecker() {
		return checker;
	}

	public void setChecker(String checker) {
		this.checker = checker;
	}

	public String getProcedure() {
		return procedure;
	}

	public void setProcedure(String procedure) {
		this.procedure = procedure;
	}

	public String getNextStage() {
		return nextStage;
	}

	public void setNextStage(String nextStage) {
		this.nextStage = nextStage;
	}

	public String getNextStatus() {
		return nextStatus;
	}

	public void setNextStatus(String nextStatus) {
		this.nextStatus = nextStatus;
	}

	public String getHookProcedure() {
		return hookProcedure;
	}

	public void setHookProcedure(String hookProcedure) {
		this.hookProcedure = hookProcedure;
	}
	
	public String getGridId() {
		return gridId;
	}

	public void setGridId(String gridId) {
		this.gridId = gridId;
	}
	
	
	public WorkflowData(String workFlowId, String formId, String stage, String status, String action,
			String nextApprover, String maker, String checker, String procedure, String nextStage,
			String nextStatus, String hookProcedure, String gridId) {
		super();
		this.workFlowId = workFlowId;
		this.formId = formId;
		this.stage = stage;
		this.status = status;
		this.action = action;
		this.nextApprover = nextApprover;
		this.maker = maker;
		this.checker = checker;
		this.procedure = procedure;
		this.nextStage = nextStage;
		this.nextStatus = nextStatus;
		this.hookProcedure = hookProcedure;
		this.gridId = gridId;
	}
	

	public WorkflowData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}