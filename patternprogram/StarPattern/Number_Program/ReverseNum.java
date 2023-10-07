package Number_Program;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        int r,sum=0,n1;
        System.out.print("Enter number :- ");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        n1=n;
        while (n>0) {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        
        System.out.println(n1+" = "+sum);
    }
}
