import java.util.Scanner;

public class APatternProgram {
    public static void main(String[] args) {
        System.out.println("Enter num = ");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                int m=n/2;
                if(i==1 || j==1 ||j==n || i==m){
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
