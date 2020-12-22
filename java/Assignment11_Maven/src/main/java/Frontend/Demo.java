package Frontend;

import java.io.IOException;
import java.sql.SQLException;

import com.vti.ultis.JdbcUtils;

public class Demo {

	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		JdbcUtils jdbc = new JdbcUtils();
		jdbc.connectForTesting();
	}

}
