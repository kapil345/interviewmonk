package DS.BasicProgrammingJava.interviewsspecial;

//Merge the two sorted array {1,3,5,6,7,9,10} & {4,8,13,17,10}


public class P3 {


    int [] mergetwosortedarray(int arr1[],int arr2[]){

        int size = arr1.length+arr2.length;
        int arr3[ ] = new int[size];

        int i=0,j =0,index=0;
        // who consumed first come out from array
        while(i<arr1.length&&j<arr2.length ){

            if(arr1[i]<arr2[j])
            {
               arr3[index++] = arr1[i++];

            }
            else
                arr3[index++] = arr2[j++];

        }

        // put remaining elements into array from array who hasnt consumed
        while(i<arr1.length)
            arr3[index++] = arr1[i++];

        while (j<arr2.length)
            arr3[index++] = arr2[j++];

        return arr3;
    }





    public static void main(String args [] ){

    int arr1 [] = {1,3,5,6,7,9,10};
    int arr2[] = {4,8,13,17,10};
    P3 a = new P3();
    int arr [] = a.mergetwosortedarray(arr1,arr2);

    }




}
