package com.Backend.VueFrame.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "VF_FIELD_CONF")
public class FieldConfigData {
	
	@Id
	@Column(name = "FIELD_ID")
	private String fieldId;
	
	@Column(name = "WF_ID")
	private String wfId;
	
	@Column(name = "GRID_NAME")
	private String gridName;
	
	@Column(name = "COLUMN_NAME")
	private String columnName;
	
	@Column(name = "EDITABLE")
	private String editable;

	
	public String getFieldId() {
		return fieldId;
	}

	public void setFieldId(String fieldId) {
		this.fieldId = fieldId;
	}

	public String getWfId() {
		return wfId;
	}

	public void setWfId(String wfId) {
		this.wfId = wfId;
	}

	public String getGridName() {
		return gridName;
	}

	public void setGridName(String gridName) {
		this.gridName = gridName;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getEditable() {
		return editable;
	}

	public void setEditable(String editable) {
		this.editable = editable;
	}

	
	public FieldConfigData(String fieldId, String wfId, String gridName, String columnName, String editable) {
		super();
		this.fieldId = fieldId;
		this.wfId = wfId;
		this.gridName = gridName;
		this.columnName = columnName;
		this.editable = editable;
	}

	
	public FieldConfigData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
	
	
}