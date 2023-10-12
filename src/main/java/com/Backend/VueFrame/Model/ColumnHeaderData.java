package com.Backend.VueFrame.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VF_COLUMN_HEADER")
public class ColumnHeaderData {
	
	@Id
	@Column(name="COLUMN_ID")
	private String columnId;
	
	@Column(name = "FORM_ID")
	private String formId;
	
	@Column(name = "COLUMN_NAME")
	private String columnName;
	
	@Column(name = "COLUMN_STORED_VALUE")
	private String columnStoredValue;
	
	@Column(name = "COLUMN_FILTER_TYPE")
	private String columnFilterType;

	public String getColumnId() {
		return columnId;
	}

	public void setColumnId(String columnId) {
		this.columnId = columnId;
	}

	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getColumnStoredValue() {
		return columnStoredValue;
	}

	public void setColumnStoredValue(String columnStoredValue) {
		this.columnStoredValue = columnStoredValue;
	}

	public String getColumnFilterType() {
		return columnFilterType;
	}

	public void setColumnFilterType(String columnFilterType) {
		this.columnFilterType = columnFilterType;
	}

	public ColumnHeaderData(String columnId, String formId, String columnName, String columnStoredValue,
			String columnFilterType) {
		super();
		this.columnId = columnId;
		this.formId = formId;
		this.columnName = columnName;
		this.columnStoredValue = columnStoredValue;
		this.columnFilterType = columnFilterType;
	}

	public ColumnHeaderData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	


}
