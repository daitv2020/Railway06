package com.vti.entity;

import java.time.LocalDate;

public class question {
	public	int questionId;
	private	String content;
	public	categoryQuestion categoryQuestion;
	public	typeQuestion typeQuestion;
	private	account account;
	LocalDate createDate;
	public	answer[] answerInQuestions;
	
	
	
	
	
	// tạo getter and setter
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public account getAccount() {
		return account;
	}
	public void setAccount(account account) {
		this.account = account;
	}
	
	
	
}
