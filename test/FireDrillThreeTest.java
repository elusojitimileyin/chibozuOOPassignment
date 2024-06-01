import Revision.FireDrillThree;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FireDrillThreeTest {
//    @Test
//    public void collectScoreTest(){
//        FireDrillThree myFireDrill = new FireDrillThree();
//        int[] inputArray = {1,2,3,4,5,6,7,8,9,10};
//
//        assertEquals(Arrays.toString(inputArray),Arrays.toString(myFireDrill.taskOne(1,2,3,4,5,6,7,8,9,10)));
//
//
//    }


    @Test
    public void testForProductOfMaximumNumberInAnArray(){
        FireDrillThree myFireDrill = new FireDrillThree();
        int[] array = {1,5,10,4,0};
        int[] array1 = {1,-9};
        int expected = myFireDrill.setProductOfMaximumNumber(array);
        int expected1 = myFireDrill.setProductOfMaximumNumber(array1);
        assertEquals(50,expected);
        assertEquals(-9,expected1);

    }
    @Test
    public void testSortZero(){
        FireDrillThree myFireDrill = new FireDrillThree();
//        int[] array = {1,0, 5,10,4,0};
//
//        assertArrayEquals(array, FireDrillThree.sortZero(new int[]{1, 5, 10, 4, 0, 0}));
//
//
        int[] array = {1, 5, 0, 10, 4, 0};
        int[] result = FireDrillThree.sortZero(array);
        assertArrayEquals((new int[]{1, 5, 10, 4, 0, 0}), result);



    }


}