package Assignment_02;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class exercise_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		question1();
//		question2();
//		question3();
//		question4();
//		question5();
//		question6();
		question7();
		


		
		
	}


	private static void question1() {
		// TODO Auto-generated method stub
		
// Question 1
				int a=5;
				System.out.printf("%d%n",a);
				
	}
	
	private static void question2() {
		// TODO Auto-generated method stub
		
// Question 2 Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System out
//		printf để in ra số nguyên đó thành định dạng như sau: 100,000,000
		System.out.printf(Locale.ITALY,"%,d %n",100000000);
		
	}

	private static void question3() {
		// TODO Auto-generated method stub
		
// Question 3 Khai báo 1 số thực = 5,567098 và sử dụng lệnh System out printf
//				để in ra số thực đó chỉ bao gồm 4 số đằng sau		
				System.out.printf("%.4f %n ", 5.567098);
				
	}
	
	private static void question4() {
		// TODO Auto-generated method stub
		
/*		Question 4: Khai báo Họ và tên của 1 học sinh và in ra họ và tên học sinh đó
		theo định dạng như sau:
		Họ và tên: "Nguyễn Văn A" thì sẽ in ra trên console như sau:
		Tên tôi là "Nguyễn Văn A" và tôi đang độc thân. */
		
		String hoTen = "Nguyen Van Linh";
		System.out.println("Toi ten la " + hoTen + " va toi dang doc than");
		
	}

	private static void question5() {
		// TODO Auto-generated method stub
		
//		Question 5: Lấy thời gian bây giờ và in ra theo định dạng sau:
//			24/04/2020 11h:16p:20s
		String patern = "dd/MM/yyy HH:mm:ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(patern);
		String date = simpleDateFormat.format(new Date());
		System.out.println(date);
			
	}
	
	private static void question6() {
		// TODO Auto-generated method stub
	
//		Question 6: in ra thông tin account (như Question 8 phần FOREACH) theo
//		định dạng table (giống trong Database)
		
		account account01 = new account();
		account01.accountId = 1;
		account01.email = "tuvandai@gmail.com";
		account01.userName = "dai";
		account01.fullName = "tu van dai";
		account01.createDate = LocalDate.now();
	
		System.out.println("thong tin account01:");
		System.out.println("Id   		: " + account01.accountId );
		System.out.println("email		: " + account01.email );
		System.out.println("userName	: " + account01.userName );
		System.out.println("fullName	: " + account01.fullName );
		System.out.println("createDate	: " + account01.createDate );
		
		
	}
	
	
	private static void question7() {
		// TODO Auto-generated method stub
		
//		Question 7: in ra danh sách các account đã join vào group theo định dạng
//		table
//		Create Date của Account sẽ được định dạng theo format như sau: 24/04/2020
//		11h:16p:20s
		
		account account01 = new account();
		account01.accountId = 1;
		account01.email = "tuvandai@gmail.com";
		account01.userName = "dai";
		account01.fullName = "tu van dai";
		account01.createDate = LocalDate.now();
		
		account account02 = new account();
		account02.accountId = 2;
		account02.email = "tuvandai1@gmail.com";
		account02.userName = "dai1";
		account02.fullName = "tu van1 dai";
		account02.createDate = LocalDate.now();
		
		group group01 = new group();
		group01.groupId=1;
		group01.groupName = "sale";
		
		
		account[] accountOfGroup = {account01,account02};
		int y=0;
		for(account account1:accountOfGroup) {
			System.out.println("ngày tạo của account  " + (y+1) + " là "  + account1.createDate);
			y++;
		}
		
	}
	
	
}






