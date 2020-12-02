package com.backend;
import java.util.ArrayList;


import	com.entity.Ex2Q1_Student;
public class Ex2Q1_RunStudent {
		Ex2Q1_Student st1 = new Ex2Q1_Student(1, "Minh", 1);
		Ex2Q1_Student st2 = new Ex2Q1_Student(2, "Minh", 1);
		Ex2Q1_Student st3 = new Ex2Q1_Student(3, "Trang", 1);
		Ex2Q1_Student st4 = new Ex2Q1_Student(4, "Hien", 2);
		Ex2Q1_Student st5 = new Ex2Q1_Student(5, "Hieu", 2);
		Ex2Q1_Student st6 = new Ex2Q1_Student(6, "Manh", 2);
		Ex2Q1_Student st7 = new Ex2Q1_Student(7, "Vinh", 3);
		Ex2Q1_Student st8 = new Ex2Q1_Student(8, "Linh", 3);
		Ex2Q1_Student st9 = new Ex2Q1_Student(9, "Lanh", 3);
		Ex2Q1_Student st10 = new Ex2Q1_Student(10, "Dung", 3);	
	 	Ex2Q1_Student[] students = {st1,st2,st3,st4,st5,st6,st7,st8,st9,st10};
//		ArrayList<Student> students = new ArrayList<Student>();		
//		public void khoitao() {		
//			for (int i = 0; i < 10; i++) {
//				int group = i % 3;				
//				Student st1 = new Student(i, "Học sinh" + i, group + 1);
//				students.add(st1);
//			}
//			
//		}
		public void diemDanh() {
			// TODO Auto-generated method stub
			for(int i=0; i< students.length; i++) {
				students[i].diemDanh();
			}
		}

		public void hocBai() {
			// TODO Auto-generated method stub
			for(int i=0; i< students.length; i++) {
				if(students[i].getGroup() == 1) {
					students[i].hocBai();;
				}
			}
		}

		public void diDonVeSinh() {
			// TODO Auto-generated method stub
			for(int i=0; i< students.length; i++) {
				if(students[i].getGroup() == 2) {
				students[i].diDonVeSinh();;
				}
			}
		}
}
