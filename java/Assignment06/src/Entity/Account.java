package Entity;

import java.time.LocalDate;

import java.util.Arrays;
import java.util.Scanner;

import Backend.ScannerUtils;

public class Account {
	int id;
	String email;
	String userName;
	String fullName;
	Department department;
	Position position;
	LocalDate createDate;
	int age;
	Group[] groups;
	
	ScannerUtils sc = new ScannerUtils();
	
	public Account() throws InvalidAgeInputingException {
		input();
		inputAccountAge();
	}
	public void input() {

		System.out.println("Nhap id");
		id = sc.inputInt("Vui long nhap lại id");
		System.out.println("Nhap email");
		email = sc.inputString("Vui long nhap lai email");
		System.out.println("Vui long nhap username");
		userName = sc.inputString("Vui long nhap lai userName");


	}

	public int inputAge() throws InvalidAgeInputingException {
		while (true) {
			System.out.println("Vui long nhap so tuoi");
			int age = sc.inputInt("Vui long nhap lai tuoi");
			if (age <= 0) {
				throw new InvalidAgeInputingException("The age must	be greater than 0, input again");
			}else {
				return age;
			}

		}
	}

	public int inputAccountAge() throws InvalidAgeInputingException {
		while(true) {
			try {
				int age = inputAge();
				if(age >= 18) {
					return age;				
				}else {
					System.err.println("Your age must be greater than 18, input again");
				}
			} catch (InvalidAgeInputingException e) {
				System.out.println(e.getMessage());
			}
			
			
			
		}

	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", email=" + email + ", userName=" + userName + ", fullName=" + fullName
				+ ", department=" + department + ", position=" + position + ", createDate=" + createDate + ", age="
				+ age + ", groups=" + Arrays.toString(groups) + "]";
	}

}
