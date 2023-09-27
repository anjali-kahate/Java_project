package com.operation;

import java.util.Scanner;

import com.menu.MainClass;
import com.patternMenu.CharacterPatt;
import com.patternMenu.NumberPatt;
import com.patternMenu.StarPatt;
import com.patternOperation.CharacterPatterns;
import com.patternOperation.NumberPattern;
import com.patternOperation.StarPattern;

public class PatternProgramm {
	public static void pattProgramm()
	{
		String con="";
		do {
		System.out.println("                                   ");
		System.out.println("******* Find Pattern Programm *******");
		System.out.println("                                  ");
		System.out.println(" ---- 1. Star Patterns -------");
		System.out.println(" ---- 2. Numeric Patterns ---- ");
		System.out.println(" ---- 3. Character Patterns --");
		System.out.println(" ---- 4. Go To Menu ----------");
		System.out.println("                       ");
		System.out.println(" Enter operation Number:- ");
		Scanner s= new Scanner(System.in);
		int a=s.nextInt();
		operation(a);
		System.out.println("                  ");
		System.out.println("Do you Want to continu type (Y/N):- ");
		Scanner s1=new Scanner(System.in);
		con=s1.nextLine();
		}while(con.equalsIgnoreCase("y"));
		System.err.println("Exit");
	}
 public static void operation(int n)
 {
	switch (n) {
	case 1:
		StarPatt.starPattern();
		break;
    case 2:
	    NumberPatt.numPattern();
		break;
    case 3:
	    CharacterPatt.charPattern();
	    break;
    case 4:
    	goToMenu();
	    break;

	default:
		break;
	} 
 }
 public static void goToMenu()
 {
	 MainClass.menu();
 }
}
