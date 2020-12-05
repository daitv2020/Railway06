package Backend;

import java.util.Scanner;

public class Ex1Q6 {
	public void inputAge() {

		while (true) {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Moi ban nhap so >= 0 : ");
				int n = scanner.nextInt();
				
				if (n>=0) {
					System.out.println(n);
					return;
				}else {
							
					System.out.println("Wrong inputing! The age must "
							+ "be greater	than 0, please input again.");
				}
			} catch (Exception e) {
				System.out.println("wrong inputing! Please input an age as int, input again.");
			}

		}
	

	}
}
