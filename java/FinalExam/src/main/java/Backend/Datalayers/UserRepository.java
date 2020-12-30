package Backend.Datalayers;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import com.vti.ultis.JdbcUtils;

import Entity.Employee;
import Entity.Manager;
import Entity.User;

public class UserRepository {
	JdbcUtils jdbcUtils;
	public static Connection connection;

	public UserRepository() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		jdbcUtils = new JdbcUtils();
		connection = jdbcUtils.connect();
	}

	public static ArrayList<User> users = new ArrayList<User>();
	
	public static void showUsersByProjectId(int projectId) throws SQLException {
		users = new ArrayList<User>();
		Statement statement = connection.createStatement();
		String query = "SELECT m.FullName as m_fullname,m.email as m_email, e.FullName as e_fullname, e.Email as e_email FROM `Project` p"
				+ " JOIN Manager m ON p.IdManager = m.Id"
				+ " JOIN Employee e ON p.IdEmployees = e.Id WHERE p.ProjectID = "+ projectId + ";";
		ResultSet resultSet = statement.executeQuery(query);
		while (resultSet.next()) {
		users.add(new Manager( 
						resultSet.getString("m_fullname"),
						resultSet.getString("m_email")));
		users.add(new Employee(
				resultSet.getString("e_fullname"),
				resultSet.getString("e_email")));

		}
		for (User user : users) {
			if (user instanceof User) {
				System.out.println(user);
			} else if (user instanceof Employee) {
				Employee employee2 = (Employee) user;
				System.out.println(employee2.toString());
			} else if (user instanceof Manager) {
				Manager manager = (Manager) user;
				System.out.println(manager.toString());
			}
		}
	}

	public static void showAllManager() throws SQLException {
		users = new ArrayList<User>();
		Statement statement = connection.createStatement();
		String query = "SELECT m.FullName as m_fullname,m.email as m_email, m.ExpInYear as m_ExpInYear, m.Id as m_id FROM `Project` p" + 
				"	 JOIN Manager m ON p.IdManager = m.Id";
		ResultSet resultSet = statement.executeQuery(query);
		while (resultSet.next()) {
			users.add(new Manager( 
					resultSet.getInt("m_id"),			
					resultSet.getString("m_fullname"),
					resultSet.getString("m_email"),
					resultSet.getInt("m_ExpInYear")));
		}
		for (User us : users)
			System.out.println(us);
	}

	public static boolean checkEmail(String email) {
		boolean checkemail = false;
		for (int i = 0; i < email.length(); i++) {
			if (email.charAt(i) == '@') {
				checkemail = true;
			}
		}
		if (email.length() >= 2 && checkemail) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkPassword(String password) {
		boolean checkpass = false;
		for (int i = 0; i < password.length(); i++) {
			if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
				checkpass = true;
			}
		}
		if (password.length() >= 6 && password.length() <= 12 && checkpass) {
			return true;
		} else {
			return false;
		}
	}

	public static void showAllUsers() throws SQLException {
		users = new ArrayList<User>();
		Statement statement = connection.createStatement();
		String query = "SELECT m.Id as m_id, m.FullName as m_fullname,m.email as m_email, m.Password as m_pass, m.ExpInYear as m_ExpInYear, e.Id as e_id, e.FullName as e_fullname, e.Email as e_email, e.Password as e_pass FROM `Project` p"
				+ " JOIN Manager m ON p.IdManager = m.Id"
				+ " JOIN Employee e ON p.IdEmployees = e.Id";
		ResultSet resultSet = statement.executeQuery(query);
		while (resultSet.next()) {
		users.add(new Manager( 
				resultSet.getInt("m_id"),
				resultSet.getString("m_fullname"),
				resultSet.getString("m_email"),
				resultSet.getString("m_pass"),
				resultSet.getInt("m_ExpInYear")));
		users.add(new Employee(
				resultSet.getInt("e_id"),
				resultSet.getString("e_fullname"),
				resultSet.getString("e_email"),
				resultSet.getString("e_pass")));

		}
		for (User user : users) {
			if (user instanceof User) {
				System.out.println(user);
			} else if (user instanceof Employee) {
				Employee employee2 = (Employee) user;
				System.out.println(employee2.toString());
			} else if (user instanceof Manager) {
				Manager manager = (Manager) user;
				System.out.println(manager.toString());
			}
		}
	}
	public static void login() throws SQLException {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Moi ban nhap email login");
			String email = scanner.nextLine();
			System.out.println("Moi ban nhap password login");
			String pass = scanner.nextLine();

			if (!checkEmail(email)) {
				System.out.println("Ban nhap sai email, vui long dang nhap lai");
				continue;
			}

			if (!checkPassword(pass)) {
				System.out.println("Ban nhap sai password, vui long dang nhap lai");
				continue;
			}
			if (checkEmail(email) && checkPassword(pass)) {
				showAllUsers();
				for (User us : users) {
					if (us.getEmail().equals(email) && us.getPassword().equals(pass)) {
						System.out.println("Dang nhap thanh cong");
						return;
					} else {
						System.out.println("Tai khoan khong ton tai, vui long dang nhap lai");
						break;
					}

				}
			}
		}

	}

}
