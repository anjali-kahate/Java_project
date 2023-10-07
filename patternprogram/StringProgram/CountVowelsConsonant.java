package StringProgram;

import java.util.Scanner;

public class CountVowelsConsonant {
    public static void main(String[] args) {
        System.out.println("Enter String :-");
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        int vCount=0,cCount=0;
        for(int i=0;i<=s.length()-1;i++)
        {
            if(s.charAt(i)=='a' ||s.charAt(i)=='e'
            ||s.charAt(i)=='i' ||s.charAt(i)=='o'
            ||s.charAt(i)=='u' ||s.charAt(i)=='A'
            ||s.charAt(i)=='E' ||s.charAt(i)=='I'
            ||s.charAt(i)=='O' ||s.charAt(i)=='U')
            {
                vCount++;
            }
            else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
               cCount++;
            }
        }
        System.out.println("Count Number of Vowels :- "+vCount);
         System.out.println("Count Number of Consonant :- "+cCount);
    }
}
