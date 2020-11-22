package Assignment_02;

import java.time.LocalDate;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// them doi tuong cho department
		department department01 = new department();
		department01.departmentId = 1;
		department01.departmentName = "sale";
		
		
		department department02 = new department();
		department02.departmentId = 2;
		department02.departmentName = "QA";
		
		
		department department03 = new department();
		department03.departmentId = 3;
		department03.departmentName = "marketing";
		
		
		
		// them doi tuong cho position
		position position01 = new position();
		position01.positionId = 1;
		position01.positionName = PositionName.DEV;
		
		position position02 = new position();
		position02.positionId = 2;
		position02.positionName = PositionName.TEST;
		
		
		position position03 = new position();
		position03.positionId = 3;
		position03.positionName = PositionName.PM;
		
		
	
		// them doi tuong cho account
		account account01 = new account();
		account01.accountId = 1;
		account01.email = "01@gmail.com";
		account01.userName = "TK 01";
		account01.fullName = "Tai Khoan 01";
		account01.department = department02;
		account01.position = position02;
		account01.createDate = LocalDate.now();
		
		
		account account02 = new account();
		account02.accountId = 2;
		account02.email = "02@gmail.com";
		account02.userName = "TK 02";
		account02.fullName = "Tai Khoan 02";
		account02.department = department02;
		account02.position = position03;
		account02.createDate = LocalDate.now();
		
		
		
		account account03 = new account();
		account03.accountId = 3;
		account03.email = "03@gmail.com";
		account03.userName = "TK 03";
		account03.fullName = "Tai Khoan 03";
		account03.department = department03;
		account03.position = position01;
		account03.createDate = LocalDate.now();
		
		
		// Them doi tuong cho group
		group group01 = new group();
		group01.groupId = 1;
		group01.groupName = "group 1";
		group01.account = account03;
		group01.createDate = LocalDate.of(2010, 12, 20);
		
				
		group group02 = new group();
		group02.groupId = 2;
		group02.groupName = "group 2";
		group02.account = account02;
		group02.createDate = LocalDate.of(2015, 11, 20);
	
		
		group group03 = new group();
		group03.groupId = 3;
		group03.groupName = "group 3";
		group03.account = account01;
		group03.createDate = LocalDate.of(2020, 11, 20);
		
		account[] accountOfGroup01= {account01, account02};
		group01.accounts = accountOfGroup01;
		
		account[] accountOfGroup02= {account01, account03};
		group02.accounts = accountOfGroup02;
		
		account[] accountOfGroup03= {account01, account02, account03};
		group03.accounts = accountOfGroup03;
		
		group[] groupOfAccount01 = {group01, group02, group03};
		account01.groups = groupOfAccount01;
		
		group[] groupOfAccount02 = {group01, group03};
		account02.groups = groupOfAccount02;
		
		group[] groupOfAccount03 = {group01, group02};
		account03.groups = groupOfAccount03;
		
		
		
/*		Question 1:
		 Kiểm tra account thứ 2
		Nếu không có phòng ban (tức là department == null) thì sẽ in ra
		text "Nhân viên này chưa có phòng ban"
		Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là
		..." */
		
		if(account02.department == null) {
			System.out.println("Nhan vien nay chua co phong ban");
		}else {
			System.out.println("Phong ban cua nhan vien nay la:" + account02.department.departmentName );
		}
		
/*		Question 2:
		Kiểm tra account thứ 2,
		Nếu không có group thì sẽ in ra text "Nhân viên này chưa có
		group"
		Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text "Group của
		nhân viên này là Java Fresher, C# Fresher"
		Nếu có mặt trong 3 Group thì sẽ in ra text "Nhân viên này là
		người quan trọng, tham gia nhiều group"
		Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên
		này là người hóng chuyện, tham gia tất cả các group" */
		
		
		if(account02.groups.length == 0) {
			System.out.println("Nhan vien nay chua co phong ban");
		}else if(account02.groups.length == 2 || account02.groups.length == 3) {
			System.out.println("Group của nhân viên này là Java Fresher, C# Fresher" );
		}else if (account02.groups.length == 3) {
			System.out.println("Nhân viên này là người quan trong, tham gia nhieu group" );
		}
		else if(account02.groups.length >= 4) {
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group" );
		}
		
		
//		Question 3: Sử dụng toán tử ternary để làm Question 1
		System.out.println((account02.department == null)? "Nhan vien nay chua co phong ban" 
				: "Phong ban cua nhan vien nay la:" + account02.department.departmentName );

		
/*		Question 4: Sử dụng toán tử ternary để làm yêu cầu sau:
			Kiểm tra Position của account thứ 1
			Nếu Position = Dev thì in ra text "Đây là Developer"
			Nếu không phải thì in ra text "Người này không phải là
			Developer" */
		
		System.out.println((account02.position.positionName == PositionName.DEV)?
				"Đây là Developer" : "Người này không phải là Developer" );
		
		
		
// SWITCH CASE
/*		Question 5:
			Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau:
			Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
			Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên"
			Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên"
			Còn lại in ra "Nhóm có nhiều thành viên" */
		
		int x = group01.accounts.length;
		switch(x){
		case 1:
			System.out.println("Nhóm có một thành viên");
			break;
		case 2:
			System.out.println("Nhóm có hai thành viên");
			break;
		case 3:
			System.out.println("Nhóm có ba thành viên");
			break;
		default:
			System.out.println("Nhóm có nhieu thành viên");
		}
		
//		Question 6: Sử dụng switch case để làm lại Question 2
		
		int y = account02.groups.length;
		switch (y) {
		case 0 :
			System.out.println("Nhân viên này chưa có group");
			break;
		case 1:
			System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
			break;
		case 2:
			System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
			break;
		case 3:
			System.out.println("Nhan vien nay la nguoi quan trong, tham gia nhieu group");
			break;
		default:
			System.out.println("Nhan vien nay la nguoi nhieu chuyen, tham gia tat ca cac group");
		}
		
//		Question 7: Sử dụng switch case để làm lại Question 4	
		switch(account02.position.positionName) {
		case DEV:
			System.out.println("Đây là Developer");
			break;
		default:
			System.out.println("Đây khong phai Developer");
		}
		
		
//		FOREACH
//		Question 8: in ra thông tin các account bao gồm: Email, FullName và tên	phòng ban của họ
		account[] accounts= {account01, account02, account03};
		int z=1;
		for(account account1:accounts) {
			System.out.println("tai khoan " + z+ " co thong tin nhu sau:");
			System.out.println("email: " + account1.email);
			System.out.println("fullname:" + account1.fullName);
			System.out.println("ten phong ban: " + account1.department.departmentName);
			z++;
			
		}
	
	
//		Question 9: in ra thông tin các phòng ban bao gồm: id và name
		department[] departments= {department01, department02, department03};
		int t=1;
		for(department department1:departments) {
			System.out.println("phong ban " + t+ " co thong tin nhu sau:");
			System.out.println("id: " + department1.departmentId);
			System.out.println("ten phong ban la " + department1.departmentName);
			t++;
			
		}
		
//FOR
//		Question 10
		System.out.println("\n");
		System.out.println("Question 10");
		
		for(int a=0;a<accounts.length;a ++) {
			System.out.println("thong tin account thu " +( a +1));
			System.out.println("Email: "+ accounts[a].email);
			System.out.println("Fullname: "+ accounts[a].fullName);
			System.out.println("Phong ban: "+ accounts[a].department.departmentName);
			System.out.println("\n");
		}
		
//		Question 11
		System.out.println("\n");
		System.out.println("Question 11");
		
		for(int a=0;a<departments.length;a ++) {
			System.out.println("thong tin department thu " +( a +1));
			System.out.println("id:  "+ departments[a].departmentId);
			System.out.println("ten phong ban: "+ departments[a].departmentName);
			System.out.println("\n");
		}
		
//		Question 12
		System.out.println("\n");
		System.out.println("Question 12");
		
		for(int a=0;a<2 ;a ++) {
			System.out.println("thong tin account thu " +( a +1));
			System.out.println("Email: "+ accounts[a].email);
			System.out.println("Fullname: "+ accounts[a].fullName);
			System.out.println("Phong ban: "+ accounts[a].department.departmentName);
			System.out.println("\n");
		}		
		
//		Question 13
		System.out.println("\n");
		System.out.println("Question 13");
		
		for(int a=0;a<accounts.length ;a ++) {
			if(accounts[a].accountId == 2 ) {continue;}
			System.out.println("thong tin account thu " +( a +1));
			System.out.println("Email: "+ accounts[a].email);
			System.out.println("Fullname: "+ accounts[a].fullName);
			System.out.println("Phong ban: "+ accounts[a].department.departmentName);
			System.out.println("\n");
		}		
			
//		Question 14
		System.out.println("\n");
		System.out.println("Question 14");
		
		for(int a=0;a<accounts.length ;a ++) {
			if(accounts[a].accountId >= 4 ) {break;}
			System.out.println("thong tin account thu " +( a +1));
			System.out.println("Email: "+ accounts[a].email);
			System.out.println("Fullname: "+ accounts[a].fullName);
			System.out.println("Phong ban: "+ accounts[a].department.departmentName);
			System.out.println("\n");
		}	
		
//		Question 15: in ra các số chẵn nhỏ hơn hoặc bằng 20
		for(int i =0; i<=20; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	
//WHILE
//		Question 16		
		
		System.out.println("\n");
		System.out.println("Question 16.1");
		
		int b = 0;
		
		while (b<accounts.length) {
			System.out.println("thong tin account thu " +( b +1));
			System.out.println("Email: "+ accounts[b].email);
			System.out.println("Fullname: "+ accounts[b].fullName);
			System.out.println("Phong ban: "+ accounts[b].department.departmentName);
			System.out.println("\n");
			b++;
		}
		
		
		//
		System.out.println("\n");
		System.out.println("Question 16.2");
		
		int c = 0;
		while(c<departments.length) {
			System.out.println("thong tin department thu " +( c +1));
			System.out.println("id:  "+ departments[c].departmentId);
			System.out.println("ten phong ban: "+ departments[c].departmentName);
			System.out.println("\n");
			c++;
		}
		
		//
		System.out.println("\n");
		System.out.println("Question 16.3");
		int d=0;
		while(d<2) {
			System.out.println("thong tin account thu " +( d +1));
			System.out.println("Email: "+ accounts[d].email);
			System.out.println("Fullname: "+ accounts[d].fullName);
			System.out.println("Phong ban: "+ accounts[d].department.departmentName);
			System.out.println("\n");
			d++;
		}
		
		//
//		System.out.println("\n");
//		System.out.println("Question 16.4");
//		
//		int e=0;
//		while(e<accounts.length) {
//			if(accounts[e].accountId == 2 ) {continue;}
//			System.out.println("thong tin account thu " +( e +1));
//			System.out.println("Email: "+ accounts[e].email);
//			System.out.println("Fullname: "+ accounts[e].fullName);
//			System.out.println("Phong ban: "+ accounts[e].department.departmentName);
//			e++;
//			break;
//		}	
//		
		
		//
//		System.out.println("\n");
//		System.out.println("Question 16.5");
//		int m=0;
//		for(m< accounts.length) {
//			if(accounts[m].accountId >= 4 ) {break;}
//			System.out.println("thong tin account thu " +(m +1));
//			System.out.println("Email: "+ accounts[m].email);
//			System.out.println("Fullname: "+ accounts[m].fullName);
//			System.out.println("Phong ban: "+ accounts[m].department.departmentName);
//			System.out.println("\n");
//			m++;
//		}
//		
		
//		Question 16.6		
		int k=0;
		while(k<=20) {
			if(k%2==0) {
				System.out.println(k);
			}
			k++;
		}
		
		
		
		
	}

}




