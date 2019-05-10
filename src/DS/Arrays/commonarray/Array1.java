package DS.Arrays;
//Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.


public class Array1 {



    public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print( arr[i] + " ");
        }
        System.out.println();

    }

    public static void shiftArrayLeft(int [] arr,int n){



        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[i] = temp;
         System.out.println("After shift array left by one");
        printArr(arr);
    }




    public static void RotateArray(int [] arr, int d, int n){
        int i =0;

        for(i=0;i<d;i++)
            shiftArrayLeft(arr,n);


    }

    public static void main(String[]main){

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        printArr(arr);
        System.out.println();
        RotateArray(arr,2,8);
        System.out.println("Last result");
        printArr(arr);

    }



}
