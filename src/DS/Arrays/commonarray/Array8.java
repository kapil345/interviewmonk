package DS.Arrays;
// find second smallest element in the array

public class Array8 {




    public  void findsecondsmallest(int arr[]){

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){

            if(arr[i]<first){

                second = first;
                first = arr[i];
            }
        else if(arr[i]<second&&arr[i]!=first)
             second = arr[i];

        }

        System.out.println(second);

    }



public static void main (String args[]){


    Array8 obj = new Array8();
    int arr[] = {3,4,7,8,1,2};
    int arr1[] = {9,9,9,9,9,9,8,6,7};
    obj.findsecondsmallest(arr1);



}



}
