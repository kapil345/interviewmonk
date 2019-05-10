package DS.String;


/*
Check if two strings are k-anagrams or not
        1.8
        Given two strings of lowercase alphabets and a value k, the task is to find if two strings are K-anagrams of each other or not.

        Two strings are called k-anagrams if following two conditions are true.

        Both have same number of characters.
        Two strings can become anagram by changing at most k characters in a string.
        Examples:

        Input:  str1 = "anagram" , str2 = "grammar" , k = 3
        Output:  Yes
        Explanation: We can update maximum 3 values and
        it can be done in changing only 'r' to 'n'
        and 'm' to 'a' in str2.

        Input:  str1 = "geeks", str2 = "eggkf", k = 1
        Output:  No
        Explanation: We can update or modify only 1
        value but there is a need of modifying 2 characters.
        i.e. g and f in str 2.
*/


//this soln works only if all character present in main string if string are "geeks" "efg" it wont work i havent handled this case

public class String4 {

      static final int no_of_chars = 256;

  static String findanagrams(String str,String ana,int k){

       int count_str[] = new int[no_of_chars];
       int count_ana[] = new int[no_of_chars];
       int count = 0;
       for(int i=0;i<str.length();i++)
       {
           count_str[str.charAt(i)]++;
           count_ana[ana.charAt(i)]++;

       }

       for(int i=0;i<str.length();i++){

           if(count_str[ana.charAt(i)]!=0){

               count_ana[ana.charAt(i)]--;
               count_str[ana.charAt(i)]--;
           }
            else
               count++;

       }

       System.out.println("After "+count+" it is possible");
       if(count<=k)
           return "Yes";
      else
          return "NO";

   }







    public  static void main (String args[]){


        String str = "geeks";
        String ana = "eggks";
        System.out.println(findanagrams(str,ana,1));

    }



}
