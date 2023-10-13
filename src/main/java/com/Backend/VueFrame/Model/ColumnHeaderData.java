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
	private String fieldName;
	
	@Column(name = "COLUMN_STORED_VALUE")
	private String accessor;
	
	@Column(name = "COLUMN_FILTER_TYPE")
	private String columnFilterType;

	@Column(name = "SEC_ID")
	private String secId;

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

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getAccessor() {
		return accessor;
	}

	public void setAccessor(String accessor) {
		this.accessor = accessor;
	}

	public String getColumnFilterType() {
		return columnFilterType;
	}

	public void setColumnFilterType(String columnFilterType) {
		this.columnFilterType = columnFilterType;
	}

	public String getSecId() {
		return secId;
	}

	public void setSecId(String secId) {
		this.secId = secId;
	}

	public ColumnHeaderData(String columnId, String formId, String fieldName, String accessor, String columnFilterType,
			String secId) {
		super();
		this.columnId = columnId;
		this.formId = formId;
		this.fieldName = fieldName;
		this.accessor = accessor;
		this.columnFilterType = columnFilterType;
		this.secId = secId;
	}

	public ColumnHeaderData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
