package com.backend;

import java.util.ArrayList;
import java.util.Scanner;

import com.entity.Ex1Q5_ThiSinh;

public class Ex1Q5_TuyenSinh implements Ex1Q5_ITuyensinh {

	
	
	ArrayList<Ex1Q5_ThiSinh> thisinhs = new ArrayList<Ex1Q5_ThiSinh>();
	Ex1Q5_ThiSinh thisinh = new Ex1Q5_ThiSinh();
	
	Scanner scanner = new Scanner(System.in);
	
	
	@Override
	public void addThiSinh() {
		
		System.out.println("Moi ban nhap so luong thi sinh");
		int n = scanner.nextInt();
		for(int i=0; i<n;i++) {
		
		thisinh.input();
		thisinhs.add(thisinh);
		}
	}

	@Override
	public void showInfoThiSinh() {
		for(Ex1Q5_ThiSinh ts:thisinhs) {
			System.out.println(ts);
		}
		
	}

	@Override
	public void findThiSinh() {
		scanner.nextLine();
		System.out.println("moi ban nhap so bao danh thi sinh");
		if(thisinh.getSbd().equals(scanner.nextLine())) {
			System.out.println(thisinh);
		}
		
	}

	public void exits() {
		System.out.println("==Thoat==");
	}
	
}
