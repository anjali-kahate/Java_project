package Number_Program;

import java.util.Scanner;

public class FibonacciNum {
    public static void main(String[] args) {
        System.out.println("Enter num :- ");
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();

        int a=0,b=1,c;
         System.out.println("Fibonacci Seres of "+n+" Number ");
        for (int i = 0; i <n; i++) {

            System.out.println(a);
           c= a+b;
           a=b;
           b=c;
        }
    }
}
