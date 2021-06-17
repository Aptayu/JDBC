package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDao {
	public static boolean insertStudentToDB(Student st) throws SQLException {
//		jbdc  code
		boolean f = false;
		try {
			Connection con = Cp.createC();
			String q = "insert into students(sname, sphone, scity) values(?,?,?)";
//		PreparedStatement
			PreparedStatement pstmt = con.prepareStatement(q);
//		set the values of parameters
			pstmt.setString(1, st.getStudentName());
			pstmt.setString(2, st.getStudentPhone());
			pstmt.setString(3, st.getStudentCity());
//		Execute
			pstmt.executeUpdate();
			f = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;
	}

	public static boolean deleteStudent(int userId) {
		// TODO Auto-generated method stub
		boolean f = false;
		try {
			Connection con = Cp.createC();
			String q = "delete from students where sid = ?";
//		PreparedStatement
			PreparedStatement pstmt = con.prepareStatement(q);
//		set the values of parameters
			pstmt.setInt(1, userId);
			
//		Execute
			pstmt.executeUpdate();
			f = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;
	}

	public static boolean displayStudents() {
		// TODO Auto-generated method stub
		boolean f = false;
		try {
			Connection con = Cp.createC();
			String q = "select * from students";
//		Static Statement
			Statement stmt = con.createStatement();
//		set the values of parameters
			
//		Execute
			ResultSet set = stmt.executeQuery(q);
			while(set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String phone = set.getString(3);
				String city = set.getString(4);
				
				System.out.println("ID" + ":" + id);
				System.out.println("NAME" + ":" + name);
				System.out.println("PHONE" + ":" + phone);
				System.out.println("CITY" + ":" + city);
				System.out.println("+++++++...");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;
	}

	public static boolean updateStudent(int userId, String name, String phone, String city) {
		// TODO Auto-generated method stub
		boolean f = false;
		try {
			Connection con = Cp.createC();
			String q = "update students set sname = ?, sphone = ?, scity = ? where sid = ?";
//		PreparedStatement
			PreparedStatement pstmt = con.prepareStatement(q);
//		set the values of parameters
			pstmt.setString(1, name);
			pstmt.setString(2, phone);
			pstmt.setString(3, city);
			
			pstmt.setInt(4, userId);
//		Execute
			pstmt.executeUpdate();
			f = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;
	}
	
	
}
