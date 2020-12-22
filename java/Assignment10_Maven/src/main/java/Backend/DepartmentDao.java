package Backend;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import Entity.department;

public class DepartmentDao {
	private Properties properties;
	private Connection connection;

	public DepartmentDao() throws FileNotFoundException, IOException {
		properties = new Properties();
		properties.load(new FileInputStream(
				"C:\\Users\\tuvan\\eclipse-workspace\\Assignment10_Maven\\src\\main\\resource\\database.properties"));
	}

	public void connect() throws ClassNotFoundException, SQLException {
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		// Register the drive class with DriveManager
		Class.forName(properties.getProperty("driver"));

		// Step 2: Get a Database Connection
		connection = DriverManager.getConnection(url, username, password);
		System.out.println("Connect OK");

	}

	public List<department> getDepartment() throws SQLException {
		List<department> departments = new ArrayList<department>();

		String selectsql = "SELECT * FROM department";
		Statement statement = connection.createStatement();
		ResultSet resultset = statement.executeQuery(selectsql);
		while (resultset.next()) {
			department dp = new department();
//			System.out.println(resultset.getInt("department_id"));
			dp.setDepartmentId(resultset.getInt("department_id"));
			dp.setDepartmentName(resultset.getString("department_name"));
			departments.add(dp);
		}
//		System.out.println(departments);
		return departments;

	}

	public department searchById(int id) throws SQLException {
		List<department> departments = new ArrayList<department>();
		departments = getDepartment();
		boolean findDepartment = false;
		for (department dd : departments) {
			if (dd.getDepartmentId() == id) {
				findDepartment = true;
				System.out.println(dd);
				return dd;
			}
		}
		if (!findDepartment) {
			System.out.println("Khong tim thay department phu hop");

		}
		return null;
	}

	public department searchByName(String name) throws SQLException {
//		System.out.println("Vui long nhap department_name");
//		String name = ScannerUtils.inputString("Vui long nhap lai department_name");
		List<department> departments = new ArrayList<department>();
		departments = getDepartment();
//		boolean findDepartment = false;
		for (department dd : departments) {
			if (dd.getDepartmentName().equals(name)) {
//				findDepartment = true;
				System.out.println(dd);
				return dd;
			}
		}
		System.out.println("Khong tim thay department phu hop");
		return null;
	}

	public void createDepartment(String name) throws SQLException {
		Statement statement = connection.createStatement();
		if (searchByName(name) == null) {
			String query = "INSERT INTO department (department_name)" + "VALUE	('" + name + "')";
			int effectrecordamount = statement.executeUpdate(query);
			System.out.println("Da tao " + effectrecordamount + " department");
		} else {
			System.out.println("Da ton tai department nay");
		}

	}

	public void updateDepartmentName(int id, String name) throws SQLException {
		Statement statement = connection.createStatement();
		if (searchById(id) == null) {
			System.out.println("Khong ton tai department nay");
		} else if (searchByName(name) != null) {
			System.out.println("ten department nay da ton tai");
		} else {
			String query = "UPDATE department SET department_name = '" + name + "' WHERE department_id = " + id;
			int effectrecordamount = statement.executeUpdate(query);
			System.out.println(effectrecordamount);
			System.out.println("department sau up date" + searchById(id));
		}

	}

	public void deleteDepartment(int id) throws SQLException {
		Statement statement = connection.createStatement();
		if (searchById(id) == null) {
			System.out.println(searchById(id));
		} else {
			String query = "DELETE FROM department WHERE department_id = " + id;
			int effectrecordamount = statement.executeUpdate(query);
			System.out.println("Ban da xoa " + effectrecordamount + " record");

		}

	}

}
