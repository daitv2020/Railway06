package Backend;

import java.util.ArrayList;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import Entity_Ex1.Student;

public class Ex1Q1 {
	ArrayList<Student> students = new ArrayList<Student>();

	public void inputStudent() {
		Student st1 = new Student(1, "tu");
		Student st2 = new Student(2, "van");
		Student st3 = new Student(3, "dai");
		Student st4 = new Student(4, "van");
		Student st5 = new Student(5, "dai");
		students.add(st1);
		students.add(st2);
		students.add(st3);
		students.add(st4);
		students.add(st5);
	}

	public void numberOfStudents() {
		// In ra tong số phần tử của students
		System.out.println("Tong so phan tu: " + students.size());
	}

	public void getPhantu(int i) {
		// Lấy phần tử thứ i của students
		System.out.println("Phan tu thu " + i + ": " + students.get(i));

	}

	public void print() {
		System.out.println("Phan tu dau tien:" + students.get(0));
		// get phan tu cuoi
		System.out.println("Phan tu cuoi cung: " + students.get(students.size() - 1));
	}

	public void add() {
		// Thêm 1 phần tử vào vị trí đầu của students
		Student st6 = new Student();
		students.add(0, st6);
		System.out.println(students);
		// them phan tu vao vi tri cuoi
		Student st7 = new Student();
		students.add(st7);
		System.out.println(students);
	}

	public void reverse() {
		Collections.reverse(students);
		System.out.println(students);
	}

	// tim kiem hoc sinh theo id
	public void findStudentById() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap id hoc sinh");
		int n = scanner.nextInt();
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getId() == n) {
				System.out.println(students.get(i));
			}
		}
	}

	// tim kiem hoc sinh theo ten
	public void findStudentByName() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ten hoc sinh");
		String n = scanner.nextLine();
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getName().equals(n)) {
				System.out.println(students.get(i));
			}
		}
	}

	// Xóa name của student có id = 2;
	public void deleteName() {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getId() == 2) {
				students.get(i).setName("");
				System.out.println(students.get(i));
			}
		}
	}

	// xoa student có id =5
	public void deleteStudent() {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getId() == 5) {
				students.remove(students.get(i));
			}
		}
	}

//	Tạo 1 ArrayList tên là studentCopies và add tất cả students vào
//	studentCopies
	public void studentsCopies() {
		List<Student> studentsCopies = new ArrayList<>();
		studentsCopies.addAll(students);
		System.out.println(studentsCopies.toString());

	}

	// Tạo 1 method để in ra các student có trùng tên
	public void printDuplicate() {
		List<Student> students2 = new ArrayList<>();
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
			for (int j = 0; j < students.size(); j++) {
				System.out.println(students.get(j));
				// nếu listStudent.get(j) có trùng id với
				// listStudent.get(i) thì bỏ qua so sánh bạn khác
				if (students.get(i).getId() == students.get(j).getId())
					continue;
				if (students.get(i).getName().equals(students.get(j).getName())) {
					students2.add(students.get(i));
					break;
				}
			}
		}
		System.out.println(students2);

	}

}
