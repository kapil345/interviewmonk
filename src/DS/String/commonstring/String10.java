package DS.String;



  /*  Two words are anagrams of each other if the first word's letters can be rearranged to form the second word.
        So, the two strings must have the same characters (in any order) and the same length. For instance,
        given the strings  and , Alice can remove the  from  to have  which is an anagram of .
        The minimum number of operations performed to create the anagram is , so that will be her seed value.

        Your challenge is to complete a line of code to calculate this seed value. You will be given two strings and must
        cumulate the minimum number of characters that must be removed from each string to create an anagram.

        Notes

        Your code should replace the text FILL THE MISSING LINE HERE
        The provided code should not be modified.
        Input Format

        Two lines each containing a string.

        Constraints

        length of
        and  will only consist of lowercase latin letters, .
        Output Format

        A single integer which is the number of character deletions.

        Sample Input 0

        cde
        abc
        Sample Output 0

        4


        one more solution

        create a count array of 256 characters now start traversing the first string and increasing the count
        index
        now traverse second string and decrease the count by 1
        now remaning characters will be removed so that you string could become anagram of each other


        second soln
        count the lenght of common character and subtract it from total length of two string remaining number will be
        removed to make two strings anagram





*/


import java.util.HashMap;
import java.util.Scanner;

public class String10 {



    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        String src = "cde";
        String tar = "abc";
        int length = 0;
        HashMap<Character,Integer> an = new HashMap<>();

       for(int i=0;i<src.length();i++){

          char c = src.charAt(i);
          if(an.containsKey(c))
              an.put(c,an.get(c)+1);
          else
              an.put(c,1);

       }

       for(int j=0;j<tar.length();j++){

        char c = tar.charAt(j);
        if(an.containsKey(c)&& an.get(c)!=0){

            an.put(c,an.get(c)-1);
            length = length+2;
        }

       }
// cdeabc-common character will give the required lenght
       System.out.println(src.length()+tar.length()-length);

    }
}
