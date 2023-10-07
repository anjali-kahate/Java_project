package com.action;

import java.util.ArrayList;

import com.Dao.DaoClass;
import com.connection.ConnectionDB;
import com.model.StudeClass;

public class ActionClass {
	public static DaoClass d= new DaoClass();
	ConnectionDB c= new ConnectionDB();
	
public static void main(String[] args) {
	StudeClass s = new StudeClass(null, null, 0); 
	s=new StudeClass("naval","pune",192);
	d.add(s);
//	s=new StudeClass("Maher","pune",345);
//	d.add(s);
//	int id=8;
//	d.delstud(id);
	DaoClass dc= new DaoClass();
//	ArrayList<StudeClass> studAry= dc.showAllRecord();
//	for(StudeClass sc : studAry )
//	{
//	showData(sc);
//	}
//	int a=1;
//	DaoClass dc1= new DaoClass();
//	StudeClass sc= dc.showOneRecord(a);
//	showData(sc);
//	s.setAddres(wnehdfvwevf);
//	s.setName(dfdwf);
	s.setId(9);
	s.setName("asdfg");
	s.setAddres("mnbv");
	s.setPhone_no(1234567);
	d.editstud(s);
}
public static void showData(StudeClass sc1)
{
	//ArrayList<StudeClass> Arr= new ArrayList<>();
	System.out.println("----------------------------------------------------");
	System.out.println("Student id is:-"+sc1.getId());
	System.out.println("Student name is:-"+sc1.getName());
	System.out.println("Student address is:-"+sc1.getAddres());
	System.out.println("Student phone no is:-"+sc1.getPhone_no());
	System.out.println("----------------------------------------------------");
}
}





