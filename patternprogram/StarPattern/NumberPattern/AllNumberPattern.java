package NumberPattern;

import java.util.Scanner;

public class AllNumberPattern {
    public static void main(String[] args) {
        System.out.println("Enter Number :- ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        oneNumPattern(n);
        oneLeftNumPattern(n);
        oneTopRightNumPattern(n);
        onePyramidNumPattern(n);
        oneRightNumPattern(n);
    }
    public static void oneNumPattern(int n)
    {
        System.out.println("One num Pattern");
       int num=1;
       for (int i = 1; i <=n; i++) {
        for (int j = 1; j <=n; j++) {
            System.out.print(num+" ");
        }
        System.out.println();
       }
    }

     public static void oneLeftNumPattern(int n)
    {
       int num;
       System.out.println("                   ");
       System.out.println("One Left Num Pattern");
       for (int i = 1; i <=n; i++) {
        num=1;
        for (int j = 1; j <=i; j++) {
            System.out.print(num+" ");
        }
        System.out.println();
       }
    }

     public static void oneTopRightNumPattern(int n)
    {
       int num;
       System.out.println("                   ");
       System.out.println("one Top Right Num Pattern");
       System.out.println(" ");
       for (int i = 1; i <=n; i++) {
        num=1;
        for (int j = 1; j <=i; j++) {
            System.out.print(" ");
        }
        for (int k = n; k>=i; k--) {
            System.out.print(num+"");
        }
        System.out.println();
       }
    }

     public static void onePyramidNumPattern(int n)
    {
       int num;
       System.out.println("                   ");
       System.out.println("one Pyramid Num Pattern");
       for (int i = 1; i <=n; i++) {
        num=1;
        for (int j = 1; j <=i; j++) {
            System.out.print(" ");
        }
        for (int k = n; k>=i; k--) {
            System.out.print(num+" ");
        }
        System.out.println();
       }
    }

    public static void oneRightNumPattern(int n)
    {
       int num;
       System.out.println("                   ");
       System.out.println("one Right Num Pattern");
       for (int i = 1; i <=n; i++) {
        num=1;
        for (int j = 1; j <=i; j++) {
            System.out.print(" ");
        }
        for (int k = n; k>=i; k--) {
            System.out.print(num+" ");
        }
        System.out.println();
       }
    }

    
    
}
