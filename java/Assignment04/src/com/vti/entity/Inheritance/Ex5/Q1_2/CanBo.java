package com.vti.entity.Inheritance.Ex5.Q1_2;

import java.util.Scanner;

public class CanBo {

	private	String	fullname;
	private	byte	age;
	private Gender	gioitinh;
	private String	address;
	
	public CanBo() {
	}
	
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public byte getAge() {
		return age;
	}
	public Gender getGioitinh() {
		return gioitinh;
	}
	private void setGioitinh(int gioitinh) {
		if(gioitinh ==0) {
			this.gioitinh = Gender.valueOf("MALE");
		}else if(gioitinh == 1) {
			this.gioitinh = Gender.valueOf("FEMALE");
		}else {
			this.gioitinh = Gender.valueOf("UNKNOWN");
		}
		
	}
	public String getAddress() {
		return address;
	}

	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Vui long nhap ho ten: ");
		fullname = scanner.nextLine();
		
		System.out.println("Vui long nhap so tuoi: ");
		age = scanner.nextByte();
		
		System.out.println("Vui long nhap giới tính: 0:Nam , 1:Nu ");
		setGioitinh(scanner.nextInt());
		
		System.out.println("Vui long nhap dia chi ");
		address = scanner.nextLine();
	}
	
	public void getInfo() {
		System.out.println("Ho Ten: " + fullname);
		System.out.println("Tuoi: " + age);
		System.out.println("Gioi tinh: " + gioitinh);
		System.out.println("Dia Chi:" + address);
	}
	@Override
	public String toString() {
		return "CanBo [fullname=" + fullname + ", age=" + age + ", gioitinh=" + gioitinh + ", address=" + address + "]";
	}
	
	
}
