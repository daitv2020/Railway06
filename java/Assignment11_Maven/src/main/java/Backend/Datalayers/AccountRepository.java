package Backend.Datalayers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.vti.ultis.JdbcUtils;

import Entity.account;

public class AccountRepository implements IAccountRepositoryVersion1{
	private Connection connection;

	public List<account> getListAccounts() throws IOException, ClassNotFoundException, SQLException {
		List<account> accounts = new ArrayList<account>();
		JdbcUtils jdbc = new JdbcUtils();
		Connection connection = jdbc.connect();
		String sql = "SELECT * FROM `account`";
		Statement statement = connection.createStatement();
		ResultSet resultset = statement.executeQuery(sql);
		while (resultset.next()) {
			account acc = new account();
			acc.setAccountId(resultset.getInt("account_id"));
			acc.setEmail(resultset.getString("email"));
			acc.setFullName(resultset.getString("full_name"));
			acc.setUserName(resultset.getString("username"));
			acc.setCreateDate(LocalDate.parse(resultset.getString("create_date")));
			accounts.add(acc);
		}
		System.out.println(accounts);
		return accounts;

	}


	public account getAccountByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public account isAccountExists(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	public account isAccountExists(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public account updateAccountByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteAccount(int id) {
		// TODO Auto-generated method stub
		return false;
	}
}
