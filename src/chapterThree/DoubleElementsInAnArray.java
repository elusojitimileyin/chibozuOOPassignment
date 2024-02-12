package chapterThree;
public class DoubleElementsInAnArray {

    public static int[] doubleTheArray(int[] myArrays) {
        int [] newArray = new int[myArrays.length*2];
        return newArray;
    }

    public static int[] elementsDoubleInTheArray(int[] myArrays) {
        int[] outputs = doubleTheArray(myArrays);

        for (int count = 0; count < myArrays.length; count++) {
            outputs[count] = myArrays[count];
            outputs[count + myArrays.length] = myArrays[count] * 2;


        }  return outputs;

    }
}