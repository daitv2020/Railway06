package com.backend;

import java.util.ArrayList;

import java.util.Scanner;

import com.entity.Ex2Q2_Person;
import com.entity.Ex2Q2_Student;

public class Ex2Q2_RunStudent extends Ex2Q2_RunPerson{

	ArrayList<Ex2Q2_Person> persons = new ArrayList<Ex2Q2_Person>();

	Ex2Q2_Student student = new Ex2Q2_Student();
	
	
	
	
	@Override
	public void inputInfo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ma sinh vien");
		student.setMaSinhVien(scanner.nextLine());
		System.out.println("Nhap diem trung binh");
		student.setDiemTrungBinh(scanner.nextFloat());
		scanner.nextLine();
		System.out.println("Nhap email");
		student.setEmail(scanner.nextLine());
		persons.add(student);
	}
	
	@Override
	public void showInfo() {
		System.out.println("ma sinh vien " + student.getMaSinhVien());
		System.out.println("Diem trung binh " + student.getDiemTrungBinh());
		System.out.println("Email " + student.getEmail());
	}
	
	public boolean isDuocHocBong() {
		return student.getDiemTrungBinh()>=8;
	}
	
	
	
	
	
	
	
}
