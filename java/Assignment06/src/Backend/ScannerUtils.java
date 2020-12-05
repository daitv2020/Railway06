package Backend;

import java.util.Scanner;

public class ScannerUtils {
	static Scanner scanner = new Scanner(System.in);

	// inputInt
	public static int inputInt(String errorMessage) {
		while (true) {
			try {
				return Integer.valueOf(scanner.nextInt());
				
			} catch (Exception e) {
				System.out.println(errorMessage);
				return 0;
			}

		}
	}

	// inputFloat
	public static float inputFloat(String errorMessage) {
		while (true) {
			try {
				return Float.valueOf(scanner.nextFloat());

			} catch (Exception e) {
				System.out.println(errorMessage);
				return 0;
			}
		}

	}

	// inputDouble();
	public static double inputDouble(String errorMessage) {
		while (true) {
			try {
				return Double.valueOf(scanner.nextDouble());

			} catch (Exception e) {
				System.out.println(errorMessage);
				return 0;
			}

		}
	}

	// inputString();
	public static String inputString(String errorMessage)  {

		while (true) {
			
				String name = scanner.nextLine().trim();
			if (name.equals(null)) {
				System.out.println(errorMessage);
				return "";
			}else{
				return name;
				
			}
		}
	}
	
	public static int inputAge() {
		while (true) {
			int age = inputInt("Wrong inputing! Please input an age as int, input again.");

			if (age <= 0) {
				System.out.println("Wrong inputing! The age must be greater than 0, please input again.");

			} else {
				return age;
			}
		}
	}
	
	
	
	

}
