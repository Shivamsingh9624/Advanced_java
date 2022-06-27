package com.jdbc.practice;

import java.sql.*;

public class InsertValues{
	
	public static void main(String [] args) throws Exception {
		
		
//		------------+-------------+------+-----+---------+----------------+
//		| Field      | Type        | Null | Key | Default | Extra          |
//		+------------+-------------+------+-----+---------+----------------+
//		| id         | int         | NO   | PRI | NULL    | auto_increment |
//		| enrollment | int         | YES  |     | NULL    |                |
//		| name       | varchar(30) | YES  |     | NULL    |                |
//		| address    | varchar(30) | YES  |     | NULL    |                |
//		| course     | varchar(20) | YES  |     | NULL    |                |
//		| phoneno    | int         | YES  |     | NULL    |				   |
//		------------+-------------+------+-----+---------+----------------+
		
		
		String USERNAME = "root";
		String PASSWORD = "root";
		String URL = "jdbc:mysql://localhost:3306/jdbc";
		Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		Statement statement = con.createStatement();
		String sql_query = "insert into students values (19018010730, 'Shivamsingh Kushwaha', 'Gir Somanth', 'Computer Science', 9624681252)";
		statement.executeUpdate(sql_query);
		System.out.println("Data Inserted Succesfully");
//		System.out.println(t+"Rows Affected");
		statement.close();
		con.close();

	}
	

}
