package com.base;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Repo {
	private Connection dbConnection;

	public Repo() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		dbConnection = Dbutil.getConnection();
	}

	public void save(String userName, String emailAddress, String password) {
		try {
			PreparedStatement prepStatement = dbConnection
					.prepareStatement("insert into test(username, email, password) values (?, ?, ?)");
			prepStatement.setString(1, userName);
			prepStatement.setString(2, emailAddress);
			prepStatement.setString(3, password);

			prepStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public boolean findByUserName(String userName) {
		try {
			PreparedStatement prepStatement = dbConnection.prepareStatement("select * from test where username = ?");
			prepStatement.setString(1, userName);

			ResultSet result = prepStatement.executeQuery();
//			System.out.println("Result set is: "+result);
//			System.out.println("Result set is: "+result.next());
			if (result != null) {
				while (result.next()) {
//					if (result.getInt(1) == 1) {
//						return true;
//					}
					return true;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean findByLogin(String email, String password) {
		try {
			PreparedStatement prepStatement = dbConnection.prepareStatement("select password from test where email = ?");
			prepStatement.setString(1, email);

			ResultSet result = prepStatement.executeQuery();
			if (result != null) {
				while (result.next()) {
					if (result.getString(1).equals(password)) {
						return true;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
