package chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArrayTaskReturnTest {

     @Test
    public void testThatArrayInputCanReturnZeroAndOne(){
         ArrayTaskReturn myArrayInput = new ArrayTaskReturn();
        int [] sampleInput = {4,5,8,8,8,2,9};
        int [] output = {0,1,0,0,0,0,1};
        assertArrayEquals(output, ArrayTaskReturn.DisplayOddAndEven(sampleInput));
     }


}
