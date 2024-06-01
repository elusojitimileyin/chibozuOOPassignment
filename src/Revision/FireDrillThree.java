package Revision;

import java.util.Arrays;

public class FireDrillThree {

//    public int[] taskOne(int score1, int score2, int score3, int score4, int score5, int score6, int score7, int score8, int score9, int score10) {
//        int[] arrays = {score1, score2, score3, score4, score5, score6, score7, score8, score9, score10};
//
//
//        return arrays;
//    }
//
//
    public static int setProductOfMaximumNumber(int[] array) {

        if (array.length < 2) {
            return 0;
        }
            Arrays.sort(array);

           int arr = array[0]* array[1] ;
            int Product = array[array.length -1] * array[array.length  -2] ;


            return Math.max(arr, Product );

    }
////
////
////        if (array.length < 2) return 0;
////            int maxProduct = Integer.MIN_VALUE;
////            for (int count = 0; count < array.length-1; count++) {
////                for (int index = count + 1; index < array.length; index++) {
////                    if (array[index] * array[count] > maxProduct)
////                        maxProduct = array[index] * array[count] ;
////                    }
////        }
////        return maxProduct;
////
////    }}

    public static int[] sortZero(int[] array) {
        for (int count = 0; count < array.length - 1; count++){
            for (int index = count  ; index < array.length; index++) {
                if (array[count] == 0) {
                    array[count] = array[index];
                    array[index] = 0;

                }

            }
        }
        return array;
    }

}