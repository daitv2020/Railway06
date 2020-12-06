package Backend;

import java.util.Scanner;

public class Ex1Q7Q8 {
//	Scanner scanner = new Scanner(System.in);
//	ScannerUtils sc = new ScannerUtils();

	public void q7() {
		System.out.println("Nhap id:");
		System.out.println(ScannerUtils.inputInt("error input Int"));

	}

	public void q8Float() {
		System.out.println("Nhap id:");
		float i = ScannerUtils.inputFloat("error input float");
		System.out.println(i);
	}

	public void q8Double() {
		System.out.println("Nhap id:");
		double i = ScannerUtils.inputDouble("error input double");
		System.out.println(i);
	}

	public void q8String() {
		System.out.println("Nhap name:");
		String str = ScannerUtils.inputString("error input string");
		System.out.println(str);
	}

}
