package StringProgram;

import java.util.Scanner;

// Q 3) Java Program to count the total number of punctuation characters exists in a String

public class CountAllSpacialSymbol {
    public static void main(String[] args) {
        System.out.println("Enter String :-");
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        for(int i=0;i<=s.length()-1;i++)
        {
            if(s.charAt(i)==' ' || s.charAt(i)=='.'  || s.charAt(i)==','  || s.charAt(i)=='/' 
            || s.charAt(i)=='<' || s.charAt(i)=='>' || s.charAt(i)=='!' || s.charAt(i)=='@'
            || s.charAt(i)=='#' || s.charAt(i)=='$' || s.charAt(i)=='%' || s.charAt(i)=='^'
            ||s.charAt(i)=='&'  ||s.charAt(i)=='*'  ||s.charAt(i)=='('  ||s.charAt(i)==')'
            ||s.charAt(i)=='_'  ||s.charAt(i)=='-'  ||s.charAt(i)=='='  ||s.charAt(i)=='+'
            ||s.charAt(i)=='?'  ||s.charAt(i)=='{'  ||s.charAt(i)=='}'  ||s.charAt(i)=='['
            ||s.charAt(i)==']'  ||s.charAt(i)=='|'  ||s.charAt(i)==';'  ||s.charAt(i)==':'
            ||s.charAt(i)=='~'  ||s.charAt(i)=='`'  )
            {
                count++;
            }
        }
        System.out.println("All Character Symbol Count :- "+count);
    }
}
