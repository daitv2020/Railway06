package com.vti.entity.Inheritance.Ex5.Q1_2;

public class Worker extends CanBo {
	private byte level;

	public Worker() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Worker(String fullname, byte age, Gender gioitinh, String address, byte level) {
		super(fullname, age, gioitinh, address);
		this.level = level;

	}

	public Worker(String fullname, byte age, Gender gioitinh, String address) {
		super(fullname, age, gioitinh, address);
		// TODO Auto-generated constructor stub
	}

	public byte getLevel() {
		return level;
	}

	public void setLevel(byte level) {
		this.level = level;
	}

}
