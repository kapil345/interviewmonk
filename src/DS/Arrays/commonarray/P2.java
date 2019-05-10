package DS.BasicProgrammingJava.interviewsspecial;



 /* Find four elements a, b, c and d in an array such that a+b = c+d

        Given an array of distinct integers, find if there are two pairs (a, b) and (c, d) such that a+b = c+d, and a, b, c and d are distinct elements.
        If there are multiple answers, then print any of them.

        Example:

        Input:   {3, 4, 7, 1, 2, 9, 8}
        Output:  (3, 8) and (4, 7)
        Explanation: 3+8 = 4+7

        Input:   {3, 4, 7, 1, 12, 9};
        Output:  (4, 12) and (7, 9)
        Explanation: 4+12 = 7+9

        Input:  {65, 30, 7, 90, 1, 9, 8};
        Output:  No pairs found
*/

import java.util.HashMap;

public class P2 {

    public class Pair {

         public int i;
         public int j;

        Pair(int i,int j){
            this.i = i;
            this.j = j;
        }

    }

    public void printpairs(int i, int j,HashMap<Integer,Pair> pairs,int key){

        System.out.println("("+i+","+j+")"+"  "+"("+pairs.get(key).i+","+pairs.get(key).j+")");

    }

    public void findpair(int numbers[] ){


        HashMap<Integer,Pair> data = new HashMap<Integer, Pair>();

        for(int i=0;i<numbers.length;i++)
            for(int j= i+1;j<numbers.length;j++){

            int sum = numbers[i]+numbers[j];

            if(!data.containsKey(sum))
            {
                data.put(sum, new Pair(numbers[i],numbers[j]));

            }
            else{

                // pairs has found
                printpairs(numbers[i],numbers[j],data,sum);

            }


            }
    }


    public static void main(String args []){

      int numbers [] = {3, 4, 7, 1, 2, 9, 8};
      int numbers2[] = {1,2,3,4,5,6,7,8,9};

      P2 p2 = new P2();
      p2.findpair(numbers);

    }




}
