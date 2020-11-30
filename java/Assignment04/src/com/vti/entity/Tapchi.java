package com.vti.entity;

public class Tapchi extends QLTV{
	private	String soPhatHanh;
	private	int thangPhatHanh;
	
	public Tapchi(String maTaiLieu, String nhaXB, short soBanPhatHanh, String soPhatHanh, int thangPhatHanh) {
		super(maTaiLieu, nhaXB, soBanPhatHanh);
		this.soPhatHanh = soPhatHanh;
		this.thangPhatHanh = thangPhatHanh;
	}
	public Tapchi() {
		
	}
	public String getSoPhatHanh() {
		return soPhatHanh;
	}
	public void setSoPhatHanh(String soPhatHanh) {
		this.soPhatHanh = soPhatHanh;
	}
	public int getThangPhatHanh() {
		return thangPhatHanh;
	}
	public void setThangPhatHanh(int thangPhatHanh) {
		this.thangPhatHanh = thangPhatHanh;
	}
	@Override
	public String toString() {
		return "Tapchi [soPhatHanh=" + soPhatHanh + ", thangPhatHanh=" + thangPhatHanh + ", MaTaiLieu="
				+ getMaTaiLieu() + ", NhaXB=" + getNhaXB() + ", SoBanPhatHanh=" + getSoBanPhatHanh() + "]";
	}
	
	
	
	
}
