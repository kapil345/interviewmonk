package DS.BasicProgrammingJava;

//Write A Java Program To Demonstrate String Reverse With And Without StringBuffer Class?
public class p4 {




      public static String withstringBuffer(String input){

          StringBuffer buffer = new StringBuffer(input);

         buffer.reverse();
         return buffer.toString();

      }


      public static  String withoutStringBuffer(String input){

          int len = input.length();
          String original = input;
          String invert = "";

          for(int i=len-1;i>=0;i--){

              invert = invert+original.charAt(i);

          }

          return invert;
      }





      public static  void main(String args[]){


          String input = "abcdef";

          System.out.println(" with String buffer reverse string  "+withstringBuffer(input));

          System.out.println("without String buffer reverse string "+withoutStringBuffer(input));



      }




}
