package NumberPattern;

import java.util.Scanner;

public class NumPattern {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter num= ");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for (int i = 1; i <=n; i++) {
            num=1;
            for (int j = 1; j <=n; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
