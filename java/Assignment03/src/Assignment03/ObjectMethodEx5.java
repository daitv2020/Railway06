package Assignment03;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.SortedMap;

public class ObjectMethodEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		question1();
//		question2();
//		question3();
//		question4();
//		question5();
		question6();
		
		
		
		
		
		
	}







	private static void question1() {
		// TODO Auto-generated method stub
//		Question 1:
//			In ra thông tin của phòng ban thứ 1 (sử dụng toString())
		account account1 = new account();
		account1.accountId = 1;
		account1.email = "tuvandai@gmail.com";
		account1.userName = "tu van dai";
		account1.createDate= LocalDate.now();
		
		System.out.println(account1.toString());
		
	}
	
	private static void question2() {
		// TODO Auto-generated method stub
//		Question 2:
//			In ra thông tin của tất cả phòng ban (sử dụng toString())
		department department1 = new department();
		department1.departmentId = 1;
		department1.departmentName ="sale";
		
		department department2 = new department();
		department2.departmentId = 2;
		department2.departmentName ="developer";
		
		department[] departments = {department1,department2};
		for(int i =0; i <departments.length; i++) {
			System.out.println("Thong tin department " + i);
			System.out.println(departments[i]);
		}
	}
	
	private static void question3() {
		// TODO Auto-generated method stub
		
//		Question 3:
//			In ra địa chỉ của phòng ban thứ 1
		department department1 = new department();
		department1.departmentId = 1;
		department1.departmentName ="sale";
		
		System.out.println(department1.hashCode());
		
	}

	private static void question4() {
		// TODO Auto-generated method stub
//		Question 4: Kiểm tra xem phòng ban thứ 1 có tên là "Phòng A" không?
		department department1 = new department();
		department1.departmentId = 1;
		department1.departmentName ="sale";
		if(
		department1.departmentName.equals("Phòng A")==true) {
			System.out.println("phòng ban thứ 1 có tên là Phòng A");
		}else {
			System.out.println("phòng ban thứ 1 khong có tên là Phòng A");
		}
	}

	private static void question5() {
		// TODO Auto-generated method stub
//		Question 5: So sánh 2 phòng ban thứ 1 và phòng ban thứ 2 xem có bằng nhau
//		không (bằng nhau khi tên của 2 phòng ban đó bằng nhau)
		
		department department1 = new department();
		department1.departmentId = 1;
		department1.departmentName ="sale";
		
		department department2 = new department();
		department2.departmentId = 2;
		department2.departmentName ="developer";
		if(
				department1.departmentName.equals(department2.departmentName)==true) {
					System.out.println("phòng ban thứ 1 và phòng ban thứ 2 bằng nhau");
				}else {
					System.out.println("phòng ban thứ 1 và phòng ban thứ 2 không bằng nhau");
				}
		}

	private static void question6() {
		// TODO Auto-generated method stub
//		Question 6: Khởi tạo 1 array phòng ban gồm 5 phòng ban, sau đó in ra danh
//		sách phòng ban theo thứ tự tăng dần theo tên (sắp xếp theo vần ABCD)
//		VD:
//		Accounting
//		Boss of director
//		Marketing
//		Sale
//		Waiting room
		
		department[] phongbans = new department[5];
		for(int i =0; i<phongbans.length; i++){
			phongbans[i] = new department();
			phongbans[i].departmentId = i;
			phongbans[i].departmentName = "phong ban " + i;
		}
		for(department dpt : phongbans) {
			System.out.println(dpt);
		}
	}
		// kieu khác
//		department Marketing = new department();
//		Marketing.departmentId = 1;
//		Marketing.departmentName ="Marketing";
//		
//		department Waitingroom = new department();
//		Waitingroom.departmentId = 2;
//		Waitingroom.departmentName ="Waitingroom";
//		
//		department Bossofdirector = new department();
//		Bossofdirector.departmentId = 3;
//		Bossofdirector.departmentName ="Bossofdirector";
//		
//		department Accounting = new department();
//		Accounting.departmentId = 4;
//		Accounting.departmentName ="Accounting";
//		
//		department Sale = new department();
//		Sale.departmentId = 5;
//		Sale.departmentName ="sale";
//		
//
//		department[] dpt1 = {Marketing,Waitingroom,Bossofdirector,Accounting,Sale};
//	
//		Arrays.sort(dpt1);
//		for(department dd:dpt1) {
//			System.out.println(dd.toString());
//		}
//
        		
	
	
}
	


