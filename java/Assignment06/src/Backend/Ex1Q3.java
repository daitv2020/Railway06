package Backend;

public class Ex1Q3 {

	public static void main(String[] args) {
	
		int[] numbers = {1,2,3};
				
		try {
			System.out.println(numbers[10]);
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Khong co phan tu thu 10 de in");
		}
	

}
}
