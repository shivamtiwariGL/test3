package com.abc.doa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.abc.model.AbcModel;

public class AbcDoa {
	Connection con = null;
	PreparedStatement pstmt = null;
	
	public Connection getConnection()throws Exception

	 {

	 Class.forName("com.mysql.cj.jdbc.Driver");

	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gl", "root", "root");

	 return con;

	 }
	
	public String register(AbcModel abc) throws SQLException {
		
		String sql = "Insert into stdnt values(?,?,?,?,?)";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, abc.getRollno());
			pstmt.setString(2, abc.getStudentName());
			pstmt.setString(3, abc.getStandard());
			pstmt.setString(4, abc.getDob());
			pstmt.setDouble(5, abc.getFees());
			pstmt.execute();
			
			System.out.println("Student added successfully");
		
	}
		
		catch(Exception e) {
			e.printStackTrace();
			
			System.out.println("Error");
			pstmt.close();
			con.close();
    }
		return sql;
		
}	
	
}

