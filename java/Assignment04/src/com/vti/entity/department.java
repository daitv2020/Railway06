package com.vti.entity;

public class department {
	public	int departmentId;
	private	String departmentName;
	
	// không có parameter	
	public department() {
		super();
	}

	// Có 1 parameter là nameDepartment và default id của Department = 0
	
	public department(String departmentName) {
		super();
		this.departmentName = departmentName;
	}

// tạo getter and setter
	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	
	
	
	@Override
	public String toString() {
		return "department [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
	}


	
	
}
