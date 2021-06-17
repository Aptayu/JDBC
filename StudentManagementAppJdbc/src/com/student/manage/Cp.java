package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// This class will us in creating connection
public class Cp {
	
	static Connection con;
	public static Connection createC() throws SQLException {
//		load the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
//			create connection
			String user = "root";
			String password = "****";
			String url = "jdbc:mysql://localhost:3306/student_manage";
			
			
			con = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return con;
	} 
}
