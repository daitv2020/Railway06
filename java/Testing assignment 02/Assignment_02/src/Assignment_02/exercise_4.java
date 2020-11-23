package Assignment_02;

import java.time.LocalDate;
import java.util.Random;

public class exercise_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// q1	Question 1: In ngẫu nhiên ra 1 số nguyên
		System.out.println("\n");
		System.out.println("question 1");
		Random random = new Random();
		int x = random.nextInt();
		System.out.println(x);
		
		// 13 - 25
		int z = random.nextInt(13) + 13;
		System.out.println(z);
// q2 	Question 2: In ngẫu nhiên ra 1 số thực
		System.out.println("\n");
		System.out.println("question 2");
		float y = random.nextFloat();
		System.out.println(y);
		
// q3	Question 3: Khai báo 1 array bao gồm các tên của các bạn trong lớp, sau đó in
//		ngẫu nhiên ra tên của 1 bạn
		System.out.println("\n");
		System.out.println("question 3");
		String[] tenHocSinh = {"Nguyen Van Minh", "Le Thi Linh", "Hoang Van Thu", "Tran Van Chiem"};
		Random random1 = new Random();
		int  rdi = random1.nextInt(tenHocSinh.length);
		System.out.println(tenHocSinh[rdi]);
		
// q4
//		Question 4: Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 24-07-1995 tới
//		ngày 20-12-1995
		System.out.println("\n");
		System.out.println("question 4");
		Random random4 = new Random();
		int minDay = (int) LocalDate.of(1995,07,24).toEpochDay();
		int maxDay = (int) LocalDate.of(1995,12,20).toEpochDay();
		
		long randomint = minDay + random4.nextInt(maxDay - minDay);
		LocalDate randomday = LocalDate.ofEpochDay(randomint);
		System.out.println(randomday);
		
// q5
//		Question 5: Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 1 năm trở lại đây
		System.out.println("\n");
		System.out.println("question 5");
		Random random5 = new Random();
		int minDay5 = (int) LocalDate.of(2019,11,23).toEpochDay();
		int maxDay5 = (int) LocalDate.of(2020,11,23).toEpochDay();
		
		long randomint5 = minDay5 + random5.nextInt(maxDay5 - minDay5);
		LocalDate randomday5 = LocalDate.ofEpochDay(randomint5);
		System.out.println(randomday5);
		
// q6   Question 6: Lấy ngẫu nhiên 1 ngày trong quá khứ
		
		System.out.println("\n");
		System.out.println("question 6");
		Random random6 = new Random();
		int Day6 = (int)LocalDate.now().toEpochDay();
		
		long randomint6 = Day6 - random6.nextInt(Day6);
		
		LocalDate randomday6 = LocalDate.ofEpochDay(randomint6);
		System.out.println(randomday6);
		
// q7 	Question 7: Lấy ngẫu nhiên 1 số có 3 chữ số
		System.out.println("\n");
		System.out.println("question 7");
		Random random7 = new Random();
		int rd71 = random7.nextInt(100)+100;
		int rd72 = random7.nextInt(200)+100;
		int rd73 = random7.nextInt(300)+100;
		int rd74 = random7.nextInt(400)+100;
		int rd75 = random7.nextInt(500)+100;
		int rd76 = random7.nextInt(600)+100;
		int rd77 = random7.nextInt(700)+100;
		int rd78 = random7.nextInt(800)+100;
		int rd79 = random7.nextInt(900)+100;
		int[] rd7array= {rd71,rd72,rd73,rd74,rd75,rd76,rd77,rd78,rd79};
		int iii = random7.nextInt(rd7array.length);
		System.out.println(rd7array[iii]);
		
		
		
	}
}
