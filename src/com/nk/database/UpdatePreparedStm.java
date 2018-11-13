package com.nk.database;
import java.sql.*;
public class UpdatePreparedStm {

	public static void main(String[] args) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdemo","root","root");
		
		PreparedStatement pstm = con.prepareStatement("update t1 set name=? , city=? where id=?");
		pstm.setString(1,"Ravi");
		pstm.setString(2,"Gandhinagar");
		pstm.setInt(3,102);
		
		int i = pstm.executeUpdate();
		System.out.println(i+ " record is updated.");
	} catch (Exception e) {
		System.out.println(e);
	}

	}

}
