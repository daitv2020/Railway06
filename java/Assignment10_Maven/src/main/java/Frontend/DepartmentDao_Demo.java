package Frontend;

import java.io.FileNotFoundException;

import java.io.IOException;
import java.sql.SQLException;

import Backend.DepartmentDao;

public class DepartmentDao_Demo {

	public static void main(String[] args)
			throws SQLException, ClassNotFoundException, FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		DepartmentDao dd = new DepartmentDao();
		dd.connect();
		dd.getDepartment();
		dd.searchById(5);
		dd.searchByName("Dev");
		dd.createDepartment("Test");
		dd.updateDepartmentName(11, "IT");
		dd.deleteDepartment(11);

	}

}
