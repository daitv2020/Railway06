package com.frontend;

import com.backend.Ex2Q2_RunPerson;

import com.backend.Ex2Q2_RunStudent;

public class Ex2Q2 {
	public static void main(String[] args) {
		Ex2Q2_RunPerson run1 = new Ex2Q2_RunPerson();
//		run1.inputInfo();
//		run1.showInfo();
		
		
		Ex2Q2_RunStudent runst = new Ex2Q2_RunStudent();
		run1.inputInfo();
		runst.showInfo();
		runst.isDuocHocBong();
		
}
}
