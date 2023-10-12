package com.Backend.VueFrame.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VF_API_REPO")
public class ApiRepoData {
	
	@Id
	@Column(name = "ID")
	private String id;
	
	@Column(name = "API_ID")
	private String apiId;
	
	@Column(name = "API")
	private String api;
	
	@Column(name = "API_TYPE")
	private String apiType;
	
	@Column(name = "FORM_ID")
	private String formId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getApiId() {
		return apiId;
	}

	public void setApiId(String apiId) {
		this.apiId = apiId;
	}

	public String getApi() {
		return api;
	}

	public void setApi(String api) {
		this.api = api;
	}

	public String getApiType() {
		return apiType;
	}

	public void setApiType(String apiType) {
		this.apiType = apiType;
	}

	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}

	public ApiRepoData(String id, String apiId, String api, String apiType, String formId) {
		super();
		this.id = id;
		this.apiId = apiId;
		this.api = api;
		this.apiType = apiType;
		this.formId = formId;
	}

	public ApiRepoData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
