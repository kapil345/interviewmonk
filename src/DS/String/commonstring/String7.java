package DS.String;





/*
Good Problem
Group words with same set of characters
        2.6
        Given a list of words with lower cases. Implement a function to find all Words that have the same unique character set .

        Example:

        Input: words[] = { "may", "student", "students", "dog",
        "studentssess", "god", "cat", "act",
        "tab", "bat", "flow", "wolf", "lambs",
        "amy", "yam", "balms", "looped",
        "poodle"};
        Output :
        looped, poodle,
        lambs, balms,
        flow, wolf,
        tab, bat,
        may, amy, yam,
        student, students, studentssess,
        dog, god,
        cat, act,

        All words with same set of characters are printed
        together in a line.
*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class String7 {

    // Java program to print all words that have
// the same unique character set


        static final int MAX_CHAR = 26;

        // Generates a key from given string. The key
        // contains all unique characters of given string
        // in sorted order.
        static String getKey(String str)
        {
            boolean[] visited = new boolean[MAX_CHAR];
            Arrays.fill(visited, false);

            // store all unique characters of current
            // word in key
            for (int j = 0; j < str.length(); j++)
                visited[str.charAt(j) - 'a'] = true ;  // char-'a' will give you the index of lower character from 0 to 26
            String key = "";
            for (int j=0; j < MAX_CHAR; j++)
                if (visited[j])
                    key = key + (char)('a'+j);
            return key;
        }

        // Print all words together with same character sets.
        static void wordsWithSameCharSet(String words[], int n)
        {
            // Stores indexes of all words that have same
            // set of unique characters.
            //unordered_map <string, vector <int> > Hash;
            HashMap<String, ArrayList<Integer>> Hash = new HashMap<>();

            // Traverse all words
            for (int i=0; i<n; i++)
            {
                String key = getKey(words[i]);

                // if the key is already in the map
                // then get its corresponding value
                // and update the list and put it in the map
                if(Hash.containsKey(key))
                {
                    ArrayList<Integer> get_al = Hash.get(key);
                    get_al.add(i);
                    Hash.put(key, get_al);
                }

                // if key is not present in the map
                // then create a new list and add
                // both key and the list
                else
                {
                    ArrayList<Integer> new_al = new ArrayList<>();
                    new_al.add(i);
                    Hash.put(key, new_al);
                }
            }

            // print all words that have the same unique character set
            for (Map.Entry<String, ArrayList<Integer>> it : Hash.entrySet())
            {
                ArrayList<Integer> get =it.getValue();
                for (Integer v:get)
                    System.out.print( words[v] + ", ");
                System.out.println();
            }
        }

        // Driver program to test above function
        public static void main(String args[])
        {
            String words[] = { "may", "student", "students", "dog",
                    "studentssess", "god", "cat", "act", "tab",
                    "bat", "flow", "wolf", "lambs", "amy", "yam",
                    "balms", "looped", "poodle"};
            int n = words.length;
            wordsWithSameCharSet(words, n);
        }
    }




