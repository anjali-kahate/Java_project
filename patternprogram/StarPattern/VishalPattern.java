import java.util.Scanner;

public class VishalPattern {
    public static void main(String[] args) {
        System.out.print("Enter number:- ");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        VPattern(n);
        Ipattern(n);
        Spattern(n);
        Hpattern(n);
        APattern(n);
        LPattern(n);

    }

    public static void VPattern(int n)
    {
        System.out.println("                   ");
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
    }

    public static void Ipattern(int n)
    {
        System.out.println("                         ");
        int n1=n/2;
        
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if(i==1||i==n||j==n1)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
     public static void Spattern(int n)
    {
        System.out.println("                         ");
        int n1=n/2;
        int n3=n1/2;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j<=n; j++) {
                if(i==1||i==n||i==n1)
                //if((i == 0 || i == n / 2 || i == n - 1)) 
                {
                    System.out.print("*");
                }
                else if(i < n1 && j == 1){  
                    System.out.printf("*");  
                }
                else if(i > n1 && j == n){  
                    System.out.printf("*");
                }  
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

     public static void Hpattern(int n)
    {
        System.out.println("                         ");
        int n1=n/2;
        
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if(j==1||j==n||i==n1)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void APattern(int n)
    {
        System.out.println("                        ");
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

    public static void LPattern(int n)
    {
         System.out.println("                        ");
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                int m=n/2;
                if(j==1 || i==n){
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
