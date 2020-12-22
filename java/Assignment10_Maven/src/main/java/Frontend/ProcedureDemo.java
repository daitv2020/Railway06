package Frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import Backend.Procedure;

public class ProcedureDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Procedure pr = new Procedure();
		pr.connect();
		pr.deleteDepartmentById(1);
	}
	
	
	
	
}
