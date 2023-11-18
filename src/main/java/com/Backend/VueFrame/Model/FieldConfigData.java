package com.Backend.VueFrame.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "VF_FIELD_CONFIGURATION_DETAILS")
public class FieldConfigData {
	
	@Id
	@Column(name = "ID")
	private String id;
	
	@Column(name = "WORKFLOW_NAME")
	private String workflowName;
	
	@Column(name = "COLUMN_NAME")
	private String columnName;
	
	@Column(name = "SECTION_NAME")
	private String sectionName;
	
	@Column(name = "EDITABLE")
	private String editable;

	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getWorkflowName() {
		return workflowName;
	}

	public void setWorkflowName(String workflowName) {
		this.workflowName = workflowName;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	public String getEditable() {
		return editable;
	}

	public void setEditable(String editable) {
		this.editable = editable;
	}

	public FieldConfigData(String id, String workflowName, String columnName, String sectionName, String editable) {
		super();
		this.id = id;
		this.workflowName = workflowName;
		this.columnName = columnName;
		this.sectionName = sectionName;
		this.editable = editable;
	}

	public FieldConfigData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}