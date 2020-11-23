package Assignment_02;

import java.time.LocalDate;
import java.util.Scanner;

public class exercise_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Question 1: Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình
		
//		question1();
//		question2();
//		question3();
//		question4();
//		question5();
//		question6();
//		question7();
		question8();
		
		
		
	}


	private static void question1() {
		// TODO Auto-generated method stub
		
//		Question 1: Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình	
		// next: chuỗi đầu tiên sau dấu cách, nextLine: lấy cả dòng, nextInt: chuyển chuỗi user nhập sang kiểu Int 
		// DÙng hàm Scanner của java.until
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("hay nhap vao so nguyen thu nhat:  ");
		int x1 = scanner1.nextInt(); 
		System.out.println("hay nhap vao so nguyen thu hai:  ");
		int x2= scanner1.nextInt(); 
		System.out.println("hay nhap vao so nguyen thu ba:  ");
		int x3 = scanner1.nextInt(); 

		
		System.out.println("Ban da nhap 3 so la:  " );
		System.out.println(x1 );
		System.out.println(x2 );
		System.out.println(x3 );
		
			
	}
	
	private static void question2() {
		// TODO Auto-generated method stub
//		Question 2: Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("hay nhap vao so thuc thu nhat:  ");
		float x1 = scanner1.nextFloat(); 
		System.out.println("hay nhap vao so thuc thu hai:  ");
		float x2 = scanner1.nextFloat();
		System.out.println("Ban da nhap 2 so thu: ");
		System.out.println(x1 );
		System.out.println(x2 );
		
	}
	
	private static void question3() {
		// TODO Auto-generated method stub
//		Question 3: Viết lệnh cho phép người dùng nhập họ và tên
		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi ban nhap ho va ten:   ");
		String i = scanner.nextLine();
		System.out.println("Ho va ten cua ban la: " + i);

	}


	private static void question4() {
		// TODO Auto-generated method stub	
//		Question 4: Viết lệnh cho phép người dùng nhập vào ngày sinh nhật của họ
		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi ban nhap ngay sinh:   ");
		int x = scanner.nextInt();
		System.out.println("Moi ban nhap thang sinh:   ");
		int y = scanner.nextInt();
		System.out.println("Moi ban nhap nam sinh:   ");
		int z = scanner.nextInt();
		System.out.println("Ngay sinh cua ban la: " + x +"-"+y+"-"+z);
		
	}


	private static void question5() {
		// TODO Auto-generated method stub
//		Question 5: Viết lệnh cho phép người dùng tạo account (viết thành method)
//		Đối với property Position, Người dùng nhập vào 1 2 3 4 5 và vào
//		chương trình sẽ chuyển thành Position.Dev, Position.Test,
//		Position.ScrumMaster, Position.PM	
		account account1 = new account();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi ban nhap accountId:   ");
		int x = scanner.nextInt();
		scanner.nextLine(); 
		account1.accountId = x;
		System.out.println("Moi ban nhap userName:   ");
		String y = scanner.nextLine();
		account1.userName = y;
		account1.email = y + "@gmail.com";
		System.out.println("Moi ban nhap fullName:   ");
		String z = scanner.nextLine();
		account1.fullName = z;
		System.out.println("Moi ban nhap so từ 1-5 de tim position:   ");
		int p1 = scanner.nextInt();
		System.out.println("Thong tin account ban vua tao như sau:");
		System.out.println("accountId:		" +account1.accountId);
		System.out.println("email:			" +account1.email);
		System.out.println("userName:		" +account1.userName);
		System.out.println("fullName:		" +account1.fullName);
	
		
		switch(p1){
			case 1:
				System.out.println("Position:		Dev");
				break;
			case 2:
				System.out.println("Position:		Test");
				break;
			case 3: 
				System.out.println("Position:		ScrumMaster");
				break;
			case 4: 
				System.out.println("Position:		PM");
				break;
			case 5:
			default:
				System.out.println("Position:		ban chua co position");
		}
		account1.createDate = LocalDate.now();
		System.out.println("CreateDate:		" + account1.createDate);
		
	}

	
	
//	Question 6: Viết lệnh cho phép người dùng tạo department (viết thành method)	
	
	private static void question6() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("hay nhap vao id của phòng ban:  ");
		int department_id = scanner.nextInt();
		department department03 = new department();
		department03.departmentId = department_id;
		scanner.nextLine(); // them dong nay để tránh bị lỗi khi nhập thêm nextLine()
		System.out.println("hay nhap vao ten của phòng ban:  ");
		String department_name = scanner.nextLine();
		department03.departmentName = department_name;
		
		System.out.println(department03.toString());
	}
	

	private static void question7() {
		// TODO Auto-generated method stub
//		Question 7: Nhập số chẵn từ console
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập một số chẵn: ");
		int i = scanner.nextInt();
		if(i%2 != 0) {
			System.out.println("Số bạn nhập không phải số chẵn");
		}else{
			System.out.println("Số chẵn bạn nhập là: " + i);
		}
	}
	
	private static void question8() {
		// TODO Auto-generated method stub
//		Question 8: Viết chương trình thực hiện theo flow sau
//		Bước 1: Chương trình in ra text "mời bạn nhập vào chức năng muốn sử dụng"
//		Bước 2:
//		Nếu người dùng nhập vào 1 thì sẽ thực hiện tạo account
//		Nếu người dùng nhập vào 2 thì sẽ thực hiện chức năng tạo department
//		Nếu người dùng nhập vào số khác thì in ra text "Mời bạn nhập lại" và
//		quay trở lại bước 1
		account account1 = new account();
		for(int a=0; a<2; a++) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào chức năng mong muốn sử dụng: ");
		int i= scanner.nextInt();
		switch(i) {
		case 1:
			System.out.println("Xin mời bạn đến với chức năng tạo account");
			System.out.println("Moi ban nhap accountId:   ");
			int x = scanner.nextInt();
			scanner.nextLine(); 
			account1.accountId = x;
			System.out.println("Moi ban nhap userName:   ");
			String y = scanner.nextLine();
			account1.userName = y;
			account1.email = y + "@gmail.com";
			System.out.println("Moi ban nhap fullName:   ");
			String z = scanner.nextLine();
			account1.fullName = z;
			account1.createDate = LocalDate.now();
			System.out.println("Đây là account bạn đã tạo:" + account1.toString());
			a--;
			break;
		case 2:
			System.out.println("Xin mời bạn đến với chức năng tạo phòng ban: ");
			System.out.println("hay nhap vao id của phòng ban:  ");
			int department_id = scanner.nextInt();
			department department03 = new department();
			department03.departmentId = department_id;
			scanner.nextLine(); // them dong nay để tránh bị lỗi khi nhập thêm nextLine()
			System.out.println("hay nhap vao ten của phòng ban:  ");
			String department_name = scanner.nextLine();
			department03.departmentName = department_name;
			
			System.out.println(department03.toString());
			a--;
			break;
		default:
			System.out.println("Mời bạn nhập lại.");
		}
		break;
		}
		
	}


}
