package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection getConnection()
	{
		String URL="jdbc:mysql://localhost:3306/employinfo?useSSL=false";
		String UName="root";
		String Password="Maharana@2022";
		Connection conn=null;
		try {
			conn = DriverManager.getConnection(URL,UName,Password);
			 
		    if (conn != null) {
		        System.out.println("Connected");
		        return  conn;
		    }
		}catch (SQLException ex) {
		    ex.printStackTrace();
		}
		return conn;
	}


}
