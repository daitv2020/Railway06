package Backend;

import java.util.Scanner;

public class Ex1Q4 {
	Department d1 = new Department();
	Department d2 = new Department();
	Department d3 = new Department();
	Department[] departments = {d1,d2,d3};
	

	public void getIndex() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap index ban muon");
		int n = scanner.nextInt();
		
		
		try {
			System.out.println(departments[n].toString());
		} catch (Exception e) {
			System.out.println("Khong co phan tu nay");
		}
		

	}

}
