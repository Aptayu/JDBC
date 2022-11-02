package com.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDao {

	public static boolean add(Student st) {
		// TODO Auto-generated method stub
		boolean f = false;
		try {
			Connection con = Cp.createC();
			String q = "insert into students(sid, sname, sclass) values(?,?,?)";
//			PreparedStatement
				PreparedStatement pstmt = con.prepareStatement(q);
//			set the values of parameters
				pstmt.setString(1, st.getSid());
				pstmt.setString(2, st.getSname());
				pstmt.setString(3, st.getSclass());
//			Execute
				pstmt.executeUpdate();
				f = true;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;
		
		
	}
	
	

}
