package com.Backend.VueFrame.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "VF_WF_CONFIG")
public class WfStageConfigData {
	
	@Id
	@Column(name = "CONFIG_ID")
	private String configId;
	
	@Column(name = "STAGE")
	private String stage;
	
	@Column(name = "STATUS")
	private String status;
	
	@Column(name = "ACTION")
	private String action;
	
	@Column(name = "ORG")
	private String org;
	
	@Column(name = "NEXT_APPROVER")
	private String nextApprover;
	
	@Column(name = "ROLE")
	private String role;
	
	@Column(name = "PROCESS_INSTANCE_ID")
	private String processInstanceId;
	
	@Column(name = "INSTANCE_ID")
	private String instanceId;
	
	@Column(name = "CREATED_ID")
	private String createdId;
	
	@Column(name = "CREATED_ON")
	private String createdOn;
	
	@Column(name = "MODIFIED_BY")
	private String modifiedBy;
	
	@Column(name = "MODIFIED_ON")
	private String modifiedOn;
	
	@Column(name = "OBJ_ID")
	private String objId;
	
	@Column(name = "FORM_ID")
	private String formId;
	
	@Column(name = "CURRENT_USER")
	private String currentUser;

	
	public String getConfigId() {
		return configId;
	}

	public void setConfigId(String configId) {
		this.configId = configId;
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

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
	}

	public String getNextApprover() {
		return nextApprover;
	}

	public void setNextApprover(String nextApprover) {
		this.nextApprover = nextApprover;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getProcessInstanceId() {
		return processInstanceId;
	}

	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public String getInstanceId() {
		return instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getCreatedId() {
		return createdId;
	}

	public void setCreatedId(String createdId) {
		this.createdId = createdId;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(String modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public String getObjId() {
		return objId;
	}

	public void setObjId(String objId) {
		this.objId = objId;
	}

	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}

	public String getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(String currentUser) {
		this.currentUser = currentUser;
	}

	public WfStageConfigData(String configId, String stage, String status, String action, String org,
			String nextApprover, String role, String processInstanceId, String instanceId, String createdId,
			String createdOn, String modifiedBy, String modifiedOn, String objId, String formId, String currentUser) {
		super();
		this.configId = configId;
		this.stage = stage;
		this.status = status;
		this.action = action;
		this.org = org;
		this.nextApprover = nextApprover;
		this.role = role;
		this.processInstanceId = processInstanceId;
		this.instanceId = instanceId;
		this.createdId = createdId;
		this.createdOn = createdOn;
		this.modifiedBy = modifiedBy;
		this.modifiedOn = modifiedOn;
		this.objId = objId;
		this.formId = formId;
		this.currentUser = currentUser;
	}

	public WfStageConfigData() {
		super();
		// TODO Auto-generated constructor stub
	}
		
}