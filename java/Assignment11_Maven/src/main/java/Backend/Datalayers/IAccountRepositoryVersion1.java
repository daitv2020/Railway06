package Backend.Datalayers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import Entity.account;

public interface IAccountRepositoryVersion1 {
	
	List<account> getListAccounts()throws IOException, ClassNotFoundException, SQLException;
	account getAccountByID(int id);
	account isAccountExists(String username);
	account isAccountExists(int id);
	account updateAccountByID(int id);
	boolean deleteAccount(int id);
	
	
}
