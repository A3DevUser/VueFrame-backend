package com.Backend.VueFrame.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Action {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String actionId;
    private String actionName;
    
//    
//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "action_account", joinColumns = @JoinColumn(name = "action_id"), inverseJoinColumns = @JoinColumn(name = "account_id"))
//    private List<Account> accounts;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getActionId() {
		return actionId;
	}
	public void setActionId(String actionId) {
		this.actionId = actionId;
	}
	public String getActionName() {
		return actionName;
	}
	public void setActionName(String actionName) {
		this.actionName = actionName;
	}
	public Action(Long id, String actionId, String actionName) {
		super();
		this.id = id;
		this.actionId = actionId;
		this.actionName = actionName;
	}
	public Action() {
		super();
		// TODO Auto-generated constructor stub
	}

}
	    
	



