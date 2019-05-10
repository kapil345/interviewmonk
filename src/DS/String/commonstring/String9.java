package DS.String;





//Check whether two strings are anagram of each other
//  Write a function to check whether two given strings are anagram of each other or not. An anagram of a string is another string that contains same characters,
//  only the order of characters can be different. For example, “abcd” and “dabc” are anagram of each other.


import java.util.Arrays;

public class String9 {

      static int no_chars = 256;

    public static boolean checkanagram1(String str1,String str2){

        Boolean anagram = false;


        int count1[] = new int[no_chars];
        int count2[] = new int[no_chars];

        Arrays.fill(count1,0);
        Arrays.fill(count2,0);


        if(str1.length()!=str2.length())
            return false;

        for(int i=0;i<str1.length()&&i<str2.length();i++){

            count1[str1.charAt(i)]++;
            count2[str2.charAt(i)]++;

        }

        //compare count arrays

         for(int i=0;i<no_chars;i++){


            if(count1[i]!=count2[i])
                return false;
         }

         return true;

    }


    public static void main(String args[]){

        System.out.println(checkAnagram2("abca","acba"));


    }


    //second method
    public static boolean checkAnagram2(String first, String second)
    {

        char[] characters = first.toCharArray();
         StringBuilder sbSecond = new StringBuilder(second);

     for(char ch : characters){
        int index = sbSecond.indexOf("" + ch);

        if(index != -1){

            sbSecond.deleteCharAt(index);
        }else{
            return false;
        }
    }
    return sbSecond.length() == 0; }
}




//}
