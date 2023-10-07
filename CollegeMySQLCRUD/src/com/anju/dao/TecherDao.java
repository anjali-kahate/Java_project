package com.anju.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.anju.conn.ConnectDB;
import com.anju.model.Techer;
import com.anju.model.User;
import com.mysql.jdbc.Statement;

public class TecherDao {
	public void insertTecher(Techer t)
	{
		try
		{
			System.out.println("insert techer");
			String sql="INSERT INTO teachers(name, address, department, salery, Age)VALUE(?, ?, ?, ?, ?)";
			PreparedStatement statement = ConnectDB.getConnection().prepareStatement(sql);
			statement.setString(1, t.getName());
			statement.setString(2, t.getAddress());
			statement.setString(3, t.getDepartment());
			statement.setFloat(4, t.getSalary());
			statement.setString(5, t.getAge());
			int rowInserted=statement.executeUpdate();
			if(rowInserted > 0)
				System.out.println("A new techer recored insert successfully!");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public ArrayList<Techer> getTecher()
	{
		ArrayList<Techer> tr=new ArrayList<>();
		try
		{
		String sql = "SELECT * FROM teachers";
		Statement statement = (Statement) ConnectDB.getConnection().createStatement();
		ResultSet result = statement.executeQuery(sql);
		while (result.next()){
			Techer tt=new Techer();
			tt.setName(result.getString("name"));
		    tt.setAddress(result.getString("address"));
		    tt.setDepartment(result.getString("department"));
		    tt.setSalary(result.getFloat("salery"));
		    tt.setAge(result.getString("age"));
		    tr.add(tt);
		}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return tr;
	}

}


