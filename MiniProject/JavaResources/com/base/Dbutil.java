package com.base;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbutil {
	private static Connection dbConnection = null;

	@SuppressWarnings("deprecation")
	public static  Connection getConnection() throws SQLException  {
		
		if (dbConnection != null) {
			return dbConnection;
		} else {
			try {
				String USERNAME = "root";
				String PASSWORD = "root";
				String URL = "jdbc:mysql://localhost:3306/miniproject";
				Connection dbConnection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				return dbConnection;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return dbConnection;

		}
	}
}
