package Interview_Programing_Question;

import java.util.Scanner;

public class ATMProgram {
    public static void main(String[] args) {
        int balance=100000;
        int withdraw,deposit;

       Scanner sc=new Scanner(System.in);
       //int n=sc.nextInt();
      

       while (true) {
            System.out.println("                              ");
            System.out.println("-----------------------------------");
            System.out.println("                              ");
            System.err.println("Automated Teller Machine (ATM)");
            System.out.println("                         ");
            System.out.println("-- 1] Withdraw --");
            System.out.println("-- 2] Deposit --");
            System.out.println("-- 3] Check Balance --");
            System.out.println("-- 4] EXIT --");
            System.out.println("                      ");

            System.out.print("Choose Any one option :- ");
             int n=sc.nextInt();
        switch (n) {
            case 1:
                System.out.print("Enter money to withdrow := ");
                 withdraw=sc.nextInt();

                 if(balance>=withdraw)
                 {
                    balance=balance-withdraw;
                    System.out.println("Plese collet your money");
                 }
                 else
                 {
                    System.out.println("InSufficient Balance");
                 }
                break;
             case 2:
                System.out.print("Enter money to Deposite := ");
                deposit=sc.nextInt();
                 balance=balance+deposit;
                 System.out.println("Deposite Successfully.....");
                break;

             case 3:
                System.out.println("Your Balance is "+ balance);
                break;

             case 4:
                System.out.println(".....EXIT.....");
                System.exit(n);
                break;

            default:
                break;
        }
    }
}
}
