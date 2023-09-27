package com.menu;

import java.util.Scanner;
import java.util.spi.TimeZoneNameProvider;

import com.operation.NumProgramm;
import com.operation.PatternProgramm;
import com.operation.StringProgram;

public class MainClass {
public static void main(String args[])
{
	MainClass m=new MainClass();
	m.menu();
}
public static void menu()
{
	
	System.out.println("                                         ");
	System.err.println(">>>>>>>>> Welcome to this application <<<<<<<<<");
	System.out.println("                                          ");
	System.out.println(" ##### Welcome to Interview Programs #####");
	System.out.println("                                          ");
	System.out.println(" #- Main Menu -# ");
	System.out.println(" A. Number Programm. ");
	System.out.println(" B. String Programm. ");
	System.out.println(" C.Pattern Programm. ");
	System.out.println("                    ");
	System.out.print("Please Select Your Operation:-");
	Scanner s=new Scanner(System.in);
	String a=s.nextLine();
	option(a);
}
public static void option(String a1)
{
	switch (a1) {
	case "A":
		NumProgramm.numMenu();
		break;
	case "B":
		StringProgram.strProgramm();
		break;
	case "C":
		PatternProgramm.pattProgramm();
		break;

	default:
		System.err.print("Please Select valid menu");
		System.out.println("");
		menu();
		break;
	}
}
//	public static void time2()
//	{
//		try
//		{
//			Thread.sleep(10000);
//		}
//		catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//}
}
