package com.anju.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	
	public static Connection getConnection() {
		
		System.out.println("getConnection");
		String dbURL = "jdbc:mysql://localhost:3306/mycollege";
		String username = "root";
		String password = "root";
		Connection conn=null;
		try {
		     conn = DriverManager.getConnection(dbURL, username, password);
		 
		    if (conn != null) {
		        System.out.println("Connected");
		        return conn;
		    }
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
		return conn;
	}
}
