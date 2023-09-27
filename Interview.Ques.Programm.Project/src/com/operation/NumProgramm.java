package com.operation;

import java.util.Scanner;

import com.menu.MainClass;

public class NumProgramm {
	public static void numMenu()
	{
		String con="";
		do {
		System.out.println("                           ");
		System.err.println(" **** Find Number Programm **** ");
		System.out.println(" --1. Even or Odd Number.");
		System.out.println(" --2. Prime Number.");
		System.out.println(" --3. Palindrom Number.");
		System.out.println(" --4. Aromstrong Number.");
		System.out.println(" --5. factorial Number. ");
		System.out.println(" --6. fibbonicey series.");
		System.out.println(" --7. Perfact Number.");
		System.out.println(" --8. Number Square.");
		System.out.println(" --9. Number Cube.");
		System.out.println(" --10. Square Root.");
		System.out.println(" --*11. Cube Root.");
		System.out.println(" --*12. Reverse Number.");
		System.out.println(" --13. Number Factor.");
		System.out.println(" --14. Go to main Menu.");
		System.out.println("                         ");
		System.out.print("Please select your operation:-");
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
		numberMenu(a);
		System.out.print("Do You Want Continu (Y/N) :-");
		Scanner s=new Scanner(System.in);
		con=s.nextLine();
		}while(con.equalsIgnoreCase("y"));
		System.err.println("Exit");
		System.exit(0);
	}
	public static int getIntValue()
	{
		System.out.println("Enter number:-");
		Scanner s2=new Scanner(System.in);
		int n=s2.nextInt();	
		return n;
	}
	public static void numberMenu(int a)
	{
		switch (a) {
		case 1:
			evenOddNum(getIntValue());
			break;
        case 2:
        	primeNum(getIntValue());
			break;
        case 3:
        	palindromNum(getIntValue());
        	break;
        case 4:
        	aromstrongNum(getIntValue());
        	break;
        case 5:
        	factorialNum(getIntValue());
        	break;
        case 6:
        	fibboniceyNum(getIntValue());
        	break;
        case 7:
        	perfactNum(getIntValue());
        	break;
        case 8:
        	squareNum(getIntValue());
        	break;
        case 9:
        	cubeNum(getIntValue());
        	break;
        case 10:
        	squareRoot(getIntValue());
        	break;
        case 11:
        	cubeRoot(getIntValue());
        	break;
        case 12:
        	reverseNum(getIntValue());
        	break;
        case 13:
        	numFactor(getIntValue());
        	break;
        case 14:
        	goToMainMenu();
        	break;
       
        	
        case 15:
		default:
			break;
		}
		
	}
	
	private static void goToMainMenu() {
		MainClass.menu();	
	}
	
	private static void numFactor(int n) {
		System.out.println("n="+n);
		for(int i=1;i<n;i++)
   	 {
   	 if(n%i==0)
   	 {
   		 System.out.println(i);
   	 }
   	 }
		
	}
	private static void reverseNum(int n) {
		int rev=0;
		while(n!=0)
		{
		 int remainder=n%10;
		 rev=rev*10+remainder;
		 n=n/10;
		}
		System.out.println("Reverse of Given number:- "+rev);
	}
	private static void cubeRoot(int n) {
		System.out.println(Math.cbrt(n));
		
	}
	private static void squareRoot(int n) {
		int a=0,b = 0;
   	 for(int i=2;i<n;i++)
   	 {
   	 if(n>0)
   	 {
   		 n=a;
   		 b=a*n;
   	 }
   	 }
   	 if(n==b) {
   		 System.out.println(b);
   	 }
   	 System.out.println(Math.sqrt(n));  //methods
	}
	private static void cubeNum(int n) {
		
		int cub=n*n*n;
		System.out.println(cub);	
	}
	private static void squareNum(int n) {
			int sq=n*n;
			System.out.println(sq);
		
	}
	private static void perfactNum(int n) {
		int k=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			k++;
			break;
		}
		if(k==0)
			 System.out.println("Perfact number");
		else
		 System.out.println("Not perfact number");
	}
	private static void fibboniceyNum(int n) {
		 int n1=0,n2=1,n3;
    	 System.out.print(n1+" "+n2);
    	 for(int i=2;i<n;i++)
    	 {
    		n3=n1+n2;
    		System.out.print(" "+n3);
    		n1=n2;
    		n2=n3;
    	}
		
	}
	private static void factorialNum(int n) {
		System.out.println(n);
	int a = 1;
   	 for(int i=1;i<=n;i++)
   	 {
   		 a=a*i;
   		 System.out.println(a);
   	 }
	}
	private static void aromstrongNum(int n) {
	 int k=n;
   	 int p=0,s=0;
   	while(n>0)
   	{
   	  p=n%10;
   	  s+=p*p*p;
   	  n=n/10;
   	}
   	if(k==s)
   	{
   		System.out.println("Aromstrong number");
   	}
   	else
   	{
   		System.out.println("not Aromstrong number");
   	}	
	}
	private static void palindromNum(int n) {
	 System.out.println(n);
   	 int r,sum=0,temp;
   	 temp=n;
   	 while(n>0) {
   	 r=n%10;
   	 sum=(sum*10)+r;
   	 n=n/10;
   	 }
   	 if(temp==sum)
   	 {
   		 System.out.println("Palindrom number");
   	 }
   	 else
   	 {
   		 System.out.println("not Palindrom number");
   	 }	
	}
	private static void primeNum(int n) {
		int k=0;
   	 for(int i=2;i<=n-1;i++)
   	 {
   		 if(n%i==0)
   		 k++;
   		 break;
   	 }
   	 if(k==0)
   		 System.out.println("prime number");
   	 else
   		 System.out.println("not prime number");
	}
	private static void evenOddNum(int a) {
		
		if(a%2==0)
		System.out.println("Even num");
		else
			System.out.println("odd number");
	}

}
