package Number_Program;

import java.util.Scanner;

public class AutomorphicNum {
    public static void main(String[] args) {
        System.out.println("Enter number :- ");
       
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
       int mul=0,r=0,sum=0,num;
       num=n;
       mul=n*n;
      
       while (n>0) {
            r=mul%10;
           // sum=(sum*10)+r;
           sum=r;
             n=n/10;
       }
        System.out.println("mul="+mul);
        System.out.println("r="+r);
        //System.out.println("sum="+sum);
        System.out.println("num="+num);
        if (num==sum) {
                    System.out.println(num+" == "+sum);
                }
                 else {
                   System.out.println(num+" != "+sum); 
                }
        
     }  
           
}

