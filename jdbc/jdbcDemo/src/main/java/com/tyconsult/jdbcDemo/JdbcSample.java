package com.tyconsult.jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcSample {

	public static void main(String[] args) throws SQLException {


		insertDb();//calling my method
		System.out.println(" the number of records inserted" );
	}

	public static void insertDb() throws SQLException {

		PreparedStatement stmt = null;
		Connection con = null;
		
		try {
			//register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//establish the connection
			con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/tyconsultDB", "root", "8438");

			//create a statement
			stmt = con.prepareStatement("INSERT INTO persons VALUES (?,?,?,?,?) ");
			stmt.setInt(1, 9891);
			stmt.setString(2, "john");
			stmt.setString(3, "victor");
			stmt.setString(4, "11 abc street");
			stmt.setString(5, "mumbai");

			//execute statement
			int i = stmt.executeUpdate();
			
		}
		catch (Exception  e) {
			e.printStackTrace();
		}finally {
			//closing the connections
			stmt.close();
			con.close();

		}


	}

}
