package chapterThree;

public class ArrayTaskReturn {
//    public static int[] DisplayOddAndEven(int[] myArrays) {
//        for (int index = 0; index < myArrays.length; index++) {
//        myArrays[index] = myArrays[index]%2;
//        }return myArrays;
//    }

    public static int[] DisplayOddAndEven(int[] myArrays) {
        int [] myArrayInput  = new int[5];
        int check = 0;
        for (int index = 0; index < myArrays.length; index++) {
            if (myArrays[index] % 2 == 0) {
                check = 0;

            } else {
                check =1;

            }
            myArrays[index] = myArrayInput[index];
        }return myArrays;
    }
}