package DS.Arrays;


 /*      Find the first repeating element in an array of integers

        Given an array of integers, find the first repeating element in it.
        We need to find the element that occurs more than once and whose index of first occurrence is smallest.
        Examples:

        Input:  arr[] = {10, 5, 3, 4, 3, 5, 6}
        Output: 5 [5 is the first element that repeats]

        Input:  arr[] = {6, 10, 5, 4, 9, 120, 4, 6, 10}
        Output: 6 [6 is the first element that repeats]
*/


 // we are using hashset here because it allows to store only unique elements

import java.util.ArrayList;
import java.util.HashSet;

public class Array5 {


    public  void printRepeatingelement(int arr[]) {

        int min = 0;
        HashSet<Integer> data = new HashSet<>();
        for (int i = arr.length-1; i >= 0; i--) {

            if (!data.contains(arr[i])) {

             data.add(arr[i]);
            }
         else{

                min = i;
            }

        }

        System.out.println("element repeating more than one time and has lowest index is  "+arr[min]);

    }



 public static void main (String args []){


     int arr [] = {6, 10, 5, 4, 9, 120, 4, 6, 10};
     Array5 a = new Array5();

     a.printRepeatingelement(arr);


 }




   }
