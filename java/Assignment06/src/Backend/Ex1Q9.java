package Backend;

import Entity.Department;
import Entity.Position;

public class Ex1Q9 {

	ScannerUtils sc = new ScannerUtils();

	public void createDepartment() {
		System.out.println("Nhap Department's Name");
		String ten = sc.inputString("Vui long nhap lai ten phong ban");
		System.out.println("Nhap id phong ban");
		byte id = (byte) sc.inputInt("Vui long nhap lai id phong ban");
		Department dp = new Department(id, ten);
		System.out.println(dp.toString());
	}

	public void createPosition() {
		System.out.println("Nhap Positon's Name");
		String ten = sc.inputString("Vui long nhap lai ten vi tri");
		System.out.println("Nhap id position");
		short id = (short) sc.inputInt("Vui long nhap lai id position");
		Position ps = new Position(id, ten);
		System.out.println(ps.toString());
		
		
	}


}
