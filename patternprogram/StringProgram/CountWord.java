package StringProgram;

import java.util.Scanner;

// Q 1) Java Program to count the total number of characters in a string ?

public class CountWord {
    public static void main(String[] args) {
        
        System.out.print("Emter String :- ");
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();

        int count=0;

        for(int i=0;i<=s.length()-1;i++)
        {
            if (s.charAt(i)!=' ') {
                count++;
            }
        }
        System.out.println("Total character :- "+count);

    }
}
