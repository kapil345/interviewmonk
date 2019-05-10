package DS.Arrays;

/*
Find the minimum distance between two numbers

Given an unsorted array arr[] and two numbers x and y, find the minimum distance between x and y in arr[].
The array might also contain duplicates. You may assume that both x and y are different and present in arr[].

        Examples:
        Input: arr[] = {1, 2}, x = 1, y = 2
        Output: Minimum distance between 1 and 2 is 1.

        Input: arr[] = {3, 4, 5}, x = 3, y = 5
        Output: Minimum distance between 3 and 5 is 2.

        Input: arr[] = {3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3}, x = 3, y = 6
        Output: Minimum distance between 3 and 6 is 4.

        Input: arr[] = {2, 5, 3, 5, 4, 4, 2, 3}, x = 3, y = 2
        Output: Minimum distance between 3 and 2 is 1
*/



public class Array6 {



    public void minimumDistanceBetweenTwoNumbers(int arr[],int x,int y) {

        int mindistance = Integer.MAX_VALUE;
        int previous =0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]==x||arr[i]==y)
            {
                previous = i;
                break;
            }

        }


        for(int i=previous+1;i<arr.length;i++){


            if(arr[i]==arr[previous]){

                previous = i;
            }

           if(arr[i]==x||arr[i]==y){

                if(arr[i]!=arr[previous]) {

                    if (Math.abs(i - previous) < mindistance) {

                        mindistance = Math.abs(i - previous);

                    }
                }
           }


        }

System.out.println("Minimum distance is  "+mindistance);

    }




    public static void main (String args []){

        int arr [] ={3, 4, 5};
        int x = 3;
        int y = 5;
        Array6 a = new Array6();
        a.minimumDistanceBetweenTwoNumbers(arr,x,y);
    }


}
