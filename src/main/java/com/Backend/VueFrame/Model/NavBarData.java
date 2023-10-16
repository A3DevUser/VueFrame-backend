package com.Backend.VueFrame.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VF_NAVBAR_DETAILS")
public class NavBarData {
	
	@Id
	@Column(name = "NAV_ID")
	private String navId;

	@Column(name = "FORM_ID")
	private String formId;
	
	@Column(name = "NAV_NAME")
	private String navName;
	
	@Column(name = "NAV_STORED_VALUE")
	private String navStoredValue;
	
	@Column (name = "NAVIGATE")
	private String navigate;

	public String getNavId() {
		return navId;
	}

	public void setNavId(String navId) {
		this.navId = navId;
	}

	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}

	public String getNavName() {
		return navName;
	}

	public void setNavName(String navName) {
		this.navName = navName;
	}

	public String getNavStoredValue() {
		return navStoredValue;
	}

	public void setNavStoredValue(String navStoredValue) {
		this.navStoredValue = navStoredValue;
	}

	public String getNavigate() {
		return navigate;
	}

	public void setNavigate(String navigate) {
		this.navigate = navigate;
	}

	
	public NavBarData(String navId, String formId, String navName, String navStoredValue, String navigate) {
		super();
		this.navId = navId;
		this.formId = formId;
		this.navName = navName;
		this.navStoredValue = navStoredValue;
		this.navigate = navigate;
	}

	public NavBarData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
