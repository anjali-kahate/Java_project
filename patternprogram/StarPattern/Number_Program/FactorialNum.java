package Number_Program;

import java.util.Scanner;

public class FactorialNum {
    public static void main(String[] args) {
        System.out.println("Enter num:- ");
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();

        int fact=1;
        for(int i=1;i<=n;i++)
        {
          fact=fact*i;  
        }
        System.out.println(n+ " Factorial Number  :- "+fact);
    }
}
