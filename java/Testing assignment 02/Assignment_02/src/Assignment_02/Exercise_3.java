package Assignment_02;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class Exercise_3 {

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
		
		
//		Question 1: In ra thông tin account thứ 1 và property create date sẽ được
//		format theo định dạng vietnamese
		
		account account1 = new account();
		account1.accountId = 1;
		account1.email = "abc@gmail.com";
		account1.userName = "abc";
		account1.fullName = "a b c";
		account1.createDate = LocalDate.now();
		
		System.out.println("ID			: " + account1.accountId);
		System.out.println("email		:  " + account1.email);
		System.out.println("username	: " + account1.userName);
		System.out.println("fullanme	: " + account1.fullName);
		Locale locale = new Locale("vi", "VN");
		DateFormat dateformat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
		ZoneId defaultZoneId = ZoneId.systemDefault();
		Date date = Date.from(account1.createDate.atStartOfDay(defaultZoneId).toInstant());
		String date1 = dateformat.format(date);
		System.out.println("createDate	: " + date1);
		

	}
	
	private static void question3() {
		// TODO Auto-generated method stub
		
//		Question 3: Chỉ in ra ngày của create date trong Question 1

		
		account account1 = new account();
		account1.accountId = 1;
		account1.email = "abc@gmail.com";
		account1.userName = "abc";
		account1.fullName = "a b c";
		account1.createDate = LocalDate.now();
	
		Locale locale = new Locale("vi", "VN");
		DateFormat dateformat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
		ZoneId defaultZoneId = ZoneId.systemDefault();
		Date date = Date.from(account1.createDate.atStartOfDay(defaultZoneId).toInstant());
		String date1 = dateformat.format(date);
		System.out.println("createDate	: " + date1);

	}
	private static void question2() {
		// TODO Auto-generated method stub
//		Question 2: In ra thông tin: account đã tham gia vào group ngày nào theo định
//		dạng
//		Năm – tháng – ngày – giờ – phút – giây
		account account1 = new account();
		account1.accountId = 1;
		account1.email = "abc@gmail.com";
		account1.userName = "abc";
		account1.fullName = "a b c";
		account1.createDate = LocalDate.of(2020,11,23);
		
		String pattern2 = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(pattern2);
		String createDate1 = simpleDateFormat2.format(Date.from(account1.createDate.atStartOfDay(ZoneId.systemDefault()).toInstant()));
		System.out.println("Joindate " + createDate1);
		System.out.println("\n");

			
	}
	

	private static void question4() {
		// TODO Auto-generated method stub
		
//		Question 4: Chỉ in ra năm của join date trong Question 2
		account account1 = new account();
		account1.accountId = 1;
		account1.email = "abc@gmail.com";
		account1.userName = "abc";
		account1.fullName = "a b c";
		account1.createDate = LocalDate.of(2020,11,23);
		
		String pattern2 = "yyyy";
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(pattern2);
		String createDate1 = simpleDateFormat2.format(Date.from(account1.createDate.atStartOfDay(ZoneId.systemDefault()).toInstant()));
		System.out.println("join Date " + createDate1);
		System.out.println("\n");
		
	}
	
	private static void question5() {
		// TODO Auto-generated method stub
//		Question 5: Chỉ in ra tháng và năm của join date trong Question 2
		account account1 = new account();
		account1.accountId = 1;
		account1.email = "abc@gmail.com";
		account1.userName = "abc";
		account1.fullName = "a b c";
		account1.createDate = LocalDate.of(2020,11,23);
		
		String pattern2 = "MM-yyyy";
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(pattern2);
		String createDate1 = simpleDateFormat2.format(Date.from(account1.createDate.atStartOfDay(ZoneId.systemDefault()).toInstant()));
		System.out.println("join Date " + createDate1);
		System.out.println("\n");
		
	}

	private static void question6() {
		// TODO Auto-generated method stub
//		Question 6: Chỉ in ra "MM-DD" của join date trong Question 2
		account account1 = new account();
		account1.accountId = 1;
		account1.email = "abc@gmail.com";
		account1.userName = "abc";
		account1.fullName = "a b c";
		account1.createDate = LocalDate.of(2020,11,23);
		
		String pattern2 = "MM-dd";
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(pattern2);
		String createDate1 = simpleDateFormat2.format(Date.from(account1.createDate.atStartOfDay(ZoneId.systemDefault()).toInstant()));
		System.out.println("join Date " + createDate1);
		System.out.println("\n");
		
		
		
	}

		
	
	
	

}
