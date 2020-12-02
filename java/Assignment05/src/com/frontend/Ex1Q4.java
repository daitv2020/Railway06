package com.frontend;

import java.util.Scanner;

import com.backend.Ex1Q4_MyNews;

public class Ex1Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex1Q4_MyNews mn = new Ex1Q4_MyNews();

		Scanner scanner = new Scanner(System.in);

		
		int choose;
		do {
			loadmenu();
			choose = scanner.nextInt();
			switch (choose) {
			case 1:
				mn.insertnews();
				break;
			case 2:
				mn.viewlistnews();
				break;
			case 3:
				mn.trungbinh();
				mn.viewlistnews();
				break;
			case 4:
				System.out.println("== EXIT==");
				break;
			}
		} while (choose != 4);

	}

	private static void loadmenu() {
		System.out.println("=========MENU=========");
		System.out.println("==1. Insert news    ==");
		System.out.println("==2. View list news ==");
		System.out.println("==3. Average rate   ==");
		System.out.println("==4. Exit           ==");
		System.out.println("======================");
		System.out.println("==Bạn chọn:           ");
	}

}
