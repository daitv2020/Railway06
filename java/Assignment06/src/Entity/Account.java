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

	static ScannerUtils sc = new ScannerUtils();

	public Account() {
		input();
		try {
			inputAge();
		} catch (InvalidAgeInputingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			inputAccountAge();
		} catch (InvalidAgeInputingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap id");
		id = sc.inputInt("Vui long nhap lại id");
		scanner.nextLine();
		System.out.println("Nhap email");
		email = sc.inputString("Vui long nhap lai email");
		System.out.println("Vui long nhap username");
		userName = sc.inputString("Vui long nhap lai userName");
		System.out.println("Vui long nhap so tuoi");
		age = sc.inputInt("Vui long nhap lai tuoi");

	}

	public static int inputAge() throws InvalidAgeInputingException {
		while (true) {

			int age = sc.inputInt("Vui long nhap lai tuoi");
			if (age <= 0) {
				throw new InvalidAgeInputingException("The age must	be greater than 0, input again");
			}else {
				return age;
			}

		}
	}

	public static int inputAccountAge() throws InvalidAgeInputingException {
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
