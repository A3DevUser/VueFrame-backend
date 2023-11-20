package com.Backend.VueFrame.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "WF_EMAIL_CONF")
public class WfEmailConfigData {
	
	@Id
	@Column(name = "EC_ID")
	private String ecId;
	
	@Column(name = "WF_ID")
	private String wfId;
	
	@Column(name = "EMAIL_NAME")
	private String emailName;
	
	@Column(name = "CONF_NAME")
	private String confName;
	
	@Column(name = "SUBJECT")
	private String subject;
	
	@Column(name = "BODY")
	private String body;

	public String getEcId() {
		return ecId;
	}

	public void setEcId(String ecId) {
		this.ecId = ecId;
	}

	public String getWfId() {
		return wfId;
	}

	public void setWfId(String wfId) {
		this.wfId = wfId;
	}

	public String getEmailName() {
		return emailName;
	}

	public void setEmailName(String emailName) {
		this.emailName = emailName;
	}

	public String getConfName() {
		return confName;
	}

	public void setConfName(String confName) {
		this.confName = confName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public WfEmailConfigData(String ecId, String wfId, String emailName, String confName, String subject, String body) {
		super();
		this.ecId = ecId;
		this.wfId = wfId;
		this.emailName = emailName;
		this.confName = confName;
		this.subject = subject;
		this.body = body;
	}

	public WfEmailConfigData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
