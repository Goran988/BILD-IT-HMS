package org.bildit.hms.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Nikola Lisièiæ
 *
 */
public class MyConnection {
	// connection username
	private static final String USERNAME = "root";
	// connection password
	private static final String PASSWORD = "Root1234";
	// name of the database
	private static final String DB = "bild_it_hms";

	/**
	 * Method for connecting to the specified database
	 * 
	 * @return connection with the database
	 * @author Nikola Lisièiæ
	 * @throws SQLException
	 * 
	 */
	public static Connection connectToDb() throws SQLException {
		Connection connection = null;
		try {
			// mySQl driver
			Class.forName("com.mysql.jdbc.Driver");
			// connection with the database "bild_it_hms"
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3333/" + DB, USERNAME, PASSWORD);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Connection succesfull!");
		return connection;
	}
}