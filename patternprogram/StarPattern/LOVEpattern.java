import java.util.Scanner;

public class LOVEpattern {
    public static void main(String[] args) {
        System.out.println("Enter number :- ");
        Scanner sc= new Scanner(System.in);
        int n1= sc.nextInt();
        int n=n1/2;
        int n2=((n*2)/4)*3;
        // Upper Part
        
        for(int i=1;i<=n;i++)
        {

         //--------- Left ------------------
            int k;

            for(int j=n;j>=i;j--)
            {
                System.out.print(" ");
            }
            for( k=2;k<=i-1;k++)
            {
                System.out.print("*");
            }
            for(int l=2;l<=i-1;l++)
            {
                System.out.print("*");
            }
            
            //---------- Midel ------------------------------
            int j;
            for ( j = k-1; j <=i; j++) {
                System.out.print(" ");
            }
            for(int k1=n;k1>=i;k1--){
                System.out.print(" ");
            }
           for(int l=n;l>=i;l--)
           {
             
              System.out.print(" ");
           }

           //------------- Right ----------------------

            for(int k2=2;k2<=i-1;k2++)
            {
                System.out.print("*");
            }
            for(int l=2;l<=i-1;l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower Part
         int j;
         for(int i=1;i<=n2;i++){
            for ( j = 1; j <=i; j++) {
                System.out.print(" ");
            }
            for(int k1=n2;k1>=i;k1--){
               
                System.out.print("*");
            }
           for(int l=n2;l>=i;l--)
           {
              System.out.print("*");
           }
           System.out.println();
        }
    }
}
