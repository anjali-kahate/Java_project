package com.anju.action;

import java.util.ArrayList;
import java.util.Scanner;

import com.anju.dao.TecherDao;
import com.anju.model.Techer;
import com.anju.model.User;
import com.anju.service.TecherService;

public class TecherAction {
	static TecherService ts=new TecherService();
	static TecherDao td=new TecherDao();
	static TecherAction ta=new TecherAction();
	static Scanner s=new Scanner(System.in);
	static Scanner a=new Scanner(System.in);
	public static void main(String arg[])
	{
		//ta.newTecher();
		ta.getTecher();
	}
	
	public void newTecher()
	{
		Techer t=new Techer();
		System.out.println("Enter teacher Information");
		System.out.println("Enter Name");
		t.setName(s.nextLine());
		System.out.println("Enter Address");
		t.setAddress(s.nextLine());
		System.out.println("Enter Department");
		t.setDepartment(s.nextLine());
		System.out.println("Enter Salary");
		t.setSalary(a.nextFloat());
		System.out.println("Enter Age");
		t.setAge(s.nextLine());
		System.out.println("Do You WAnt to save Data(Y/N)");
		String saveFlag=s.nextLine();
		
		System.out.println("new User");
		if(saveFlag.equalsIgnoreCase("Y"))
			ts.saveTecher(t);
		else
			System.out.println("data not saved");
	}
	public void getTecher()
	{
		ArrayList<Techer> techer= td.getTecher();
		
		for (int i = 0; i < techer.size(); i++) {
			Techer tr=techer.get(i);
			 System.out.println("Name:- "+tr.getName()+ "  Address:- "+tr.getAddress()+" Department:-"+tr.getDepartment()+ "  Salary:-  "+tr.getSalary()+ "  Age:-  "+tr.getAge());			

		}

	}
}
