package Assignment03;

import java.util.Scanner;

public class StringEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		question1();
//		question2();
//		question3(); 
//		question4();
//		question5();
//		question6();
//		question13();
		question14();
		
		


		
	}









	private static void question1() {
		// TODO Auto-generated method stub
		
//		Question 1:
//		Nhập một xâu kí tự, đếm số lượng các từ trong xâu kí tự đó (các từ có
//		thể cách nhau bằng nhiều khoảng trắng );
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Moi ban nhap chuoi:   ");
	
	String chuoi1 = scanner.nextLine();
	System.out.println(chuoi1);
	
	chuoi1 = chuoi1.trim();
	chuoi1 = chuoi1.replaceAll("\\s+"," "); // replace một chuỗi các dấu cách thành 1 dấu cách
	System.out.println(chuoi1);
	
	String[] words = chuoi1.split("\\s");
	for(String w:words) {
		System.out.println(w);
	}
	System.out.println("chuoi ban nhap co " + words.length + " tu");
	
		
	}
	
	private static void question2() {
		// TODO Auto-generated method stub
		
//		Question 2: Nhập hai xâu kí tự s1, s2 nối xâu kí tự s2 vào sau xâu s1;
		
		System.out.println("\n");
		System.out.println("Question 2");
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Moi ban nhap chuoi 1:   ");
		
		String s1 = scanner1.nextLine();
		System.out.println(s1);
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Moi ban nhap chuoi 2:   ");
		
		String s2 = scanner2.nextLine();
		System.out.println(s2);
		
		String s3 = s1 + s2;
		System.out.println(s3);
	}
	
		private static void question3() {
//			Question 3:
//				Viết chương trình để người dùng nhập vào tên và kiểm tra, nếu tên chưa
//				viết hoa chữ cái đầu thì viết hoa lên
			
			
			 Scanner scanner = new Scanner(System.in);
			 System.out.println("Moi ban nhap 1 xau ky tu: ");
			 String chuoi2 = scanner.nextLine();
			 System.out.println(chuoi2);
			 chuoi2 = chuoi2.trim(); //cat bot ky tu ngoai - chuan hoa chuoi
			 chuoi2 = chuoi2.replaceAll("\\s+", " "); //replace toan bo whitespace - thanh 1 whitespace
			 System.out.println(chuoi2);
			 //chuan hoa chuoi s2
			 // chia nhỏ chuỗi s2 thành từng từ vào trong mảng words -> chuoi2.split("\\s");
			 String[] words = chuoi2.split("\\s");
			 for(int i = 0 ; i < words.length; i++) {
			 String string1 = words[i];
			 //viet hoa chữ cái đầu của từng từ
			 words[i] = string1.substring(0,1).toUpperCase() 
			 + string1.substring(1);
			 System.out.println(words[i]); 
			 }
			 String s4 = "";
			 // cộng các từ ở mảng words  lại với nhau , giữa mỗi từ có thêm dấu " "
			 for (String string1 : words) {
			 s4 = s4 + string1 + " "; 
			 }
			 System.out.println(s4);
			 }

		private static void question4() {
			// TODO Auto-generated method stub
//			Question 4:
//				Viết chương trình để người dùng nhập vào tên in từng ký tự trong tên
//				của người dùng ra
//				VD:
//				Người dùng nhập vào "Nam", hệ thống sẽ in ra
//				"Ký tự thứ 1 là: N"
//				"Ký tự thứ 1 là: A"
//				"Ký tự thứ 1 là: M"
			
			 Scanner scanner = new Scanner(System.in);
			 System.out.println("Moi ban nhap ten ");
			 String ten = scanner.nextLine();
			 System.out.println(ten);
			 ten = ten.trim(); 
			 String[] ten1 = ten.split("");
			 for(int i=0; i<ten1.length; i++) {
				 String tenuser=ten1[i];
				 ten1[i] = tenuser.substring(0,1).toUpperCase() ;
			 
			 System.out.println(ten1[i]);
			 }
				
		}

		private static void question5() {
			// TODO Auto-generated method stub
//			Question 5:
//				Viết chương trình để người dùng nhập vào họ, sau đó yêu cầu người
//				dùng nhập vào tên và hệ thống sẽ in ra họ và tên đầy đủ
			Scanner scanner = new Scanner(System.in);
			System.out.println("Moi ban nhap ho: ");
			String x = scanner.nextLine();
			System.out.println("Moi ban nhap ten: ");
			String y = scanner.nextLine();
			System.out.println("Ho va Ten cua ban là: " + x + " " + y);
	
		}

		private static void question6() {
			// TODO Auto-generated method stub
//			Question 6:
//				Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và
//				sau đó hệ thống sẽ tách ra họ, tên , tên đệm
//				VD:
//				Người dùng nhập vào "Nguyễn Văn Nam"
//				Hệ thống sẽ in ra
//				"Họ là: Nguyễn"
//				"Tên đệm là: Văn"
//				"Tên là: Nam"
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Mời bạn nhập họ và tên:");
			String fullname = scanner.nextLine();
			fullname = fullname.trim();
			fullname = fullname.replaceAll("\\s+"," ");
			String[] fullname1 = fullname.split(" ");
			for(int i = 0; i<fullname1.length; i++) {
				if(i==0) {
					System.out.println("Ho la: "+ fullname1[i]);
				}else if(i>=1 && i<=(fullname1.length - 2)) {
					System.out.println("Ten dem là: " + fullname1[i]);
				}else {
					System.out.println("Ten la: " + fullname1[i]);
				}
			}
				
		}

// Question13
//		Kiểm tra một chuỗi có chứa chữ số hay không, nếu có in ra false ngược
//		lại true.
//		Ví dụ:
//		"abc" => true
//		"1abc", "abc1", "123", "a1bc", null => false
		
		private static void question13() {
			// TODO Auto-generated method stub
			
			String chuoi = "123dd33";
			boolean tam = false;
			
			for (int i=0; i< chuoi.length(); i++) {
				if(chuoi.charAt(i) >=0 && chuoi.charAt(i)<=9) {
					tam = true;
					break;
			}
		}
				
			if (tam = true){
					System.out.println("chuoi 123dd33 có chứa chữ số");
				}else {
					System.out.println("chuoi 123dd33 không chứa chữ số");
				}
			
			
		}

	// Question14:
//		Cho một chuỗi str, chuyển các ký tự được chỉ định sang một ký tự khác
//		cho trước.
//		Ví dụ:
//		"VTI Academy" chuyển ký tự 'e' sang '*' kết quả " VTI Acad*my"
		
		
		private static void question14() {
			// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
			System.out.println("Mời bạn nhâp một chuỗi");
			String chuoi1 = scanner.nextLine();
			System.out.println("Nhạp chữ muốn thay thế");
			String x = scanner.nextLine();
			System.out.println("Nhập chữ muốn đổi lại");
			String y = scanner.nextLine();
			
			String chuoi2 = chuoi1.replaceAll(x,y);
			System.out.println("Chuoi sau khi doi là: " + chuoi2);
			
		}

		
		
		
		
		
		
		

		
	}

	

