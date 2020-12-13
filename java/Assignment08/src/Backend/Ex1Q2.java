package Backend;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import Entity_Ex1.Student;

public class Ex1Q2 {
	static Stack<Student> students = new Stack<>();
	static Queue<Student> sts = new LinkedList<>();
	public static void input() {
		Student st1 = new Student(1,"Nguyen Van Nam");
		Student st2 = new Student(2,"Nguyen Van Huyen");
		Student st3 = new Student(3,"Tran Van Nam");
		Student st4 = new Student(4,"Nguyen Van A");
		students.add(st1);
		students.add(st2);
		students.add(st3);
		students.add(st4);
		sts.add(st1);
		sts.add(st2);
		sts.add(st3);
		sts.add(st4);
	}
//	Tạo 1 method để in ra thứ tự tới của các học sinh theo thứ tự
//	sớm nhất tới muộn nhất
	public static void poll() {
		System.out.println(sts.poll());
		System.out.println(sts.poll());
		System.out.println(sts.poll());
		System.out.println(sts.poll());
	}
//	Tạo 1 method để in ra thứ tự tới của các học sinh theo thứ tự từ
//	muộn nhất tới sớm nhất
	public static void pop() {
		System.out.println(students.pop());
		System.out.println(students.pop());
		System.out.println(students.pop());
		System.out.println(students.pop());
	}
	
	
	
}
