package Entity;

import java.util.Scanner;

public class Student {

	public static int count = 0;
	public int id;
	public String name;
	public static String college = "Dai hoc Back Khoa";
	public static float moneyGroup = 0;

	// Question 5
	public Student(int id, String name) throws Exception {
		super();
		this.id = id;
		this.name = name;
		count++;
		this.limitStudent();
	}

	public Student() throws Exception {
		super();
		count++;
		this.limitStudent();
	}

	// Question 4
	public static void setCollege() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi ban nhap ten college muon doi");
		college = scanner.nextLine();
	}

	public static String getCollege() {
		return college;
	}

	public static void limitStudent() throws Exception {
		if (Student.count > 7) {
			throw new Exception("Khong the tao qua 7 hoc sinh");
		}

	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", college=" + college + "]";
	}

}
