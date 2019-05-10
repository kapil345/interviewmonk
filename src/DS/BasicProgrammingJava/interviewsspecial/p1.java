package DS.BasicProgrammingJava.MIssBasicjava;


// programm to generate random number is java

//1. nextInt(range) = nextInt(max - min)
//new Random().nextInt(5);  // [0...4] [min = 0, max = 4]
//        new Random().nextInt(6);  // [0...5]
//        new Random().nextInt(7);  // [0...6]
//        new Random().nextInt(8);  // [0...7]
//        new Random().nextInt(9);  // [0...8]
//        new Random().nextInt(10); // [0...9]
//        new Random().nextInt(11); // [0...10]
//
////2. To include the last value (max value) = (range + 1)
//        new Random().nextInt(5 + 1)  // [0...5] [min = 0, max = 5]
//        new Random().nextInt(6 + 1)  // [0...6]
//        new Random().nextInt(7 + 1)  // [0...7]
//        new Random().nextInt(8 + 1)  // [0...8]
//        new Random().nextInt(9 + 1)  // [0...9]
//        new Random().nextInt(10 + 1) // [0...10]
//        new Random().nextInt(11 + 1) // [0...11]
//
////3. To define a start value (min value) in a range,
////   For example, the range should start from 10 = (range + 1) + min
//        new Random().nextInt(5 + 1)  + 10 // [0...5]  + 10 = [10...15]
//        new Random().nextInt(6 + 1)  + 10 // [0...6]  + 10 = [10...16]
//        new Random().nextInt(7 + 1)  + 10 // [0...7]  + 10 = [10...17]
//        new Random().nextInt(8 + 1)  + 10 // [0...8]  + 10 = [10...18]
//        new Random().nextInt(9 + 1)  + 10 // [0...9]  + 10 = [10...19]
//        new Random().nextInt(10 + 1) + 10 // [0...10] + 10 = [10...20]
//        new Random().nextInt(11 + 1) + 10 // [0...11] + 10 = [10...21]

import java.util.Random;

public class p1 {

    // generate 10 random numbers between 5 to 10


    public static int randomnumbergen(int min, int max){


        Random r = new Random();
        // r.nextint(5) generate number between 0 to 4  adding extra 5 so that nnumber lies in the given range

        int number = r.nextInt(max-min+1)+min;

        return number;
    }




    public static void main (String args[]){


       for(int i=0;i<10;i++) {
         System.out.println( randomnumbergen(5, 10));
       }

    }



}
