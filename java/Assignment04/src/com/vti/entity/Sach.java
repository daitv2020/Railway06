package com.vti.entity;

public class Sach extends QLTV {
	private	String tenTacGia;
	private	short soTrang;
	

	public Sach(String maTaiLieu, String nhaXB, short soBanPhatHanh, String tenTacGia, short soTrang) {
		super(maTaiLieu, nhaXB, soBanPhatHanh);
		this.tenTacGia = tenTacGia;
		this.soTrang = soTrang;
	}
	public Sach() {
		
	}
	public String getTenTacGia() {
		return tenTacGia;
	}

	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}

	public short getSoTrang() {
		return soTrang;
	}

	public void setSoTrang(short soTrang) {
		this.soTrang = soTrang;
	}
	@Override
	public String toString() {
		return "Sach [tenTacGia=" + tenTacGia + ", soTrang=" + soTrang + ", MaTaiLieu=" + getMaTaiLieu()
				+ ", NhaXB=" + getNhaXB() + ", SoBanPhatHanh=" + getSoBanPhatHanh() + "]";
	}
	
	
	
	
}
