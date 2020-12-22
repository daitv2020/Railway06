package Backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Basic {

	static String url = "jdbc:mysql://localhost:3306/TestingSQL?autoReconnect=true&useSSL=false&characterEncoding=latin1";
	static String username = "root";
	static String password = "14021996";

	public static void connectDB() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url, username, password);
		System.out.println("Connect thanh cong");
	}

//	Question 2: Tạo method để in ra các thông tin của position gồm có id, name
	public static void q2() throws SQLException {
		Connection connection = DriverManager.getConnection(url, username, password);
		String select = "SELECT * FROM position";
		Statement statement = connection.createStatement();
		ResultSet resultset = statement.executeQuery(select);
		while (resultset.next()) {
			System.out.print("position_id: " + resultset.getInt("position_id"));
			System.out.println(", position_name: " + resultset.getString("position_name"));
		}
	}

//	Question 3:	Tạo method để tạo position, user sẽ nhập vào name và id.
	public static void q3() throws SQLException {
		Connection connection = DriverManager.getConnection(url, username, password);
		String insertsql = " INSERT INTO `position`	(position_id,position_name	)" + "VALUE		(?,? )";
		PreparedStatement preparedstatement = connection.prepareStatement(insertsql);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi ban nhap position_id");
		int position_id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Moi ban nhap position_name:'Dev'or'Test'or'Scrum Master'or'PM'");
		String position_name = scanner.nextLine();
		preparedstatement.setInt(1, position_id);
		preparedstatement.setString(2, position_name);
		int effectedRecordAmount1 = preparedstatement.executeUpdate();
		System.out.println("Effected Record Amount: " + effectedRecordAmount1);
	}

//	Question 4: Tạo method để update tên của position gồm có id = 5 thành "Vị Trí 1".
	public static void q4() throws SQLException {
		Connection connection = DriverManager.getConnection(url, username, password);
		String updatesql = "UPDATE `position` SET position_name = 'PM' WHERE position_id =13";
		Statement statement = connection.createStatement();
		int effectedRecodAmount = statement.executeUpdate(updatesql);

		if (effectedRecodAmount == 1) {
			System.out.println("Update thanh cong");
		} else {
			System.out.println("That bai");
		}

	}

//	Question 5:	Tạo method để delete của position theo id và user sẽ nhập vào id
	public static void q5() throws SQLException {
		Connection connection = DriverManager.getConnection(url, username, password);
		String sql = "DELETE FROM position WHERE position_id = ?";
		PreparedStatement preparedstatement = connection.prepareStatement(sql);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi ban nhap position_id");
		int position_id = scanner.nextInt();
		preparedstatement.setInt(1, position_id);
		int effectedRecordAmount = preparedstatement.executeUpdate();
		if(effectedRecordAmount==1) {
			System.out.println("Xoa thanh cong");
		}else {
			System.out.println("Xoa that bai");
		}
	}

}
