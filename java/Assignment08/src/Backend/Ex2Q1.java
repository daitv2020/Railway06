package Backend;

import java.util.ArrayList;
import java.util.Collections;

import Entity_Ex2.Student;

public class Ex2Q1 {
	static ArrayList<Student> students = new ArrayList<>();

	public static void inputStudent() {
		Student st1 = new Student("Nam");
		Student st2 = new Student("Van");
		Student st3 = new Student("Thanh");
		Student st4 = new Student("Linh");
		Student st5 = new Student("Trang");

		students.add(st1);
		students.add(st2);
		students.add(st3);
		students.add(st4);
		students.add(st5);

	}
	
	public static void sapxep() {
		Collections.sort(students);
		System.out.println(students);
	}
	

}
