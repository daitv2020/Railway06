package Frontend;

import Backend.Ex2Q2_Student;
import Entity_Ex2.MyMath;
import Entity_Ex2.Q3_PrimaryStudent;
import Entity_Ex2.Q3_SecondaryStudent;

public class FinalProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		question1();
//		question2();
//		question3();

	}

	private static void question1() {
		// TODO Auto-generated method stub

		MyMath mymath = new MyMath();
		System.out.println(mymath.sum(4));

	}

	private static void question2() {
		// TODO Auto-generated method stub

		Ex2Q2_Student run = new Ex2Q2_Student();
		run.q2();

	}

	private static void question3() {

		Q3_PrimaryStudent.study();
		Q3_SecondaryStudent.study();

	}

}
