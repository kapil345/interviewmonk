package DS.String;


//Return maximum occurring character in an input string

public class string1 {


    static  final int ASCII_size = 256;

    static  char getmaximumchar(String str){


        int count[] = new int[ASCII_size];
        int len = str.length();

        for(int i=0;i<len;i++)
            count[str.charAt(i)]++;

            int max = -1;
            char result = ' ';
            for(int i =0;i<len;i++) {
                if (max < count[str.charAt(i)]) {
                    max = count[str.charAt(i)];
                    result = str.charAt(i);

                }
            }
           return  result;


    }


    public static void main(String args[]){

        String str = "sampggbbbbble string";
        System.out.println("character is "+getmaximumchar(str));
    }


}
