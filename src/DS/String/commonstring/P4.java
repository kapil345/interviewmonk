package DS.BasicProgrammingJava.interviewsspecial;


/*
Write second most repeating word in a string
        eg aaa bbb ccc aaa bbb aaa
        answer - bbb
*/


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P4 {



    public static void main(String args []){

        P4 p4 = new P4();
        List<String> data = new ArrayList<String>();
        HashMap<String,Integer> map = new HashMap<>();

         data.add("aaa");
         data.add("bbb");
         data.add("ccc");
         data.add("aaa");
         data.add("bbb");
         data.add("aaa");
         data.add("ccc");
         //data.add("ccc");

         //find the count of words
         for(String entry:data){

             System.out.println(entry);
         }

        String secondHigh = null;
        int first  = Integer.MIN_VALUE;
        int second =Integer.MIN_VALUE;
         int val = 0;
        for(String value:data){


            if(!map.containsKey(value))
             {
                 map.put(value,1);
             }
            else {

                 map.put(value, map.get(value)+1);

             }

            val = map.get(value);
            if(val > first) {

                second = first;
                first = val;
            }

        }

       for( Map.Entry<String,Integer> entry : map.entrySet()){

           if(second==entry.getValue()){
               secondHigh = entry.getKey();
               break;
           }

       }

       System.out.println("second repeating word is "+secondHigh);

    }




}
