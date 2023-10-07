import java.util.Scanner;

public class I_Pattern {
    public static void main(String[] args) {
         System.out.println("Enter number :- ");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
         int m=n/2;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if (i==1 || i==n || j==m) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
    }
}
