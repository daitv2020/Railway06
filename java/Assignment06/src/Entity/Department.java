package Entity;

import java.util.Scanner;

import Backend.ScannerUtils;

public class Department {
	private  byte id;
	private  String name;
	
	ScannerUtils sc = new ScannerUtils();
//	Scanner scanner = new Scanner(System.in);
	
	public Department() {
		id = inputId();
		name = inputName();
	}


	public Department(byte id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public byte inputId() {
		System.out.println("Vui long nhap id");
//		this.id = scanner.nextByte();
		return this.id = (byte) sc.inputInt("Vui long nhap lai id");

	}
	public String inputName() {
		System.out.println("Vui long nhap ten phong ban");
//		this.name = scanner.nextLine();
		return this.name = sc.inputString("Vui long nhap lai ten phong ban");
	}


	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
}
