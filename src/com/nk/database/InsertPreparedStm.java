package com.nk.database;
import java.sql.*;
public class InsertPreparedStm {

	public static void main(String[] args) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdemo","root","root");
		
		PreparedStatement pstm = con.prepareStatement("insert into t1 values(?,?,?)");
		pstm.setInt(1, 103);
		pstm.setString(2,"Abc");
		pstm.setString(3,"Xyz");
		int i = pstm.executeUpdate();
		System.out.println(i+ " record inserted.");
		con.close();
	} catch (Exception e) {
		// TODO: handle exception
	}
	}

}
