package com.nk.database;
import java.sql.*;
public class DeletePreparedStm {

	public static void main(String[] args) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdemo","root","root");
		
		PreparedStatement pstm = con.prepareStatement("delete from t1 where id=?");
		pstm.setInt(1,103);
		int i=pstm.executeUpdate();
		System.out.println(i + " record is deleted.");
	} catch (Exception e) {
		System.out.println(e);	
		}

	}

}
