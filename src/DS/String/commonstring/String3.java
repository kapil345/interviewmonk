package DS.String;

//Remove characters from the first string which are present in the second string

public class String3 {

  static  int no_of_char = 256;

     static String removemaskedString(String str, String mask_str){

        //mask string using count array
        int count[] = new int[no_of_char];
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<mask_str.length();i++)
            count[mask_str.charAt(i)]++;

        for(int i=0;i<str.length();i++){

            char c = str.charAt(i);
            if(count[str.charAt(i)]>0 )
                continue;
            sb.append(str.charAt(i));


        }

        return sb.toString();

    }








    public static void main(String args[]){


        String str = "test string";
        String mask_str = "mask";
        System.out.println(removemaskedString(str,mask_str));


    }







}
