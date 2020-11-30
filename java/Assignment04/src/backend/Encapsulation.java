package backend;

import com.vti.entity.Inheritance.Ex5.Q1_2.Student;

public class Encapsulation {

	public void question1() {
		Student student1 = new Student("TVD", "BG");
		student1.setScore((float) 8.0);
		student1.PlusScore(1);

		Student student2 = new Student("Hieu", "Hn");
		student2.setScore((float) 7.0);
		student2.PlusScore((float)1.5);
		System.out.println(student1);
		System.out.println(student2);

	}

	public void question2() {

	}

	public void question3() {

	}

}
