package Number_Program;

import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {
        System.out.println("Enter num:- ");
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();

        int r,sum=0,num;
        num=n;
        while (n>0) {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }

        if (num==sum) {
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not Palindrome Number");
        }
    }
}
