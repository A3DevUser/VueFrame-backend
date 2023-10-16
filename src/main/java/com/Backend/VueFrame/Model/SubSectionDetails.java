package com.Backend.VueFrame.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VF_SUB_SECTION_DETAILS")
public class SubSectionDetails {
	
	
	@Id
	@Column(name = "SUB_SEC_ID")
	private String subSecId;
	
	@Column(name = "FORM_ID")
	private String formId;
	
	@Column(name = "SEC_ID")
	private String secId;
	
	@Column(name = "SUB_SEC_NAME")
	private String subSecName;
	
	@Column(name = "SUB_SEC_TYPE")
	private String subSecType;
	
	@Column(name = "SUB_SEC_WIDTH")
	private String subSecWidth;
	
	@Column(name = "SUB_SEC_IS_OPEN")
	private String subSecIsOpen;

	
	
	public String getSubSecId() {
		return subSecId;
	}

	public void setSubSecId(String subSecId) {
		this.subSecId = subSecId;
	}

	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}

	public String getSecId() {
		return secId;
	}

	public void setSecId(String secId) {
		this.secId = secId;
	}

	public String getSubSecName() {
		return subSecName;
	}

	public void setSubSecName(String subSecName) {
		this.subSecName = subSecName;
	}

	public String getSubSecType() {
		return subSecType;
	}

	public void setSubSecType(String subSecType) {
		this.subSecType = subSecType;
	}

	public String getSubSecWidth() {
		return subSecWidth;
	}

	public void setSubSecWidth(String subSecWidth) {
		this.subSecWidth = subSecWidth;
	}
	
	

	public String getSubSecIsOpen() {
		return subSecIsOpen;
	}

	public void setSubSecIsOpen(String subSecIsOpen) {
		this.subSecIsOpen = subSecIsOpen;
	}

	

	public SubSectionDetails(String subSecId, String formId, String secId, String subSecName, String subSecType,
			String subSecWidth, String subSecIsOpen) {
		super();
		this.subSecId = subSecId;
		this.formId = formId;
		this.secId = secId;
		this.subSecName = subSecName;
		this.subSecType = subSecType;
		this.subSecWidth = subSecWidth;
		this.subSecIsOpen = subSecIsOpen;
	}

	public SubSectionDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	

}
