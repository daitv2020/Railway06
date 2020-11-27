package Assignment03;

public class BoxingAndUnboxingEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		question1();
//		question2();
//		question3();
		
		
		
	}





	private static void question1() {
		// TODO Auto-generated method stub
//		Question 1:
//			Khởi tạo lương có datatype là Integer có giá trị bằng 5000.
//			Sau đó convert lương ra float và hiển thị lương lên màn hình 
//			(với số float có 2 số sau dấu thập phân)
		Integer salary = new Integer(5000);
		float slr = salary.floatValue();
		System.out.printf("%.2f%n",slr);
		}
	
	private static void question2() {
		// TODO Auto-generated method stub
//		Question 2:
//			Khai báo 1 String có value = "1234567"
//			Hãy convert String đó ra số int
		String x = "1234567";
		int y = Integer.parseInt(x);
		System.out.println(y);
		
	}
	

	private static void question3() {
		// TODO Auto-generated method stub
//		Question 3:
//			Khởi tạo 1 số Integer có value là chữ "1234567"
//			Sau đó convert số trên thành datatype int
		Integer i = new Integer(1234567);
		int y = i.intValue();
		System.out.println(y);
		
	}

}
