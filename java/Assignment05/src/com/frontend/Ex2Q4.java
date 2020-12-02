package com.frontend;

import java.util.Scanner;

import com.entity.Ex2Q4_MyMath;

public class Ex2Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex2Q4_MyMath mymath = new Ex2Q4_MyMath();

		mymath.sum(3, 4); //byte - byte
		mymath.sum(4, 5); //int - byte
		mymath.sum((float)4.5, 5);//float-byte
		mymath.sum(7, 7); // int - int
		mymath.sum((float)6.8, 9); // float - int
		mymath.sum((float)3.4, (float)5.6); // float- float
		
		}
		
		
		
	}


