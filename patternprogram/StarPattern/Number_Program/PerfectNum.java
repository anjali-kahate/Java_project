package Number_Program;

import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        System.out.println("Enter num:-");
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
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
