package DS.Arrays;



/*

Find a pair with maximum product in array of Integers
        Given an array with both +ive and -ive integers, return a pair with highest product.

        Examples:

        Input: arr[] = {1, 4, 3, 6, 7, 0}
        Output: {6,7}

        Input: arr[] = {-1, -3, -4, 2, 0, -5}
        Output: {-4,-5}




        soln :
        An Efficient Solution can solve the above problem in single traversal of input array.
         The idea is to traverse the input array and keep track of following four values.
a) Maximum positive value
b) Second maximum positive value
c) Maximum negative value i.e., a negative value with maximum absolute value
d) Second maximum negative value.
At the end of the loop, compare the products of first two and last two and print the maximum of two products. Below is the implementation of this idea.

*/





public class Array7 {



    public static void main(String args[]){


        int arr[] = {-1, -3, -4, 2, 0, -5};
        int posa = Integer.MIN_VALUE;
        int posb = Integer.MIN_VALUE;
        int nega =Integer.MIN_VALUE;
        int negb =Integer.MIN_VALUE;


        for(int i=0;i<arr.length;i++){


            if(arr[i]>posa)
            {
                posb = posa;
                posa =arr[i];

            }



            if(arr[i]<0&&Math.abs(arr[i])>Math.abs(nega)){

                negb = nega;
                nega = arr[i];

            }
            else if(arr[i] < 0 && Math.abs(arr[i])
                    > Math.abs(negb))
                negb = arr[i];     // when number lies between nega and negb


        }


        if(nega*negb>posa*posb)
        System.out.println("Product is "+nega*negb);

        else
            System.out.println("Product is "+posa*posb);



    }








}
