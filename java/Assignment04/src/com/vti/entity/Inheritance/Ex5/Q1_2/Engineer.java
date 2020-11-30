package com.vti.entity.Inheritance.Ex5.Q1_2;

public class Engineer extends CanBo {
		private	String	nganhdaotao;

		public Engineer() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Engineer(String fullname, byte age, Gender gioitinh, String address, String nganhdaotao) {
			super(fullname, age, gioitinh, address);
			this.nganhdaotao = nganhdaotao;
		}
		
		
}
