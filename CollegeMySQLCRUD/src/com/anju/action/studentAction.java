package com.anju.action;

import java.util.Scanner;

import com.anju.model.User;
import com.anju.model.student;
import com.anju.service.UserService;
import com.anju.service.studentService;

public class studentAction {
	static  studentService ss=new  studentService();
	static studentAction sa=new studentAction();
	static Scanner sc =new Scanner(System.in);
	static Scanner scint =new Scanner(System.in);
	
	public static void main(String args[])
	{
		sa.newstudent();
	}
	public void newstudent()
	{
		student u=new student();
		System.out.println("Enter User Details:-");
		//System.out.println("Enter studrntid:-");
		//u.setId(sc.nextInt());
		System.out.println("Enter Prn:-");
		u.setPrn(sc.nextLine());
		System.out.println("Enter Name:-");
		u.setName(sc.nextLine());
		System.out.println("Enter Corse:-");
		u.setCorse(sc.nextLine());
		System.out.println("Enter studrnt Age:-");
		u.setAge(scint.nextInt());
		System.out.println("Enter Address:-");
		u.setAddress(sc.nextLine());
		System.out.println("Do You WAnt to save Data(Y/N)");
		String saveFlag=sc.nextLine();
		
		System.out.println("new User");
		if(saveFlag.equalsIgnoreCase("Y"))
			ss.saveStudent(u);
		else
			System.out.println("data not saved");
	}

}
