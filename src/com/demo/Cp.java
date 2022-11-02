package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Cp {
	static Connection con;
	
	public static Connection createC() throws SQLException, ClassNotFoundException {
//		load driver
//		When you do Class.forName("com.mysql.cj.jdbc.Driver") to load and register this driver class, the class loader in JVM search for this class inside all JAR files available in CLASSPATH. If mysql-connector-java-5.1.25-bin.jar, which contains this class is not available in CLASSPATH then JVM will throw
//
//		Read more: https://www.java67.com/2015/07/javalangclassnotfoundexception-com.mysql.jdbc.Driver-solution.html#ixzz7iqVodjEP
		
//		if you get an error driver class is not found please add it in class path java --> buildpath--> configure --->
//		click on class path and add sql jar connector which is different from msi file
		Class.forName("com.mysql.cj.jdbc.Driver");
//		create connection
		String user = "root";
		String password = "Arpit";
		String url = "jdbc:mysql://localhost:3306/student_manage";
		
		
		con = DriverManager.getConnection(url, user, password);
		return con;
	}
}
