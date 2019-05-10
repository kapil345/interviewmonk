package DS.Arrays;


/*        Rearrange an array so that arr[i] becomes arr[arr[i]] with O(1) extra space

        Given an array arr[] of size n where every element is in range from 0 to n-1.
        Rearrange the given array so that arr[i] becomes arr[arr[i]]. This should be done with O(1) extra space.

examples:

Input: arr[]  = {3, 2, 0, 1}
Output: arr[] = {1, 0, 3, 2}

Input: arr[] = {4, 0, 2, 1, 3}
Output: arr[] = {3, 4, 2, 0, 1}

Input: arr[] = {0, 1, 2, 3}
Output: arr[] = {0, 1, 2, 3}

 */


/*
Ans :
        Let us understand the above steps by an example array {3, 2, 0, 1}
        In first step, every value is incremented by (arr[arr[i]] % n)*n
        After first step array becomes {7, 2, 12, 9}.
        The important thing is, after the increment operation
        of first step, every element holds both old values and new values.
        Old value can be obtained by arr[i]%n and new value can be obtained
        by arr[i]/n.

        In second step, all elements are updated to new or output values
        by doing arr[i] = arr[i]/n.
        After second step, array becomes {1, 0, 3, 2}
*/


public class Array4 {


   public static  class Rearrange
    {
        // The function to rearrange an array in-place so that arr[i]
        // becomes arr[arr[i]].
        void rearrange(int arr[], int n)
        {
            // First step: Increase all values by (arr[arr[i]]%n)*n
            for (int i = 0; i < n; i++)
                arr[i] += (arr[arr[i]] % n) * n;

            // Second Step: Divide all values by n
            for (int i = 0; i < n; i++)
                arr[i] /= n;
        }

        // A utility function to print an array of size n
        void printArr(int arr[], int n)
        {
            for (int i = 0; i < n; i++)
                System.out.print(arr[i] + " ");
            System.out.println("");
        }

        /* Driver program to test above functions */
        public static void main(String[] args)
        {

            Rearrange rearrange = new Rearrange();
            int arr[] = {3, 2, 0, 1};
            int n = arr.length;

            System.out.println("Given Array is :");
            rearrange.printArr(arr, n);

            rearrange.rearrange(arr, n);

            System.out.println("Modified Array is :");
            rearrange.printArr(arr, n);
        }
    }




       }
