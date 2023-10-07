package com.anju.service;

import com.anju.dao.UserDao;
import com.anju.dao.studentDao;
import com.anju.model.User;
import com.anju.model.student;

public class studentService {
	studentDao sd=new studentDao();
	
	public void saveStudent(student u)
	{
		System.out.println("save User");
		sd.insertStudent(u);
	}

}
