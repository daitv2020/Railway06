package com.vti.frontend;
import com.vti.entity.Encapsulation.Ex4.Circle;
import com.vti.entity.Encapsulation.Ex4.Date;
import com.vti.entity.Encapsulation.Ex4.Account;
public class Program2EncapsulationQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		Circle circle = new Circle(5,"blue");
		System.out.println(circle);
		
		Date date = new Date(3,4,2020);
		System.out.println(date);
		
		Account account = new Account("22","tk01",222);
		System.out.println(account);
	}

}
