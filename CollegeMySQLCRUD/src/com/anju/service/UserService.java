package com.anju.service;

import java.util.ArrayList;

import com.anju.dao.UserDao;
import com.anju.model.User;

public class UserService {
	
	UserDao sd=new UserDao();
	
	public void saveUser(User u)
	{
		System.out.println("save User");
		sd.insertUser(u);
	}

	public ArrayList<User> getUser()
	{
		return sd.getUser();
	}

}
