package com.vti.entity.Encapsulation.Ex4;

public class Account {

	private	String	id;
	private	String	name;
	private	int		balance;
	
	
	public Account(String id, String name, int balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}


	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}




	
	
	
}
