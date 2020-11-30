package com.vti.entity;

import java.time.LocalDate;
import java.util.Arrays;

public class account {
	public	int accountId;
	private	String email;
	private	String userName;
	private	String fullName;
	private LocalDate createDate;
	private department department;
	private position position;
	private group[] groups;
	
	// tạo constructor không có parameter
	public account() {
		super();
	}

	// Có các parameter là id, Email, Username, FirstName,LastName (với FullName = FirstName + LastName)
	public account(int accountId, String email, String userName, String firstName, String lastName) {
		super();
		this.accountId = accountId;
		this.email = email;
		this.userName = userName;
		this.fullName = firstName + lastName;
	}
//	Có các parameter là id, Email, Username, FirstName,
//	LastName (với FullName = FirstName + LastName) và
//	Position của User, default createDate = now
	public account(int accountId, String email, String userName, String firstName, String lastName,
			com.vti.entity.position position) {
		super();
		this.accountId = accountId;
		this.email = email;
		this.userName = userName;
		this.fullName = firstName + lastName;
		this.createDate = LocalDate.now();
		this.position = position;
	}
//	d) Có các parameter là id, Email, Username, FirstName,
//	LastName (với FullName = FirstName + LastName) và
//	Position của User, createDate
	public account(int accountId, String email, String userName, String firstName, String lastName, LocalDate createDate,
			com.vti.entity.position position) {
		super();
		this.accountId = accountId;
		this.email = email;
		this.userName = userName;
		this.fullName = firstName + lastName;
		this.createDate = createDate;
		this.position = position;
	}





	@Override
	public String toString() {
		return "account [accountId=" + accountId + ", email=" + email + ", userName=" + userName + ", fullName="
				+ fullName + ", createDate=" + createDate + ", department=" + department + ", position=" + position
				+ ", groups=" + Arrays.toString(groups) + "]";
	}


	
	// tạo getter and setter

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public department getDepartment() {
		return department;
	}

	public void setDepartment(department department) {
		this.department = department;
	}

	public position getPosition() {
		return position;
	}

	public void setPosition(position position) {
		this.position = position;
	}

	public group[] getGroups() {
		return groups;
	}

	public void setGroups(group[] groups) {
		this.groups = groups;
	}

	
	
	
	
	
	
	
	
}
