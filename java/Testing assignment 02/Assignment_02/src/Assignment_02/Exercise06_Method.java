package Assignment_02;

import java.time.LocalDate;

public class Exercise06_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		question1();
		question2();
		question3();
	}


	private static void question1() {
		// TODO Auto-generated method stub
// Question 1: Tạo method để in ra các số chẵn nguyên dương nhỏ hơn 10		
		for(int i=1; i<10; i++) {
			if(i%2 !=0) {
				continue;
			}else {
			
			System.out.println(i);
			}
		}
		
		
	}
	
	private static void question2() {
		// TODO Auto-generated method stub
//		Question 2: Tạo method để in thông tin các account
		// them doi tuong cho account
		account account01 = new account();
		account01.accountId = 1;
		account01.email = "01@gmail.com";
		account01.userName = "TK 01";
		account01.fullName = "Tai Khoan 01";
		account01.createDate = LocalDate.now();
		
		
		
		
		account account02 = new account();
		account02.accountId = 2;
		account02.email = "02@gmail.com";
		account02.userName = "TK 02";
		account02.fullName = "Tai Khoan 02";
		account02.createDate = LocalDate.now();
		
		
		
		account account03 = new account();
		account03.accountId = 3;
		account03.email = "03@gmail.com";
		account03.userName = "TK 03";
		account03.fullName = "Tai Khoan 03";
		account03.createDate = LocalDate.now();
		
		account[] accounts = {account01,account02,account03};
		for(int i=0; i<accounts.length; i++) {
			System.out.println("thong tin acount thu " + (i+1));
			System.out.println("id		:"+accounts[i].accountId);
			System.out.println("email		:"+accounts[i].email);
			System.out.println("userName	:"+accounts[i].userName);
			System.out.println("fullName	:"+accounts[i].fullName);
			System.out.println("createDate	:"+accounts[i].createDate);
			System.out.println("\n");
		}
				
	}


	private static void question3() {
		// TODO Auto-generated method stub
	
//	Question 3: Tạo method để in ra các số nguyên dương nhỏ hơn 10
	
		for(int i=1;i<10;i++ ) {
			System.out.println(i);
		}
	
	}
}
