import java.util.Scanner;

public class NAVELpattern {
    public static void main(String[] args) {
        System.out.println("Enter number :- ");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        NPattern(n);
        APattern(n);
        VPattern(n);
        APattern(n);
        LPattern(n);
        Ipattern(n);
        LovePattern(n);
        Ypattern(n);
        Opattern(n);
        Upattern(n);
        
    }
    public static void NPattern(int n)
    {
        System.out.println("                    ");
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if (i==j || j==n || j==1) {
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

        public static void Ipattern(int n)
        {
             System.out.println("                    ");
              System.out.println("                    ");
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

        public static void LovePattern(int n1)
        {
            System.out.println("                  ");
            System.out.println("                      ");
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
     
    public static void Ypattern(int n1)
    {
         System.out.println("                    ");
         System.out.println("                      ");

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

    public static void Opattern(int n)
    {
        System.out.println("                        ");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==1 || j==n ||j==1||i==n)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void Upattern(int n)
    {
         System.out.println("                        ");
         System.out.println("                          ");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if((j==n || j==1) && i!=n || (i==n && j<n && j>1))
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
