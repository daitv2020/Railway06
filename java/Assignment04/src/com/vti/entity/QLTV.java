package com.vti.entity;

public class QLTV {
	private String maTaiLieu;
	private String nhaXB;
	private short soBanPhatHanh;
	
	
	public QLTV() {
	}
	
	
	public QLTV(String maTaiLieu, String nhaXB, short soBanPhatHanh) {
		super();
		this.maTaiLieu = maTaiLieu;
		this.nhaXB = nhaXB;
		this.soBanPhatHanh = soBanPhatHanh;
	}
	public String getMaTaiLieu() {
		return maTaiLieu;
	}
	public void setMaTaiLieu(String maTaiLieu) {
		this.maTaiLieu = maTaiLieu;
	}
	public String getNhaXB() {
		return nhaXB;
	}
	public void setNhaXB(String nhaXB) {
		this.nhaXB = nhaXB;
	}
	public short getSoBanPhatHanh() {
		return soBanPhatHanh;
	}
	public void setSoBanPhatHanh(short soBanPhatHanh) {
		this.soBanPhatHanh = soBanPhatHanh;
	}


	@Override
	public String toString() {
		return "QLTV [maTaiLieu=" + maTaiLieu + ", nhaXB=" + nhaXB + ", soBanPhatHanh=" + soBanPhatHanh + "]";
	}
	
	
}
