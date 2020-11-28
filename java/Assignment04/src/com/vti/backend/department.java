package com.vti.backend;

public class department {
	int departmentId;
	String departmentName;
	
	// không có parameter	
	public department() {
		super();
	}

	// Có 1 parameter là nameDepartment và default id của Department = 0
	
	public department(String departmentName) {
		super();
		this.departmentName = departmentName;
	}







	@Override
	public String toString() {
		return "department [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
	}


	
	
}
