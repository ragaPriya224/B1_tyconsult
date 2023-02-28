package com.tyconsult.jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class JdbcSelectSample {

	public static void main(String[] args) throws SQLException {

		ArrayList<Persons> result = selectData();
		System.out.println(result);
	}

	//sample code for selecting  all the records 
	public static ArrayList<Persons> selectData() throws SQLException {
		ArrayList<Persons> dataList = new ArrayList<Persons>();
		try {

			//register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			//establish the connection
			Connection con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/tyconsultDB", "root", "8438");

			//create statement
			Statement stmt = con.createStatement();

			//execute query
			ResultSet rs = stmt.executeQuery("select * from persons");
			//process the result set
			while(rs.next()) { // it checks whether next row is there or not 
				//process each and every row 
				dataList.add( new Persons(rs.getInt(1),rs.getString(2),rs.getString(3),
						rs.getString(4),rs.getString(5)));
			}
		}catch(Exception e) {
			//handle the exception here
		}
		return dataList;
	}

}