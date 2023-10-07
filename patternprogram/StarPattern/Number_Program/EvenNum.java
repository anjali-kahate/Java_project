package Number_Program;

import java.util.Scanner;

public class EvenNum {
    public static void main(String[] args) {
         
        System.out.println("Enter number :- ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if (n%2==0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}
