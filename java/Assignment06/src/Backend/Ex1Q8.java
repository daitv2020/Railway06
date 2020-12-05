package Backend;

import java.util.Scanner;

public class Ex1Q8 {
	Scanner scanner = new Scanner(System.in);

	// inputfloat()
	public void inputFloat(String errorMessage) {
		while (true) {
			try {

				System.out.println("Vui long nhap id");
				float id = scanner.nextFloat();
				System.out.println("Vui long nhap tuoi");
				float age = scanner.nextFloat();
				System.out.println("id: " + id);
				System.out.println("age: " + age);
				return;

			} catch (Exception e) {
				System.out.println(errorMessage);
				return;
			}
		}

	}

	// inputDouble();
	public void inputDouble(String errorMessage) {
		while (true) {
			try {

				System.out.println("Vui long nhap id");
				double id = scanner.nextDouble();
				System.out.println("Vui long nhap tuoi");
				double age = scanner.nextDouble();
				System.out.println("id: " + id);
				System.out.println("age: " + age);
				return;

			} catch (Exception e) {
				System.out.println(errorMessage);
				return;
			}

		}
	}

	// inputString();
	public void inputString(String errorMessage) throws Exception {

		while (true) {
			System.out.println("Nhap ho ten cua ban theo dang chu");
			String name = scanner.nextLine();
			name = name.trim();

			if (!name.isEmpty()) {
				System.out.println("Ho ten: " + name);
				return;
			} else {
				throw new Exception(errorMessage);
			}
		}
	}

}
