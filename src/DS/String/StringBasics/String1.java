package DS.BasicProgrammingJava.StringBasics;




//Write code to check a String is palindrome or not?




public class String1 {



    public static void main(String args[]){


        // reverse string using string buffer (which is thread safe and mutable)

        String s = "geek";

        StringBuffer sbr = new StringBuffer(s).reverse();

        System.out.println("Reversed by string buffer  "+sbr);


        //reverse string using string builder (which is not thread safe)

        StringBuilder stringBuilder = new StringBuilder(s).reverse();

        System.out.println("Reversed by string builder "+stringBuilder);

        s = "wakeup";

        String reverse = reverse(s);

        System.out.println("reversed by logic "+reverse);

    }

    public static  String reverse(String source){

        if(source==null||source.isEmpty())
          return source;

        String reverse = "";

        for(int i = source.length()-1;i>=0;i--){

            reverse = reverse+source.charAt(i);
        }

        return reverse;

    }



}
