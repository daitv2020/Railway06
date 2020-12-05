package Backend;

import java.util.Scanner;

public class Ex1Q7Q8 {
	Scanner scanner = new Scanner(System.in);
	ScannerUtils sc = new ScannerUtils();

	public void q7() {
		System.out.println("Nhap id:");
		sc.inputInt("error input Int");

	}

	public void q8Float() {
		System.out.println("Nhap id:");
		sc.inputFloat("error input float");
	}

	public void q8Double() {
		System.out.println("Nhap id:");
		sc.inputDouble("error input double");
	}

	public void q8String() {
		System.out.println("Nhap name:");
		sc.inputString("error input string");
	}

}
