package chapterThree;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DoubleElementsInAnArrayTest {


   @Test
   public void TestForEmptySpaceInAnArray(){
    DoubleElementsInAnArray arrays = new DoubleElementsInAnArray();
      int [] myArrays = new int[4];
        assertArrayEquals(new int[8], DoubleElementsInAnArray.doubleTheArray(myArrays));
   }
   @Test
    public void TestThatElementsCanDoubleInTheArray(){
       DoubleElementsInAnArray arrays = new DoubleElementsInAnArray();
       int [] myArrays = new int [4];
       assertArrayEquals(new int[8], DoubleElementsInAnArray.elementsDoubleInTheArray(myArrays));

   }


    }
