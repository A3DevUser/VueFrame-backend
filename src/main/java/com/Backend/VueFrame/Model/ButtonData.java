package com.Backend.VueFrame.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="VF_BTN_DETAILS")
public class ButtonData {
	
	@Id
	@Column(name = "BTN_ID")
	private String btnId;

	@Column(name = "FORM_ID")
	private String formId;
	
	@Column(name = "BTN_NAME")
	private String btnName;
	
	@Column(name = "BTN_STORED_VALUE")
	private String classNameVal;
	
	@Column(name = "WIDTH")
	private String widthVal;
	
	@Column(name = "HEIGHT")
	private String heightVal;

	public String getBtnId() {
		return btnId;
	}

	public void setBtnId(String btnId) {
		this.btnId = btnId;
	}

	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}

	public String getBtnName() {
		return btnName;
	}

	public void setBtnName(String btnName) {
		this.btnName = btnName;
	}

	public String getClassNameVal() {
		return classNameVal;
	}

	public void setClassNameVal(String classNameVal) {
		this.classNameVal = classNameVal;
	}

	public String getWidthVal() {
		return widthVal;
	}

	public void setWidthVal(String widthVal) {
		this.widthVal = widthVal;
	}

	public String getHeightVal() {
		return heightVal;
	}

	public void setHeightVal(String heightVal) {
		this.heightVal = heightVal;
	}

	public ButtonData(String btnId, String formId, String btnName, String classNameVal, String widthVal,
			String heightVal) {
		super();
		this.btnId = btnId;
		this.formId = formId;
		this.btnName = btnName;
		this.classNameVal = classNameVal;
		this.widthVal = widthVal;
		this.heightVal = heightVal;
	}

	public ButtonData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
	
	
}
