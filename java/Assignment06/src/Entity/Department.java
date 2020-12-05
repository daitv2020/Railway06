package Entity;

import java.util.Scanner;

import Backend.ScannerUtils;

public class Department {
	private  byte id;
	private  String name;
	
	ScannerUtils sc = new ScannerUtils();
//	Scanner scanner = new Scanner(System.in);
	
	public Department() {
		input();
	}


	public Department(byte id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public void input() {
		System.out.println("Vui long nhap id");
//		this.id = scanner.nextByte();
		this.id = (byte) sc.inputInt("Vui long nhap lai id");
		
		System.out.println("Vui long nhap ten phong ban");
//		this.name = scanner.nextLine();
		this.name = sc.inputString("Vui long nhap lai ten phong ban");
	}


	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
}
