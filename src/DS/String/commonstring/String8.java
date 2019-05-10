package DS.String;





//Longest Palindromic Substring | Set 1

      //  Given a string, find the longest substring which is palindrome.
        //For example, if the given string is “forgeeksskeegfor”, the output should be “geeksskeeg”

// string of one character will be palindrom , string of 2 character will be palindrom can be find out easily
// for three character we will use dynamic programming
// if i-i+1----j-1--j
//if string[i+1] to string[j-1] is palindrom and string[i] = string[j] , string i to j will be palindrome too


public class String8 {



    // A utility function to print a substring str[low..high]
    static void printSubStr(String str, int low, int high) {
        System.out.println(str.substring(low, high + 1));
    }




    static int longestPalSubstr(String str){

     int n = str.length();
        // table[i][j] will be false if substring str[i..j]
        // is not palindrome.
        // Else table[i][j] will be true
        boolean table[][] = new boolean[n][n];
        // All substrings of length 1 are palindromes
        int maxLength = 1;
        for (int i = 0; i < n; ++i)
            table[i][i] = true;

        int start = 0;
        for (int i = 0; i < n - 1; ++i) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                table[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }


        // Check for lengths greater than 2. k is length
        // of substring
        for (int k = 3; k <= n; ++k) {

            // Fix the starting index
            for (int i = 0; i < n - k + 1; ++i)
            {
                // Get the ending index of substring from
                // starting index i and length k
                int j = i + k - 1;

                // checking for sub-string from ith index to
                // jth index iff str.charAt(i+1) to
                // str.charAt(j-1) is a palindrome
                if (table[i + 1][j - 1] && str.charAt(i) ==
                        str.charAt(j)) {
                    table[i][j] = true;

                    if (k > maxLength) {
                        start = i;
                        maxLength = k;
                    }
                }
            }
        }
        System.out.print("Longest palindrome substring is; ");
        printSubStr(str, start, start + maxLength - 1);

        return maxLength; // return length of LPS




    }




    public static void main(String args[]){



        String str = "forgeeksskeegfor";
        System.out.println("Length is: " +
                longestPalSubstr(str));
    }




}
