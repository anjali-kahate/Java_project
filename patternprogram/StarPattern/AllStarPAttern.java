import java.util.Scanner;

public class AllStarPAttern {
    public static void main(String[] args) {
       BoxPattern();
       LeftSidePattern();
       RightSidePattern();
       LeftTopPattern();
       HollowBoxPattern();
       HollowLeftTringlePattern();
       HollowRightTringlePattern();
       topRightTringlePattern();
       HollowTopRightTringlePattern();
       TopPyramidPattern();
       bottamPyramidPattern();
       
    }

    public static void BoxPattern()
    {
        System.out.println(" Box Pattern");
        System.out.print("Enter Number:-");
        Scanner s1=new Scanner(System.in);
        int n= s1.nextInt();
        for (int i = 0; i <n; i++) {
            for(int j=1;j<=n;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void LeftSidePattern()
    {
        System.out.println("Left Side triangel Pattern");
       System.out.print("Enter Number:-");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void LeftTopPattern()
    {
         System.out.println("top Left triangel Pattern");
        System.out.print("Enter Number:-");
        Scanner s2=new Scanner(System.in);
        int n= s2.nextInt();
        for (int i = 1; i <=n; i++) {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void RightSidePattern()
    {
       
         System.out.println("Right side triangel Pattern");
        System.out.print("Enter Number:-");
        Scanner s3=new Scanner(System.in);
        int n= s3.nextInt();
        for (int i = 1; i <=n; i++) {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("   ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void HollowBoxPattern()
    {
        System.out.println("Hollow Box Pattern");
        System.out.print("Enter Number:-");
        Scanner s3=new Scanner(System.in);
        int n= s3.nextInt();
        for (int i = 1; i <=n; i++) {
            int j;
            for(j=1;j<=n;j++)
            {
                if (i==1 || j==1 || i==n || j==n) {
                     System.out.print(" * ");
                }
                else{
                System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void HollowLeftTringlePattern()
    {
        System.out.println("Hollow Left triangel Pattern");
        System.out.print("Enter Number:-");
        Scanner s3=new Scanner(System.in);
        int n= s3.nextInt();
        for (int i = 1; i <=n; i++) {
            int j;
            for(j=1;j<=n;j++)
            {
                if (i==j || j==1 || i==n ) {
                     System.out.print(" * ");
                }
                else{
                System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void HollowRightTringlePattern()
    {
        System.out.println("Hollow Right triangel Pattern");
        System.out.print("Enter Number:-");
        Scanner s3=new Scanner(System.in);
        int n= s3.nextInt();
       
             int i,j,k;
             for ( i = 1; i <=n; i++) {
                for( j=1;j<=n-i;j++)
                 {
                   System.out.print("   ");
                 }
                 for( k=1;k<=i;k++)
                 {
                    if(i==n || k==i || k==1)
                     System.out.print(" * ");
                     else
                     System.out.print("   ");
                 }
               System.out.println();
             }
    }

      public static void topRightTringlePattern()
    {
        System.out.println("top Right triangel Pattern");
        System.out.print("Enter Number:-");
        Scanner s3=new Scanner(System.in);
        int n= s3.nextInt();
       
        for (int i = 1; i <=n; i++) {
            int j;
             for( j=1;j<=i-1;j++)
             {
                System.out.print("   ");  
             }
             for (int k=n;k>=i;k--) {
                System.out.print(" * "); 
             }
             System.out.println();
        }
               System.out.println();
    }

     public static void HollowTopRightTringlePattern()
    {
        System.out.println("Hollow Top Right triangel Pattern");
        System.out.print("Enter Number:-");
        Scanner s3=new Scanner(System.in);
        int n= s3.nextInt();
       
        for (int i = 1; i <=n; i++) {
           
            for(int j=1;j<=i-1;j++)
            {
               System.out.print("   ");  
            }
            for (int k=n;k>=i;k--) {
               if (i==1 || k==n || k==i ) {
                   System.out.print(" * "); 
               } 
               else
               System.out.print("   ");
            }
               System.out.println();
        }
    }


         public static void TopPyramidPattern()
    {
        System.out.println("Top Pyramid Pattern");
        System.out.print("Enter Number:-");
        Scanner s3=new Scanner(System.in);
        int n= s3.nextInt();
       
        for (int i = 1; i <=n; i++) {
           
            for(int j=1;j<=i-1;j++)
            {
               System.out.print("   ");  
            }
            for (int k=n;k>=i;k--) {
              
                   System.out.print(" * "); 
            }
            for (int l=i;l<=n-1;l++) {
               System.out.print(" * ");
            }
            System.out.println();
       }
    }

    public static void  bottamPyramidPattern(){
        System.out.println("Bottam Pyramid Pattern");
        System.out.print("Enter Number:-");
        Scanner s3=new Scanner(System.in);
        int n= s3.nextInt();
        for (int i = 1; i <=n; i++) {
           
            for(int j=1;j<=n-i;j++)
            {
               System.out.print("   ");  
            }
            for (int k=1;k<=i;k++) {
              
                   System.out.print(" * "); 
            }
            for (int l=1;l<=i-1;l++) {
               System.out.print(" * ");
            }
            System.out.println();
       }
    }
}
