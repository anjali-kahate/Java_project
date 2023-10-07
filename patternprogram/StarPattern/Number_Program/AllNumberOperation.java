package Number_Program;

import java.util.Scanner;

public class AllNumberOperation {
    public static void main(String[] args) {
        System.out.println("Enter Number :- ");
        Scanner s= new Scanner(System.in);
        int n1=s.nextInt();
         System.out.println("               ");
        evenOddNum(n1);
        armstrongNum(n1);
        primeNum(n1);
        palindromeNum(n1);
        perfectNum(n1);
        factorial(n1);
        FibonacciSeries(n1);
    } 

    public static void evenOddNum(int n)
    {
        if (n%2==0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }

    public static void armstrongNum(int n)
    {
        int num,
        cubeSum=0,
        r;
        num=n;
        while (num>0) {
            r=num%10;
            cubeSum= cubeSum + (r*r*r);
            num = num/10;
        }
      if (n==cubeSum) {
        System.out.println("Armstrong number");
      } else {
        System.out.println("Not Armstrong number");
      }
    }

    public static void primeNum(int n)
    {
        int m=n/2;
        int flag=0;

        if(n==0 || n==1 || n==4){
            System.out.println("Not prime number");
        }
        else{
            for (int i = 2; i < m; i++) {
                if (n%i==0) {
                     System.out.println("Not prime number");
                     flag=1;
                }
            }
            if(flag==0){
                 System.out.println("prime number");
            }
        }
    }

    public static void palindromeNum(int n)
    {
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

    public static void factorial(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
          fact=fact*i;  
        }
        System.out.println(n+ " Factorial Number  :- "+fact);
    }

    public static void FibonacciSeries(int n)
    {
        int a=0,b=1,c;
         System.out.println("Fibonacci Seres of "+n+" Number ");
        for (int i = 0; i <n; i++) {

            System.out.print(a+" ,");
           c= a+b;
           a=b;
           b=c;
        }
    }

    public static void perfectNum(int n)
    {
        int sum=0;
        for (int i = 1; i < n; i++) {
            if (n%i==0) {
              sum = sum + i;
            }
        }
        if (n==sum) {
            System.out.println("Perfact num");
        } else {
            System.out.println("Not Perfact num");
        }
    }
}
