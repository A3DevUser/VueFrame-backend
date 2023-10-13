package com.Backend.VueFrame.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VF_FIELD_DETAILS")
public class FieldData {
	
	@Id
	@Column(name="FIELD_ID")
	private String fieldId;
	
	@Column(name = "FORM_ID")
	private String formId;
	
	@Column(name = "FIELD_NAME")
	private String fieldName;
	
	@Column(name = "FIELD_STORED_VALUE")
	private String classNameVal;
	
	@Column(name = "FIELD_TYPE")
	private String typeVal;
	
	@Column(name = "DROPDOWN_VALUE")
	private String dropVal;
	
	
	@Column(name = "HEIGHT")
	private String heightVal;
	
	
	@Column(name = "WIDTH")
	private String widthVal;
	
	
	@Column(name = "CLASS_NAME")
	private String className;
	
	@Column(name = "NAME")
	private String name;

	
	
	
	
	public String getFieldId() {
		return fieldId;
	}

	public void setFieldId(String fieldId) {
		this.fieldId = fieldId;
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

	public String getClassNameVal() {
		return classNameVal;
	}

	public void setClassNameVal(String classNameVal) {
		this.classNameVal = classNameVal;
	}

	public String getTypeVal() {
		return typeVal;
	}

	public void setTypeVal(String typeVal) {
		this.typeVal = typeVal;
	}

	public String getDropVal() {
		return dropVal;
	}

	public void setDropVal(String dropVal) {
		this.dropVal = dropVal;
	}

	public String getHeightVal() {
		return heightVal;
	}

	public void setHeightVal(String heightVal) {
		this.heightVal = heightVal;
	}

	public String getWidthVal() {
		return widthVal;
	}

	public void setWidthVal(String widthVal) {
		this.widthVal = widthVal;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public FieldData(String fieldId, String formId, String fieldName, String classNameVal, String typeVal,
			String dropVal, String heightVal, String widthVal, String className, String name) {
		super();
		this.fieldId = fieldId;
		this.formId = formId;
		this.fieldName = fieldName;
		this.classNameVal = classNameVal;
		this.typeVal = typeVal;
		this.dropVal = dropVal;
		this.heightVal = heightVal;
		this.widthVal = widthVal;
		this.className = className;
		this.name = name;
	}

	public FieldData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

	
	
	

}
