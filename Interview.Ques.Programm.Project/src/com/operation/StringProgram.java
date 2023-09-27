package com.operation;

import java.util.Scanner;
import java.util.StringTokenizer;

import com.menu.MainClass;

public class StringProgram {
	public static void strProgramm()
	{
		String con="";
		do {
		System.out.println("                ");
		System.err.println(" ***** Find String Programm ***** ");
		System.out.println("                                   ");
		System.out.println(" ---1. Reverse String ---- ");
		System.out.println(" ---2. Reverse each word for sentances same position ----");
		System.out.println(" ---*3. Reverse all sentance without a faction any word ----");
		System.out.println(" ---4. Find String is palindrom or not ----");
		System.out.println(" ---5. Find string is Anagram or not ----");
		System.out.println(" ---6. Convert all string in Upper case ----");
		System.out.println(" ---7. Find each word length ----");
		System.out.println(" ---*8. Find char prasent ----");
		System.out.println(" ---*9. Find Entered char how many time present ----");
		System.out.println(" ---*10. Remove dublicates from String ----");
		System.out.println(" ---11. Convert all string in lower case ----");
		System.out.println(" ---12. Find total Vowels ----");
		System.out.println(" ---*13. Find each vowels how many time repetade ----");
		System.out.println(" ---14. Go Back Menu ----");
		System.out.println("                ");
		System.out.println("Enter number:- ");
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		stringMenu(s);
		System.out.println("                             ");
		System.out.println("Do you want to continu type(Y/N):- ");
		Scanner sc1= new Scanner(System.in);
		con=sc1.nextLine();
		
		}while(con.equalsIgnoreCase("y"));
	}
	public static String getstr()
	{
		System.out.println("Enter String:- ");
		Scanner sc1= new Scanner(System.in);
		String s1=sc1.nextLine();
		String s2=sc1.nextLine();
		return s1;
	}
 public static void stringMenu(int s)
 {
	 switch (s) {
	case 1:
		reverseString(getstr());
		break;
    case 2:
    	reverseEachWord(getstr());
		break;
    case 3:
		reverseAllSentance(getstr());
		break;
    case 4:
    	palindrom(getstr());
	    break;
    case 5:
    	stringAnagram(getstr(), null);
	    break;
    case 6:
    	convertAllStrUpp(getstr());
	    break;
    case 7:
    	wordLength(getstr());
	    break;
    case 8:
    	findCharPrasent(getstr());
	    break;
    case 9:
    	findEnteredCharHowManyTime(getstr());
	    break;
    case 10:
    	remDubliFromString(getstr());
	    break;
    case 11:
    	lowerCase(getstr());
	    break;
    case 12:
    	totalVowels(getstr());
	    break;
    case 13:
    	eachVowelHowManyTime(getstr());
	    break;
    case 14:
    	GoBackMenu();
	    break;
   
	default:
		break;
	}
 }
private static void stringAnagram(String s1,String s2) {
	int a=s1.length()-1;
	char ch[]=s2.toCharArray();
	int b=ch.length-1;
	if(a==b)
	{
		int k=0;
	for(int i=0;i<=a;i++)
	{
		for(int j=0;j<=b-k;j++)
		{
			if(s1.charAt(i)==ch[j])
			{
				char temp=ch[j];
				ch[j]=ch[b-k];
				ch[b-k]=temp;
				k++;
			}
		}
	}
	if(a==k-1)
		System.out.println("it is Anagram");
	else
		System.out.println("Not Anagram");
	}
	
}
private static void eachVowelHowManyTime(String s) {
	
	
}
private static void GoBackMenu() {
	MainClass.menu();
}
private static void totalVowels(String s) {
	char ch[]=s.toCharArray();
	char v[]= {'a','e','i','o','u'};
	char vowleCount=0;
	for(int i=0;i<ch.length;i++)
	{
		for(int j=0;j<v.length;j++)
		{
			if(ch[i]==v[j])
			{
				vowleCount++;
			}
		}
	}
	System.out.println("Total vowels count :- "+vowleCount);
}
private static void lowerCase(String s) {
	System.out.println(s.toLowerCase());
	
}
private static void remDubliFromString(String s) {
	
	
}
private static void findEnteredCharHowManyTime(String s) {
	
	
}
private static void findCharPrasent(String s) {
 System.out.println("String:- "+s);
	 
	 System.out.println("Enter index char:- ");
	 Scanner s1=new Scanner(System.in);
		String n=s1.nextLine();
		char index=0;
		int index1=s.indexOf(n.charAt(index));
		System.out.println("n is at index:- "+index); 
	
}
private static void wordLength(String s) {
	System.out.println(s.length());
	
}
private static void convertAllStrUpp(String s) {
	System.out.println(s.toUpperCase());
}
private static void palindrom(String s) {
	String rev="";
	boolean ans=false;
	for(int i=s.length()-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
	}
	if(s.equals(rev))
		System.out.println("Given String is Palindrome:- "+s);
	else
		System.out.println("Given String is  Not Palindrome:- "+s);
	
}
private static void reverseAllSentance(String s) {
	
	
}
private static void reverseEachWord(String s) {
	 String t;
	 StringTokenizer st=new StringTokenizer(s);
	 while (st.hasMoreTokens()) {
		t = st.nextToken();
	   System.out.print(new StringBuilder(t).reverse().toString()+" ");	
	}
}
private static void reverseString(String s) {
	char ch[]=s.toCharArray();
	String rev="";
	for(int i=ch.length-1;i>=0;i--)
	{
		rev=rev+ch[i];
	}
	System.out.println("Actual String:- "+s);
	System.out.println("Reverse String:- "+rev);
}
}
