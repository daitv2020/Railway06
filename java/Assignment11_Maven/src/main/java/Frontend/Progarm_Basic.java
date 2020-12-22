package Frontend;

import java.io.IOException;
import java.sql.SQLException;

import Backend.Bussinesslayers.AccountService;
import Backend.Datalayers.AccountRepository;
import Backend.Presentationslayers.AccountController;

public class Progarm_Basic {

	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
//		AccountRepository run = new AccountRepository();
//		run.getListAccounts();
//		AccountService.getListAccounts();
		AccountController.getListAccounts();
	}

}
