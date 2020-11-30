package com.vti.entity.Encapsulation.Ex4;

public class Circle {
	
	private final double PI = 3.14; 
	
	private	double	radius;
	private	String color;
	
		
	public Circle() {
		super();
	}
	
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}


	public Circle(double radius, String color) {
		super();
		this.radius = radius;
		this.color = color;
	}


	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}


	public double getArea() {
		return PI* Math.pow(radius, 2.0); // return 3.2; cung dc
	}


	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}



	
		
}
