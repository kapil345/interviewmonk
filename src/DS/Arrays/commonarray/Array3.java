package DS.Arrays;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

class GFG {
    public static void main(String[] args) {
        Integer arr[] = {10, 5, 3, 9 ,2};
        final int x = 7;
        printArray(arr);

        Arrays.sort(arr, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                int diff1 = Math.abs(Math.abs(o1) - Math.abs(x));
                int diff2 = Math.abs(Math.abs(o2) - Math.abs(x));

                return diff1 - diff2;

            }
        });

        System.out.println("After sort");
        printArray(arr);
    }

    static void printArray(Integer[] arr) {
        for(int i =0; i< arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }
}