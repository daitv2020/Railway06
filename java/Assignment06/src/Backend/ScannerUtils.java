package Backend;

import java.util.Scanner;

public class ScannerUtils {

	// inputInt
	public static int inputInt(String errorMessage) {
		while (true) {
			try {
				Scanner scanner = new Scanner(System.in);
				int i = scanner.nextInt();
				scanner.nextLine();
				return i;

			} catch (Exception e) {
				System.err.println(errorMessage);

			}

		}
	}

	// inputFloat
	public static float inputFloat(String errorMessage) {
		while (true) {
			try {
				Scanner scanner = new Scanner(System.in);
				return scanner.nextFloat();

			} catch (Exception e) {
				System.out.println(errorMessage);
			}
		}

	}

	// inputDouble();
	public static double inputDouble(String errorMessage) {
		while (true) {
			try {
				Scanner scanner = new Scanner(System.in);
				return scanner.nextDouble();

			} catch (Exception e) {
				System.out.println(errorMessage);
			}

		}
	}

	// inputString();
	public static String inputString(String errorMessage) {

		while (true) {
			Scanner scanner = new Scanner(System.in);
			String name = scanner.nextLine().trim();
			if (name.equals(null)) {
				System.out.println(errorMessage);
				return "";
			} else {
				return name;

			}
		}
	}

	public static int inputAge() {
		while (true) {
			int age = inputInt("Wrong inputing! Please input an age as int, input again.");
			
			if (age <= 0) {
				System.out.println("Wrong inputing! The age must be greater than 0, please input again.");
				return 0;
			} else {
				return age;
			}
		}
	}

}
