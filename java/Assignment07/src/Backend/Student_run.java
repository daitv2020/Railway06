package Backend;

import Entity.Student;

public class Student_run {

	public void student() throws Exception {
		// TODO Auto-generated method stub
		// question 1
		System.out.println("Question 1");
		Student hs1 = new Student(1, "Nguyen Van A");
		Student hs2 = new Student(2, "Nguyen Van B");
		Student hs3 = new Student(3, "Nguyen Van C");
		Student[] students = { hs1, hs2, hs3 };
		for (Student st : students) {
			System.out.println(st);
		}
		System.out.println("\n" + "Doi sang Dai Hoc Cong Nghe");
		Student.college = "Dai Hoc Cong Nghe";
		for (Student st : students) {
			System.out.println(st);
		}
		// question 2
		System.out.println("\nQuestion2 Quy lop");
		System.out.println("B1: Nop quy moi nguoi 100K");
		Student.moneyGroup = Student.moneyGroup + 100 * students.length;
		System.out.println("So tien cong lai cua nhom:" + Student.moneyGroup);
		System.out.println("B2: Student thứ 1 lấy 50k đi mua bim bim, kẹo về liên hoan");
		Student.moneyGroup = Student.moneyGroup - 50;
		System.out.println("So tien con lai cua nhom:" + Student.moneyGroup);
		System.out.println("B3: Student thứ 2 lấy 20k đi mua bánh mì");
		Student.moneyGroup = Student.moneyGroup - 20;
		System.out.println("So tien con lai cua nhom:" + Student.moneyGroup);
		System.out.println("B4: Student thứ 3 lấy 150k đi mua đồ dùng học tập cho nhóm");
		Student.moneyGroup = Student.moneyGroup - 150;
		System.out.println("So tien con lai cua nhom:" + Student.moneyGroup);
		System.out.println("B5: Cả nhóm mỗi người lại đóng quỹ mỗi người 50k");
		Student.moneyGroup = Student.moneyGroup + 50 * students.length;
		System.out.println("So tien con lai cua nhom:" + Student.moneyGroup);

	}


}
