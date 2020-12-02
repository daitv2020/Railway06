package com.entity;

import com.backend.Ex2Q2_RunPerson;

public class Ex2Q2_Student extends Ex2Q2_Person {
	
		private String maSinhVien;
		private float diemTrungBinh;
		private String email;
		
		public String getMaSinhVien() {
			return maSinhVien;
		}
		public void setMaSinhVien(String maSinhVien) {
			this.maSinhVien = maSinhVien;
		}
		public float getDiemTrungBinh() {
			return diemTrungBinh;
		}
		public void setDiemTrungBinh(float diemTrungBinh) {
			this.diemTrungBinh = diemTrungBinh;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public Ex2Q2_Student() {
			super();
		}

		
		public Ex2Q2_Student(String name, String gioiTinh, String dateOfBirth, String address, String maSinhVien,
				float diemTrungBinh, String email) {
			super(name, gioiTinh, dateOfBirth, address);
			this.maSinhVien = maSinhVien;
			this.diemTrungBinh = diemTrungBinh;
			this.email = email;
		}
		@Override
		public String toString() {
			return "Ex2Q2_Student [maSinhVien=" + maSinhVien + ", diemTrungBinh=" + diemTrungBinh + ", email=" + email
					+ ", toString()=" + super.toString() + "]";
		}
		
		
		
		
	
		}

		
		
		
		
		
		
		
		
		
		
		
		
	

	
	
	
	

