package com.vti.backend;

import java.time.LocalDate;

public class ConstructorEx1 {


	public void question1() {
		// TODO Auto-generated method stub
//		Question 1:
//			Tạo constructor cho department:
//			a) không có parameters
//			b) Có 1 parameter là nameDepartment và default id của Department = 0
//			Khởi tạo 1 Object với mỗi constructor ở trên
		
		//Khởi tạo object với mỗi constructor
		department department = new department();
		department department1 = new department("develop");
		
		// in ra
		System.out.println(department);
		System.out.println(department1);
		
	}

	public void question2() {
		position p1 = new position();
		p1.positionId = 1;
		position p2 = new position();
		p2.positionId = 2;
		
		
		// TODO Auto-generated method stub
//		Question 2:
//			Tạo constructor cho Account:
//			a) Không có parameters
//			b) Có các parameter là id, Email, Username, FirstName,
//			LastName (với FullName = FirstName + LastName)
//			c) Có các parameter là id, Email, Username, FirstName,
//			LastName (với FullName = FirstName + LastName) và
//			Position của User, default createDate = now
//			d) Có các parameter là id, Email, Username, FirstName,
//			LastName (với FullName = FirstName + LastName) và
//			Position của User, createDate
//			Khởi tạo 1 Object với mỗi constructor ở trên
		
		account account1 = new account();
		account account2 = new account(2,"acc2@gmail.com","acc2","acc ","so 02");
		account account3 = new account(3,"acc3@gmail.com","acc3","acc ","so 03", p1);
		account account4 = new account(4,"acc4@gmail.com","acc4","acc ","so 04", LocalDate.parse("2020-01-01"),p2);
		
		//print
		System.out.println(account1);
		System.out.println(account2);
		System.out.println(account3);
		System.out.println(account4);
		
	}

	public void question3() {
		position p1 = new position();
		p1.positionId = 1;
		position p2 = new position();
		p2.positionId = 2;
		
		account account1 = new account();
		account account2 = new account(2,"acc2@gmail.com","acc2","acc ","so 02");
		account account3 = new account(3,"acc3@gmail.com","acc3","acc ","so 03", p1);
		account account4 = new account(4,"acc4@gmail.com","acc4","acc ","so 04", LocalDate.parse("2020-01-01"),p2);
		account[] accounts = {account1, account2, account3, account4};
		String[] usernames = {"acc2","acc3","acc4"};
		// TODO Auto-generated method stub
//		Question 3:
//			Tạo constructor cho Group:
//			a) không có parameters
//			b) Có các parameter là GroupName, Creator, array Account[]
//			accounts, CreateDate
//			c) Có các parameter là GroupName, Creator, array String[]
//			usernames , CreateDate
//			Với mỗi username thì sẽ khởi tạo 1 Account (chỉ có thông tin
//			username, các thông tin còn lại = null).
//			Khởi tạo 1 Object với mỗi constructor ở trên
		
		group group1 = new group();
		group group2 = new group("group1",account1, LocalDate.parse("2020-11-11"),accounts);
		group group3 = new group("group2",account2, LocalDate.parse("2020-10-10"), usernames);
		System.out.println(group1);
		System.out.println(group2);
		System.out.println(group3);
	}
	

}











