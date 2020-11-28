package com.vti.entity;

import java.time.LocalDate;
import java.util.Arrays;

public class group {
	public	int groupId;
	public	String groupName;
	private	account account;
	LocalDate createDate;
	String[] usernames;
	
	account[] accounts;

	// không có parameters
	public group() {
		super();
	}
	//Có các parameter là GroupName, Creator, array Account[] accounts, CreateDate

	public group(String groupName, com.vti.entity.account account, LocalDate createDate,
			com.vti.entity.account[] accounts) {
		super();
		this.groupId = groupId;
		this.groupName = groupName;
		this.account = account;
		this.createDate = createDate;
		this.accounts = accounts;
	}
	// c) Có các parameter là GroupName, Creator, array String[] usernames , CreateDate
	public group(String groupName, com.vti.entity.account account, LocalDate createDate, String[] usernames) {
		super();
		this.groupName = groupName;
		this.account = account;
		this.createDate = createDate;
		this.usernames = usernames;
	}

	@Override
	public String toString() {
		return "group [groupId=" + groupId + ", groupName=" + groupName + ", account=" + account + ", createDate="
				+ createDate + ", usernames=" + Arrays.toString(usernames) + ", accounts=" + Arrays.toString(accounts)
				+ "]";
	}

// tạo getter and setter
	public account getAccount() {
		return account;
	}

	public void setAccount(account account) {
		this.account = account;
	}
	


	
	
}
