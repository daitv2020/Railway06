package com.vti.entity.Inheritance.Ex5.Q1_2;

public class NhanVien extends CanBo {
	private String congviec;

	public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NhanVien(String fullname, byte age, Gender gioitinh, String address, String congviec) {
		super(fullname, age, gioitinh, address);
		this.congviec = congviec;
	}

	public NhanVien(String fullname, byte age, Gender gioitinh, String address) {
		super(fullname, age, gioitinh, address);
		// TODO Auto-generated constructor stub
	}

	public String getCongviec() {
		return congviec;
	}

	public void setCongviec(String congviec) {
		this.congviec = congviec;
	}

}
