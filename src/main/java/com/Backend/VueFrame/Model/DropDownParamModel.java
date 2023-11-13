package com.Backend.VueFrame.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "VF_PARAMETER_DROP")
public class DropDownParamModel {
	
	@Id
	@Column(name="PARAMETER_ID")
	private String paramId;
	
	@Column(name="DROP_ID")
	private String dropId;
	
	@Column(name="PARAMETER_NAME")
	private String paramName;
	
	@Column(name="COLUMN_ACCESSOR")
	private String columnAccessor;
	
	@Column(name = "FORM_ID")
	private String formId;

	public String getparamId() {
		return paramId;
	}

	public void setparamId(String paramId) {
		this.paramId = paramId;
	}
	
	public String getDropId() {
		return dropId;
	}

	public void setDropId(String dropId) {
		this.dropId = dropId;
	}

	public String getParamName() {
		return paramName;
	}

	public void setParamName(String paramName) {
		this.paramName = paramName;
	}

	public String getColumnAccessor() {
		return columnAccessor;
	}

	public void setColumnAccessor(String columnAccessor) {
		this.columnAccessor = columnAccessor;
	}
	


	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}

	

	public DropDownParamModel(String paramId, String dropId, String paramName, String columnAccessor, String formId) {
		super();
		this.paramId = paramId;
		this.dropId = dropId;
		this.paramName = paramName;
		this.columnAccessor = columnAccessor;
		this.formId = formId;
	}

	public DropDownParamModel() {
		super();
		// TODO Auto-generated constructor stub
	}

}
