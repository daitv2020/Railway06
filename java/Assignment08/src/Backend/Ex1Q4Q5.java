package Backend;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import Entity_Ex1.Student;

public class Ex1Q4Q5 {

//	Tạo 1 danh sách có chứa name của các student không trùng nhau
//	In ra set đó
	static Set<Student> students = new HashSet<>();

	public static void set() {

		Student st1 = new Student("My Linh");
		Student st2 = new Student("Thuy Linh");
		Student st3 = new Student("Cao Linh");
		Student st4 = new Student("Nhat Linh");
		Student st5 = new Student("Lung Linh");
		students.add(st1);
		students.add(st2);
		students.add(st3);
		students.add(st4);
		students.add(st5);
	}

	public static void printStudent() {
		System.out.println("Danh sach ten hoc sinh:");
		for (Student st: students) {
		System.out.println(st.getName());
		}
	}
	
	public static void sapxep() {
		Set<String> students = new HashSet<>();
		students.add("Lung Linh");
		students.add("My Linh");
		students.add("Thuy Linh");
		students.add("Cao Linh");
		students.add("Nhat Linh");
		List<String> listA = new ArrayList<String>();
		listA.addAll(students); 

	}
	
	

}
