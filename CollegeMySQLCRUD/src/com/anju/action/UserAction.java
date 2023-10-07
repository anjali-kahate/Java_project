package com.anju.action;

import java.util.ArrayList;
import java.util.Scanner;

import com.anju.model.User;
import com.anju.service.UserService;

public class UserAction {
	static UserService ss=new UserService();
	static UserAction sa=new UserAction();
	static Scanner sc =new Scanner(System.in);
	public static void main(String args[])
	{
		//sa.newUser();
		sa.getUser();
	}
	public void newUser()
	{
		User u=new User();
		System.out.println("Enter User Details:-");
		System.out.println("Enter UserName:-");
		u.setUsername(sc.nextLine());
		System.out.println("Enter Password:-");
		u.setPassword(sc.nextLine());
		System.out.println("Enter Fullname:-");
		u.setFullName(sc.nextLine());
		System.out.println("Enter Email:-");
		u.setEmail(sc.nextLine());
		System.out.println("Do You WAnt to save Data(Y/N)");
		String saveFlag=sc.nextLine();
		
		System.out.println("new User");
		if(saveFlag.equalsIgnoreCase("Y"))
			ss.saveUser(u);
		else
			System.out.println("data not saved");
	}
	
	
	public void getUser()
	{
		ArrayList<User> user= ss.getUser();
		
		for (int i = 0; i < user.size(); i++) {
			User ur=user.get(i);
			 System.out.println("Username:- "+ur.getUsername()+ "  Password:- "+ur.getPassword()+" Fullname :-"+ur.getFullName()+ " Email:-  "+ur.getEmail());			

		}
		
		/*for (User ur : user) {
		 
			 System.out.println("Username:- "+ur.getUsername()+ "  Password:- "+ur.getPassword()+" Fullname :-"+ur.getFullName()+ " Email:-  "+ur.getEmail());			
		}*/
	}
	
	
}
