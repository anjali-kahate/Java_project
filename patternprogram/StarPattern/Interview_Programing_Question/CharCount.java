package Interview_Programing_Question;

import java.util.HashMap;
import java.util.Map;

public class CharCount {
    public static void main(String[] args) {

        HashMap<Character,Integer> map = new HashMap<>();
        String s="hi i am programmer i am using java language";
        //String s="googalllll";
        int count=0;
        // for(String w : s.split(" "))
        // {
       // for(int i=s.length()-1;i>=0;i--)
        for (int i = 0; i < s.length(); i++) {
           if (map.containsKey(s.charAt(i))) {
            count=map.get(s.charAt(i));
            map.put(s.charAt(i), ++count);
           }
           else
           {
            map.put(s.charAt(i), 1);
           }
        }
         System.out.println(map);
    } 

   // }
}
