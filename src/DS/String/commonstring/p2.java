package DS.BasicProgrammingJava;

//Write Code To Sort The List Of Strings Using Java Collection?


import java.lang.reflect.Array;
import java.util.Arrays;

public class p2 {





    public static void main(String args[]){



        String[] inputlist = {"jan","feb","march","apr","may","june","junly","aug","sep","oct","nov","dec"};

        System.out.println("before sorting the list");
        showlist(inputlist);
        //call to sort the list
        Arrays.sort(inputlist);

        System.out.println("After sorting list is");
        showlist(inputlist);

    }



   public  static void showlist(String [] list){


        for(String key:list){

            System.out.println(key);

        }


    }



}


