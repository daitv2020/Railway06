package com.entity;

import java.util.Scanner;

public class Ex1Q5_ThiSinh {
	
	private String sbd;
	private String name;
	private String address;
	private int mucuutien;
	private Ex1Q5_Khoi khoi;
	
	
	public String getSbd() {
		return sbd;
	}
	public void setSbd(String sbd) {
		this.sbd = sbd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMucuutien() {
		return mucuutien;
	}
	public void setMucuutien(int mucuutien) {
		this.mucuutien = mucuutien;
	}
	public Ex1Q5_Khoi getKhoi() {
		return khoi;
	}
	public void setKhoi(Ex1Q5_Khoi khoi) {
		this.khoi = khoi;
	}
	
	public void input() {

			Scanner scanner = new Scanner(System.in);
			System.out.println("So bao danh ");
			this.setSbd(scanner.nextLine());
			System.out.println("Ho ten thi sinh ");
			this.setName(scanner.nextLine());
			System.out.println("Dia chi ");
			this.setAddress(scanner.nextLine());
			System.out.println("Muc uu tien (tu 1 den 3)  ");
			this.setMucuutien(scanner.nextInt());
			scanner.nextLine();
			System.out.println("Nhap khoi cua thi sinh A hoac B hoac C");
			Ex1Q5_Khoi khoi = new Ex1Q5_Khoi();
			khoi.setTen(scanner.nextLine());
		
		
	}
	@Override
	public String toString() {
		return "Ex1Q5_ThiSinh [sbd=" + sbd + ", name=" + name + ", address=" + address + ", mucuutien=" + mucuutien
				+ ", khoi=" + khoi + "]";
	}
	
	
	
	
	
	
}
