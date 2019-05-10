/*
package DS;





First element that appears even number of times in an array
        Given an array, find the first element that appears even number of times in the array. It returns the element if exists otherwise returns 0.

        Examples:
        Input : arr[] = {1, 5, 4, 7, 4, 1, 5, 7, 1, 5};
        Output : 4
        Explanation, 4 is the first element that appears even number of times.
        Input : arr[] = {2, 4, 6, 8, 1, 6};
        Output : 6
        Explanation, 6 is the first element that appears even number of times



An Efficient solution can solve this problem using hash map having O(n) time and O(n) extra space as:

For each element a[i] of the array, do the following:
If a[i] is not present in the hash map, insert it in hash map as pair (a[i], false).
If a[i] is present in the hash map and value is true, toggle it to false.
If a[i] is present in the hash map and value is false, toggle it to true.
To find the first element appearing even number of times, traverse the array again and find a[i] with value true and return.








// JAVA code to find the first element
// that appears even number times
        import java.util.*;
class GFG {
    public static int firstEven(int arr[], int n)
    {

        HashMap<Integer, Boolean> map =
                new HashMap<Integer, Boolean>();

        for (int i = 0; i < n; i++) {

            // first time occurred
            if (map.get(arr[i]) == null)
                map.put(arr[i], false);

                // toggle for repeated occurrence
            else {
                boolean val = map.get(arr[i]);
                if (val == true)
                    map.put(arr[i], false);
                else
                    map.put(arr[i], true);
            }
        }

        int j = 0;
        for (j = 0; j < n; j++) {

            // first integer with true value
            if (map.get(arr[j]) == true)
                break;
        }

        return arr[j];
    }

    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 2, 4, 6, 8, 1, 6 };
        int n = arr.length;
        System.out.println(firstEven(arr, n));
    }
}

*/
