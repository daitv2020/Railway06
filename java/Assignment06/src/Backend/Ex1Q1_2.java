package Backend;

public class Ex1Q1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// try/catch chạy trong hàm main
		// lỗi sẽ nhảy vào exception và thực hiện lenh trong catch
		try {
			System.out.println(device(7, 0)); 
		} catch (ArithmeticException e) {
			System.out.println(e.toString());	
			System.out.println("ArithmeticException");
		}catch (Exception e) { 				
			// TODO: handle exception
			System.out.println("Cannot device 0");

		}finally {
			System.out.println("divide completed!");
		}

	}

	private static float device(int i, int j) {
		// TODO Auto-generated method stub
		return i / j;
	}

}
