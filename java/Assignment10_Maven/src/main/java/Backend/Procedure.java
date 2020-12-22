package Backend;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Procedure {
	private Properties properties;
	private Connection connection;

	public Procedure() throws FileNotFoundException, IOException {
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

		System.out.println("Connect successfully");
	}

	public void deleteDepartmentById(int id) throws FileNotFoundException, IOException, SQLException, ClassNotFoundException {
		Statement statement = connection.createStatement();
		DepartmentDao dd = new DepartmentDao();
		dd.connect();
		
		if (dd.searchById(id) == null) {
			//System.out.println(dd.searchById(id));
		} else {
			String query = "{call testingsql.sp_delete_department(" + id + ")}";
			int effectrecordamount = statement.executeUpdate(query);
			System.out.println("Ban da xoa " + effectrecordamount + " record");
		}

	}

}
