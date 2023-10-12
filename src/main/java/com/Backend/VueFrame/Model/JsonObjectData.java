package com.Backend.VueFrame.Model;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="VF_JSON_OBJECT_TBL")
public class JsonObjectData {
	
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    @JsonProperty("actionId")
	    private String ActionId;
	    private String ActionName;
	    @ElementCollection
	    private List<Account> AccountId;
	    @ElementCollection
	    private List<Issue> issueId;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getActionId() {
			return ActionId;
		}
		public void setActionId(String actionId) {
			ActionId = actionId;
		}
		public String getActionName() {
			return ActionName;
		}
		public void setActionName(String actionName) {
			ActionName = actionName;
		}
		public List<Account> getAccountId() {
			return AccountId;
		}
		public void setAccountId(List<Account> accountId) {
			AccountId = accountId;
		}
		public List<Issue> getIssueId() {
			return issueId;
		}
		public void setIssueId(List<Issue> issueId) {
			this.issueId = issueId;
		}
		public JsonObjectData(Long id, String actionId, String actionName, List<Account> accountId,
				List<Issue> issueId) {
			super();
			this.id = id;
			ActionId = actionId;
			ActionName = actionName;
			AccountId = accountId;
			this.issueId = issueId;
		}
		public JsonObjectData() {
			super();
			// TODO Auto-generated constructor stub
		}

	    
	}



