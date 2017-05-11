package project1;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class DBConnection {

	private static final String DB_HOSTNAME = "127.0.0.1";
	private static final String DB_PORT = "3306";
	private static final String DATABASE = "*****";
	private static final String DB_USER = "******";
	private static final String DB_PASSWORD = "******";

	private static Connection con;

	private static DBConnection theOnlyOne;

	private DBConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.con = (Connection) DriverManager.getConnection(
					"jdbc:mysql://" + DB_HOSTNAME + ":" + DB_PORT + "/" + DATABASE + "?useSSL=false", DB_USER,
					DB_PASSWORD);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static DBConnection getInstance() {
		if (theOnlyOne == null) {
			theOnlyOne = new DBConnection();
		}


		return theOnlyOne;
	}

	public Connection getConnection() {
		return con;
	}
}
