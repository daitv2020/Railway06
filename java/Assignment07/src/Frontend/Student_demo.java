package Frontend;

import Backend.Student_run;
import Entity.PrimaryStudent;
import Entity.SecondaryStudent;
import Entity.Student;

public class Student_demo {

	public static void main(String[] args) throws Exception {
		Student st0 = new Student();
		Student st1 = new PrimaryStudent();
		Student st2 = new PrimaryStudent();
		Student st3 = new SecondaryStudent();
		Student st4 = new SecondaryStudent();
		Student st5 = new SecondaryStudent();
		Student st6 = new SecondaryStudent();

		System.out.println(Student.count);
		// question 7
		Student st9 = new Student();
		System.out.println(Student.count);
		// TODO Auto-generated method stub
		// question 1,2
//		Student_run run = new Student_run();
//		run.student();

		// question 4
//		Student.setCollege();
//		System.out.println(Student.getCollege());
//		Student st = new Student(1, "Tu Van");
//		System.out.println(st);

		// question 5
//		System.out.println("\nSo luong hoc sinh la: " + Student.count);

		// question 6
//		System.out.println(Student.count);
//		System.out.println(PrimaryStudent.countPrimaryStudent);
//		System.out.println(SecondaryStudent.countSecondaryStudent);

	}

}
