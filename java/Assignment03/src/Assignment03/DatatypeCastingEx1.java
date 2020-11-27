package Assignment03;

import java.util.Random;
import java.util.Scanner;

public class DatatypeCastingEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		question1();
//		question2and3();
		question4();
		

		
		
	}


	private static void question1() {
		// TODO Auto-generated method stub
		account account1= new account();
		account account2 = new account();
//		Question 1:
		// Khai báo 2 số lương có kiểu dữ liệu là float.
		float sl1;
		float sl2;
		Float salary1;
		Float salary2;
		//Khởi tạo Lương của Account 1 là 5240.5 $
		account1.salary1 = (float) 5240.5;
		// Khởi tạo Lương của Account 2 là 10970.055$
		account2.salary1 = new Float(10970.055);
		//Khai báo 1 số int để làm tròn Lương của Account 1 và in số int đó ra
		int islr1 = (int)account1.salary1;
		System.out.println(islr1);
		// Khai báo 1 số int để làm tròn Lương của Account 2 và in số int đó ra
		int islr2 = (int)account2.salary1;
		System.out.println(islr2);
		
	}

	private static void question2and3() {
		// TODO Auto-generated method stub
//		Question 2:
//			Lấy ngẫu nhiên 1 số có 5 chữ số (những số dưới 5 chữ số thì sẽ thêm
//			có số 0 ở đầu cho đủ 5 chữ số)
		Random random = new Random();
		int x = random.nextInt(100000);
		String x1 = String.valueOf(x);
		switch(x1.length() ) {
		case 1:
			System.out.println("0000" + x1);
			break;
		case 2:
			System.out.println("000" + x1);
			break;
		case 3:
			System.out.println("00" + x1);
			break;
		case 4:
			System.out.println("0" + x1);
			break;
		default:
		System.out.println(x1);
		}
		
//		Question 3:
//			Lấy 2 số cuối của số ở Question 2 và in ra.
//			Gợi ý:
//			Cách 1: convert số có 5 chữ số ra String, sau đó lấy 2 số cuối
//			Cách 2: chia lấy dư số đó cho 100		
		System.out.println("\nquestion 3");
		int x2 = x%100;
		String x3 = String.valueOf(x2);
		if(x3.length() == 1 ) {
			System.out.println("0" + x3);
		}else {
			System.out.println(x3);
		}
	}

	private static void question4() {
		// TODO Auto-generated method stub
//		Question 4:
//			Viết 1 method nhập vào 2 số nguyên a và b và trả về thương của chúng
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào số nguyên a: ");
		int a = scanner.nextInt();
		System.out.println("Mời bạn nhập vào số nguyên b: ");
		int b = scanner.nextInt();
		System.out.print("Thương của a/b =   ");
		System.out.println((float)a/(float)b);
	
	}
	
	

}
