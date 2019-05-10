package DS.BasicProgrammingJava.StringBasics;


//Write a method which will remove any given character from a string?
public class String2 {


    public static void main(String args[]){



       String str = "My name is kapil";

       String newstring = removeanycharacter(str,'a');

       System.out.println("new string is "+ newstring);
    }


    public static String removeanycharacter(String str,char remove) {


        if(str==null)
          return "";

        StringBuffer newstring = new StringBuffer();

        for(int i=0;i<str.length();i++){

            if(str.charAt(i)==remove)
                continue;

            newstring.append(str.charAt(i));

        }

        return newstring.toString();


    }


}
