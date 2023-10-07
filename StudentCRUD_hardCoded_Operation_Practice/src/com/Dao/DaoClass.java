package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.action.ActionClass;
import com.connection.ConnectionDB;
import com.model.StudeClass;

public class DaoClass {
public void add(StudeClass s)
{
	try {
		System.out.println("insert Student");
	String sql="insert into student(name ,address ,phone_no) value(?,?,?)";          
    PreparedStatement ps= ConnectionDB.getConnection().prepareStatement(sql);
    ps.setString(1, s.getName());
    ps.setString(2, s.getAddres());
    ps.setInt(3, s.getPhone_no());
    
    int a=ps.executeUpdate();
    if (a>0) {
		System.out.println("new record insert successfully....!");
	}
	}catch (Exception e) {
	    e.printStackTrace();
	} 
}
public static void delstud(int id)
{
	try {
		System.out.println("Delete Student");
		String sql="delete from student where id=?";
		PreparedStatement p= ConnectionDB.getConnection().prepareStatement(sql);
		p.setInt(1, id);
		int rowdel=p.executeUpdate();
		if(rowdel>0)
		{
			System.out.println("Record Deleted Succesfully!.....");
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
}
public static ArrayList<StudeClass> showAllRecord()
{
	ArrayList<StudeClass> array=new ArrayList<>();
	Connection conn =ConnectionDB.getConnection();
	
	try {
		Statement s= conn.createStatement();
		System.out.println("Show data");
		String sql="Select * from Student";
		ResultSet rs=s.executeQuery(sql);
		while (rs.next()) {
			StudeClass st= new StudeClass(sql, sql, 0);
            st.setId(rs.getInt("id"));
			st.setName(rs.getString("name"));
			st.setPhone_no(rs.getInt("phone_no"));
			st.setAddres(rs.getString("address"));
			array.add(st);
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	return array;
}
public static StudeClass showOneRecord(int id)
{
	  StudeClass st= new StudeClass(null, null, id);
	try {
		System.out.println("Show data");
		String sql="Select * from Student where id=?";
		PreparedStatement ps= ConnectionDB.getConnection().prepareStatement(sql);
	    ps.setInt(1, id);
		
		ResultSet rs=ps.executeQuery();
		while (rs.next()) {
			st.setId(rs.getInt("id"));
			st.setName(rs.getString("name"));
			st.setPhone_no(rs.getInt("phone_no"));
			st.setAddres(rs.getString("address"));
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	return st;
}
public static void editstud(StudeClass st)
{
	try {
		String sql="update student set name=?, address=?, phone_no=? where id=?";
		PreparedStatement ps= ConnectionDB.getConnection().prepareStatement(sql);
				ps.setString(1, st.getName());
				ps.setString(2, st.getAddres());
				ps.setInt(3, st.getPhone_no());
				ps.setInt(4, st.getId());
				
				int rowUpdate = ps.executeUpdate();
				if(rowUpdate>0)
				{
					System.out.println("update successfully!.....");
				}
			}
	catch (Exception e) {
		e.printStackTrace();
	}
}
}
