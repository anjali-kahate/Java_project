package Emp.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Emp.model.EmployModel;
import utility.DBConnection;

public class EmployDao {
	public void addemploy(EmployModel emp)
	{
		try {
		System.out.println("Insert Employ record");
		String Url="insert into empinfo(EmpId ,EmpName ,EmpSalary ,EmpPhone ,EmpAddress) values(?,?,?,?,?)";
		PreparedStatement statement = DBConnection.getConnection().prepareStatement(Url);
		statement.setInt(1, emp.getEmpId());
		statement.setString(2,emp.getEmpName());
		statement.setFloat(3, emp.getEmpSalary());
		statement.setInt(4, emp.getEmpPhone());
		statement.setString(5, emp.getEmpAddress());
		int rowsInserted= statement.executeUpdate();
		if(rowsInserted>0)
		{
			System.out.println("Insert successfully!");
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public ArrayList<EmployModel> showemploy()
	{  
		     ArrayList<EmployModel> emparray=new ArrayList<>();
		     Connection con =DBConnection.getConnection();
		try {
			System.out.println("show Employ record");
			Statement st= con.createStatement();
			ResultSet rs =st.executeQuery("select * from empinfo");
			while(rs.next())
			{
				EmployModel e1=new EmployModel();
				e1.setEmpId(rs.getInt("EmpId"));
				e1.setEmpName(rs.getString("EmpName"));
				e1.setEmpSalary(rs.getFloat("EmpSalary"));
				e1.setEmpPhone(rs.getInt("EmpPhone"));
				e1.setEmpAddress(rs.getString("EmpAddress"));
				emparray.add(e1);
			}
			
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emparray;
	}
		public EmployModel getemploybyid(int id)
		{  
			EmployModel e2=new EmployModel();
			try {
				System.out.println("show Employ record");
				String URL="select * from empinfo where EmpId=?";
				PreparedStatement ps=DBConnection.getConnection().prepareStatement(URL);
				ps.setInt(1, id);
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					EmployModel e1=new EmployModel();
					e1.setEmpId(rs.getInt("EmpId"));
					e1.setEmpName(rs.getString("EmpName"));
					e1.setEmpSalary(rs.getFloat("EmpSalary"));
					e1.setEmpPhone(rs.getInt("EmpPhone"));
					e1.setEmpAddress(rs.getString("EmpAddress"));
				}
			}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return e2;
			}
		public void updateempRecord(EmployModel em)
		{  
			//EmployModel e2=new EmployModel();
			try {
				System.out.println("update Employ record");
				String URL="update empinfo set EmpName=?,EmpSalary=?,EmpPhone=?,EmpAddress=? where EmpId=?";
				PreparedStatement ps=DBConnection.getConnection().prepareStatement(URL);
				ps.setString(1,em.getEmpName());
				ps.setFloat(2, em.getEmpSalary());
				ps.setInt(3, em.getEmpPhone());
				ps.setString(4, em.getEmpAddress());
				ps.setInt(5, em.getEmpId());
				int rowsupdated= ps.executeUpdate();
				if(rowsupdated>0)
				{
					System.out.println("update successfully!");
				}
				
			}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		public void deleteEmployRecord( int id)
		{
			try {
				
				String URL="delete from empinfo where EmpId=?";
				PreparedStatement ps=DBConnection.getConnection().prepareStatement(URL);
				ps.setInt(1, id);
				int rowsdeleted=ps.executeUpdate();
				if (rowsdeleted>0) {
					System.out.println("delete successfully!");
				}	
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
}
