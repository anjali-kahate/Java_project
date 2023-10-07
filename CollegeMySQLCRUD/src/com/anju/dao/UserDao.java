package com.anju.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.anju.conn.ConnectDB;
import com.anju.model.User;
import com.mysql.jdbc.Statement;

public class UserDao {
	
	
	public void insertUser(User u)
	{
		try {
		System.out.println("insert User");
		String sql = "INSERT INTO Users (username, password, fullname, email) VALUES (?, ?, ?, ?)";
		PreparedStatement statement = ConnectDB.getConnection().prepareStatement(sql);
		statement.setString(1, u.getUsername());
		statement.setString(2, u.getPassword());
		statement.setString(3, u.getFullName());
		statement.setString(4, u.getEmail());
		int rowsInserted = statement.executeUpdate();
		if (rowsInserted > 0) {
			System.out.println("A new user was inserted successfully!");
		}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	
	public ArrayList<User> getUser()
	{
		ArrayList<User> ur=new ArrayList<>();
		try
		{
		String sql = "SELECT * FROM users";
		Statement statement = (Statement) ConnectDB.getConnection().createStatement();
		ResultSet result = statement.executeQuery(sql);
		while (result.next()){
			User uu=new User();
			uu.setUsername(result.getString("username"));
		    uu.setPassword(result.getString("password"));
		    uu.setFullName(result.getString("fullname"));
		    uu.setEmail(result.getString("email"));
		    ur.add(uu);
		}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return ur;
	}

}
