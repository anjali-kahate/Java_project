package Interview_Programing_Question;

import java.util.HashMap;
import java.util.Map;

public class WordAccurancy {
    public static void main(String[] args) {
        
        //      String s="Hello my name is Anjali and my husband name is Naval";
        //    String ss[]=s.split(" ");
        //    int freq=0;
        //    String res="";
       
    //     for (int i = 0; i < ss.length; i++) {
    //          int count=0;
    //         for (int j = 0; j < ss.length; j++) {
    //             if (ss[j].equals(ss[i])) {
    //                 count++;
    //             }
    //         }
    //        if (count>=freq) {
    //         res=ss[i];
    //         freq = count;
            
    //        }
    //     }
    //    System.out.println(res + " = " +freq );
        
            
            
            HashMap<String, Integer> map = new HashMap<>();
            String s="Hello my name is Anjali and my husband name is Naval";
            int count=0;
            for(String w : s.split(" ")){
              

              if (map.containsKey(w)) {
                map.put(w, map.get(w)+1);
              }

              else{
                map.put(w, 1);
              }
            }
             for(Map.Entry<String,Integer> e: map.entrySet()){
               System.out.println(e.getKey() + " = " + e.getValue());
             }
        }
}
