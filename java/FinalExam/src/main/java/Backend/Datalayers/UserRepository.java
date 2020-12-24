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
		String query = "SELECT * FROM User WHERE ProjectId = " + projectId + ";";
		ResultSet resultSet = statement.executeQuery(query);
		while (resultSet.next()) {
			if (resultSet.getString("Role").equals("Manager")) {
				users.add(new Manager(resultSet.getInt("ProjectID"), resultSet.getInt("UserID"),
						resultSet.getString("FullName"), resultSet.getString("Email"), resultSet.getInt("ExpInYear"),
						resultSet.getString("password")));
			} else {
				users.add(new Employee(resultSet.getInt("ProjectID"), resultSet.getInt("UserID"),
						resultSet.getString("FullName"), resultSet.getString("Email"), resultSet.getString("password"),
						resultSet.getString("proSkill")));
			}
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
		String query = "SELECT * FROM User WHERE `Role` = 'Manager';";
		ResultSet resultSet = statement.executeQuery(query);
		while (resultSet.next()) {
			users.add(new Manager(resultSet.getInt("ProjectID"), resultSet.getInt("UserID"),
					resultSet.getString("FullName"), resultSet.getString("Email"), resultSet.getInt("ExpInYear"),
					resultSet.getString("password")));
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
		if (password.length() >= 6 && password.length() <= 12) {
			return true;
		} else {
			return false;
		}
	}

	public static void showAllUsers() throws SQLException {
		users = new ArrayList<User>();
		Statement statement = connection.createStatement();
		String querry = "SELECT * FROM User";
		ResultSet resultSet = statement.executeQuery(querry);
		while (resultSet.next()) {
			if (resultSet.getString("Role").equals("Manager")) {
				users.add(new Manager(resultSet.getInt("ProjectID"), resultSet.getInt("UserID"),
						resultSet.getString("FullName"), resultSet.getString("Email"), resultSet.getInt("ExpInYear"),
						resultSet.getString("password")));
			} else {
				users.add(new Employee(resultSet.getInt("ProjectID"), resultSet.getInt("UserID"),
						resultSet.getString("FullName"), resultSet.getString("Email"), resultSet.getString("password"),
						resultSet.getString("proSkill")));
			}
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
