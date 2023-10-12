package com.Backend.VueFrame.Model;

import javax.persistence.Embeddable;

@Embeddable
public class Account {

	private String accountId;

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public Account(String accountId) {
		super();
		this.accountId = accountId;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
