package NumberPattern;

public class VPattern {
    public static void main(String[] args) {
        int i,j;
        int n=6;
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
       for(int l=n;l>=i;l--)
       {
          if(l==i)
          System.out.print("*");
          else
          System.out.print(" ");
       
       }
       System.out.println();
    }
    }
    
}
