package com.Backend.VueFrame.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VF_SECTION_DETAILS")
public class SectionData {
	
	@Id
	@Column(name = "SEC_ID")
	private String secId;
	
	@Column(name = "FORM_ID")
	private String formId;
	
	@Column(name = "SEC_NAME")
	private String secName;
	
	@Column(name = "SEC_STORED_VALUE")
	private String secStoredValue;

	public String getSecId() {
		return secId;
	}

	public void setSecId(String secId) {
		this.secId = secId;
	}

	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}

	public String getSecName() {
		return secName;
	}

	public void setSecName(String secName) {
		this.secName = secName;
	}

	public String getSecStoredValue() {
		return secStoredValue;
	}

	public void setSecStoredValue(String secStoredValue) {
		this.secStoredValue = secStoredValue;
	}

	public SectionData(String secId, String formId, String secName, String secStoredValue) {
		super();
		this.secId = secId;
		this.formId = formId;
		this.secName = secName;
		this.secStoredValue = secStoredValue;
	}

	public SectionData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
