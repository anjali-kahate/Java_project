package Number_Program;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        System.out.println("Enter num:- ");
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();

        int m=n/2;
        int flag=0;

        if(n==0 || n==1 || n==4){
            System.out.println(" Not prime number");
        }
        else{
            for (int i = 2; i < m; i++) {
                if (n%i==0) {
                     System.out.println(" Not prime number");
                     flag=1;
                }
            }
            if(flag==0){
                 System.out.println("prime number");
            }
        }
    }
}
