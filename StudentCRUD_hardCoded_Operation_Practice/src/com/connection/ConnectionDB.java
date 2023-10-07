package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDB {
  public static Connection getConnection()
  {
	  String url="jdbc:mysql://localhost:3306/student?useSSL=false";
	  String user="root";
	  String password="Maharana@2022";
	  Connection conn = null;
	  try {
		conn=DriverManager.getConnection(url, user, password);
		if(conn!=null)
		{
			System.out.println(" connect...!");
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	return conn;

  }
}
