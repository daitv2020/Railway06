package com.entity;

import java.util.Scanner;

public class Ex1Q5_Khoi {
		private String ten;
		private String mon;
		
		
		public String getTen() {
			return ten;
		}
		public void setTen(String ten) {
			this.ten = ten;
		}
		public String getMon() {
			if(ten.equals("A")) {
				mon = "Toan, Ly, Hoa";
			}else if (ten.equals("B")) {
				mon = "Toan, Hoa, Sinh";
			}else if (ten.equals("C")) {
				mon = "Van, Su, Dia";
			}else {
				mon = "khong xac dinh";
			}
			return mon;
		}
		
		
		
		
}
