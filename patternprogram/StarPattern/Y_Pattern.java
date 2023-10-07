import java.util.Scanner;

public class Y_Pattern {
    public static void main(String[] args) {
         System.out.println("Enter number :- ");
        Scanner sc= new Scanner(System.in);
        int n1= sc.nextInt();
        int n=n1/2;
        int i,j;
        for ( i = 1; i <=n; i++) 
        {
            for ( j = 1; j <=i; j++) {
                System.out.print(" ");
            }
            for(int k=n;k>=i;k--){
                if(k==n ){
                System.out.print("*");
                }
                else{
                System.out.print(" ");
                }
            }
           for(int l=n-1;l>=i;l--)
           {
              if(l==i)
              System.out.print("*");
              else
              System.out.print(" ");
           
           }
           System.out.println();
        }
        for(int m=1;m<=n;m++)
        {
            for(int p=1;p<=n1;p++)
            {
                if (p==(n+1)) {
                     System.out.print("*");
                } else {
                    System.out.print(" ");
                }
               
            }
            System.out.println();
        }
    }
}
