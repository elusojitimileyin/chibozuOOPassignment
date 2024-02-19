package chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ArrayTaskReturnFalseAndTrueTest {

    @Test
    public void checkLengthOfArray() {
        ArrayTaskReturnFalseAndTrue myArray = new ArrayTaskReturnFalseAndTrue();
        int[] inputArray = new int[7];
        assertEquals(7, myArray.getArraysLength(inputArray).length);
    }


}




