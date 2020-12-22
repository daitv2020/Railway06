package Backend.Presentationslayers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import Backend.Bussinesslayers.AccountService;
import Entity.account;

public class AccountController {

	public static List<account> getListAccounts() throws ClassNotFoundException, IOException, SQLException {
		return AccountService.getListAccounts();
	}
}
