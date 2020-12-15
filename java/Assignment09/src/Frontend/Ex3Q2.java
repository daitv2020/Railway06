package Frontend;

import Entity_InnerClass.Car;

public class Ex3Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car("Mazda", "8WD");
		Car.Engine engine = new Car.Engine();
		engine.setEngineType("Crysler") ;
		System.out.println(car);
		
	}

}
