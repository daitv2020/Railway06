package Backend;

import java.util.Scanner;

public class Ex1Q5 {

	public void inputAge() {

		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Moi ban nhap so > = 0");
			int n = scanner.nextInt();
			System.out.println(n);
			if (n < 0) {
				System.out.println("Wrong inputing! The age must be greater	than 0, please input again.");
			}
		} catch (Exception e) {
			System.out.println("wrong inputing! Please input an age as int, input again.");
		}
	}

}
