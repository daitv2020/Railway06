package com.backend;

import java.util.ArrayList;
import java.util.Scanner;

import com.entity.Ex2Q2_Person;

public class Ex2Q2_RunPerson {
	ArrayList<Ex2Q2_Person> persons = new ArrayList<Ex2Q2_Person>(); 
	
	Ex2Q2_Person person = new Ex2Q2_Person();
	

	public void inputInfo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi ban nhap ten");
		person.setName(scanner.nextLine());
		System.out.println("Moi ban nhap gioi tinh");
		person.setGioiTinh(scanner.nextLine());
		System.out.println("Moi ban nhap ngay sinh");
		person.setDateOfBirth(scanner.nextLine());
		System.out.println("Moi ban nhap dia chi");
		person.setAddress(scanner.nextLine());
		persons.add(person);
	}
	
	
	public void showInfo() {
		
		for(Ex2Q2_Person ps: persons) {
			System.out.println(ps);
		}
	}
	
	
}
