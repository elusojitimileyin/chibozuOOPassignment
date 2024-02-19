package chapterThree;

public class ArrayTaskReturnFalseAndTrue {


    public int[] getArraysLength(int[] myArrays){
        return new int[myArrays.length];
    }
      public  boolean[] Display1(int[] myArrays) {
          boolean [] myArrayInput  = new boolean[myArrays.length];
        for (int index1 = 0; index1 < myArrays.length; index1++) {

        myArrayInput[index1] = myArrays[index1] % 2 != 0 ;
        }return myArrayInput;
   }

    public boolean[] display2(int[] myArrays) {
        boolean [] myArrayInput  = new boolean[7];
        boolean check = false;
        for (int index = 0; index < myArrays.length; index++) {
            check = myArrays[index] % 2 != 0;
            myArrayInput[index] = check;

        }return myArrayInput;
    }
}

