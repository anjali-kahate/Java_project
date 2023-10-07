package com.anju.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.anju.conn.ConnectDB;
import com.anju.model.User;
import com.anju.model.student;

public class studentDao {
	public void insertStudent(student u)
	{
		try {
		System.out.println("insert student");
		String sql = "INSERT INTO student (PRN, Name, Course, Age, Address) VALUES (?, ?, ?, ?, ?)";
		PreparedStatement statement = ConnectDB.getConnection().prepareStatement(sql);
		//statement.setInt(1, u.getId());
		statement.setString(1, u.getPrn());
		statement.setString(2, u.getName());
		statement.setString(3, u.getCorse());
		statement.setInt(4, u.getAge());
		statement.setString(5, u.getAddress());
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

}
