	package com.jdbc.practice;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.sql.*;
import java.net.*;

public class CreateTable {

	public static void main(String[] args) throws Exception {
		
		
//		---------2 type of jdbc query------------
//		
//		1. Select Query
//		2. Non Select Query ------> it includes only DML commands(insert/delete/update)
//		-----------------------------------------------
//		Types of execute statement and when to use it
//		1. executeQuery -----> When we perform SELECT Query bco'z it retuns RESULT SET.....group of elements
//		2. executeUpdate -----> when we use NON SELECT Query bco'z it returns the INT value i.e(3 rows affected)
//		3.execute -----> used for both type of querys i.e select and non-select query it returns boolean
		////-----///if it is true then SELECT query is used
		////-----///if it is false then NON-SELECT Query is used.
		
		
		
		String USERNAME = "root";
		String PASSWORD = "root";
		String URL = "jdbc:mysql://localhost:3306/studentenrollment";
//		Class.forName(com.mysql.jdbc.Driver);
		Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

		String sql_query = "create table students(id int(10) primary key,"
				+ "enrollment int(20),"
				+ "name varchar(30),"
				+ "address varchar(30),"
				+ "course varchar(20),"
				+ "phoneno int(20))";
		Statement st = con.createStatement();
//		PreparedStatement ps = con.PreparedStatement(sql_query);
		st.execute(sql_query);
//		st.execute();
		System.out.println("Table created succesully");
		con.close();

		
//client-side
Socket client_sc = new Socket("name",1234);
BufferedReader user_input = new BufferedReader(new InputStreamReader(System.in));
DataOutputStream server_out = new DataOutputStream(new DataOutputStream(client_sc.getOutputStream()));
String input = user_input.readLine();
//server_out.writeByte(input+"\n");
client_sc.close();

		
		
		
		
//		server side
ServerSocket sc = new ServerSocket(1234);
while(true) {
Socket ls = sc.accept();
InputStreamReader ip = new InputStreamReader(ls.getInputStream());
BufferedReader br = new BufferedReader(ip);

String word = br.readLine();
System.out.println(word);
}

	}

}
