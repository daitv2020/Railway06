package Entity;

public class MyMath {

	public static double min(double a, double b) {
		if (a > b) {
			return b;
		} else {
			return a;
		}
	}

	public static double sum(double a, double b) {

		return (a + b);

	}

	public static double max(double a, double b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

}
