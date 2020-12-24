package Frontend;

import java.io.IOException;
import java.sql.SQLException;

import com.vti.ultis.JdbcUtils;

public class Connect {

	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
		JdbcUtils jdbc = new JdbcUtils();
		jdbc.connectForTesting();
	}

}
