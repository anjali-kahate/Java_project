package com.anju.service;

import com.anju.dao.TecherDao;
import com.anju.model.Techer;

public class TecherService {
	
	 TecherDao td=new  TecherDao ();
	 
	 public void saveTecher(Techer t)
	 {
		 System.out.println("save user");
		 td.insertTecher(t);
	 }

}
