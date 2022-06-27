package com.github.elizabetht.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	private static Connection dbConnection = null;

	@SuppressWarnings("deprecation")
	public static  Connection getConnection() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		
//		String dbDriver="com.mysql.jdbc.Driver";
//		String connectionUrl="jdbc:mysql://localhost:3306/jdbc/studentenrollment";
//		String userName="root";
//		String password="root";
		
		
//		String USERNAME = "root";
//		String PASSWORD = "root";
//		String URL = "jdbc:mysql://localhost:3306/jdbc/studentenrollment";
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		dbConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentenrollment", "root", "root");
		return dbConnection;
//
//		
//		if (dbConnection != null) {
//			return dbConnection;
//		} else {
//			try {
//				InputStream inputStream = DbUtil.class.getClassLoader().getResourceAsStream("db.properties");
//				Properties properties = new Properties();
//				if (properties != null) {
//					properties.load(inputStream);
//
//					String dbDriver = properties.getProperty("dbDriver");
//					String connectionUrl = properties.getProperty("connectionUrl");
//					String userName = properties.getProperty("userName");
//					String password = properties.getProperty("password");
//
////					Class.forName(dbDriver).newInstance();
//					dbConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentenrollment", "root", "root");
//				}
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//			return dbConnection;
//		}
	}
}
