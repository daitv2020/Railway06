package com.entity;

import java.time.LocalDate;

public class Ex2Q2_Person {

	private String name;
	private String gioiTinh;
	private String dateOfBirth;
	private String address;
	
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Ex2Q2_Person() {
		super();
	}

	public Ex2Q2_Person(String name, String gioiTinh, String dateOfBirth, String address) {
		super();
		this.name = name;
		this.gioiTinh = gioiTinh;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Ex2Q2_Person [name=" + name + ", gioiTinh=" + gioiTinh + ", dateOfBirth=" + dateOfBirth + ", address="
				+ address + "]";
	}
	
	
	
	
}
