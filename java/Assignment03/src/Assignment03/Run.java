package Assignment03;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a= 1;
//		int b= 2;
//		if (a>b) {System.out.println("a>b");
//		} else if (a==b) {System.out.println("a=b");
//		}  else {System.out.println("a<b");
//		}
//		System.out.println((a<b)? "a<b" : "a>=b");			
//		
//		String test = "1";
//		switch (test) {
//		case "1":
//			System.out.println("1"); // giữa case và break có thể thực hiện nhi�?u lệnh
//			System.out.println("3333");
//			break;
//		case "2":
//			System.out.println("default");
//			break;
//		default:
//			System.out.println("switchcase");
//			break; // cuối cùng có thể break hoặc k cần
//		}
//		department department1 = new department();
//		department1.department_id = 1;
//		department1.department_name = "sale";
//		
//		account account1 = new account();
//		account1.account_id = 1;
//		account1.email = "tuvandai1996@gmail.com";
//		account1.full_name = "Tu Van Dai";
//		account1.user_name = "Dai";
//		account1.department_id = department1;
		
//		System.out.println(account1.email);
//		System.out.println(account1.full_name);
//		System.out.println(account1.user_name);
//		System.out.println(account1.department_id.department_name);
		
		// vòng lặp for
//		for(int i= 0; i < 4; i = i+2) {
//			System.out.println(i);
//			System.out.println("vong lap for");
//		}
//		
		
//		String [] points = {"1","2","3"};
//		for(String i : points) {
//			System.out.println(i);
//		}
//		
//		// vòng lặp while
//		int i = 0;
//		while(i<=2) {
//			System.out.println("test");
//			i++;  // đi�?u kiện kết thúc vòng lặp while sẽ thực hiện trong câu lệnh
//		}
		
		
//		// Do while
//		do {System.out.println("test"); break;
//		}while(i>2);	// dù đi�?u kiện trong while đúng hay sai thì vẫn thực hiện lệnh trong do một lần trước, sau đó mới ss
//		
//		for(i=0; i<5; i ++) {
//			System.out.println("test");
//			;
//			if(i==3) {
//				continue;
//			}
//			System.out.println(i);
//		}
//		
//		LocalDate date = LocalDate.of(2020,10, 30); // hiển thị ngày tháng hiện tại
//		LocalDate date1 = LocalDate.parse("2020-11-20");
//		System.out.println(date);
//		System.out.println(date1);
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("moi nhap chuoi bat ky:"); // hứng ngư�?i dùng nhập vào
//		String text =scanner.nextLine();
//		System.out.println(text); // in ra dòng đã nhập
		
		
		
//		Scanner scanner = new Scanner(System.in);
//		String[] text1 = new String[3];
//		for(int a = 0; a<3; a++){
//			System.out.println("moi nhap chuoi bat ky:");
//			text1[a]  = scanner.nextLine();
//			System.out.println(text1[a]);  
//		}
		
//		phuongthuc1();
//		tinhtong(12,14);
//		
//	}
//
//	private static void tinhtong(int a, int b) {
//		// TODO Auto-generated method stub
//		System.out.println(a+b);
//	}
	
		int c=0;
		c = tinhtong2(12,13);
		System.out.println(c);
	}
//	private static void phuongthuc1() {
//		// TODO Auto-generated method stub
//		System.out.println(1111);
//		
		
		
//	}	
	
		private static int tinhtong2(int a, int b) {
			// TODO Auto-generated method stub
			return a+b;
		}
}














