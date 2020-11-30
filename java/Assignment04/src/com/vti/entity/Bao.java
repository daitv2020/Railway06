package com.vti.entity;

import java.time.LocalDate;

public class Bao extends QLTV{
	private LocalDate ngayPhatHanh;

	public Bao(String maTaiLieu, String nhaXB, short soBanPhatHanh, LocalDate ngayPhatHanh) {
		super(maTaiLieu, nhaXB, soBanPhatHanh);
		this.ngayPhatHanh = ngayPhatHanh;
	}

	public Bao() {
		
	}
	
	public LocalDate getNgayPhatHanh() {
		return ngayPhatHanh;
	}

	public void setNgayPhatHanh(LocalDate ngayPhatHanh) {
		this.ngayPhatHanh = ngayPhatHanh;
	}

	@Override
	public String toString() {
		return "Bao [ngayPhatHanh=" + ngayPhatHanh + ", MaTaiLieu=" + getMaTaiLieu() + ",NhaXB=" + getNhaXB()
				+ ", SoBanPhatHanh=" + getSoBanPhatHanh() + "]";
	}

	
	
}
