package Backend.Bussinesslayers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import Backend.Datalayers.AccountRepository;
import Entity.account;

public class AccountService {
	static AccountRepository accountrepository = new AccountRepository();
	public static List<account> getListAccounts() throws ClassNotFoundException, IOException, SQLException{
		return accountrepository.getListAccounts();
		
	}
	
	
}
