import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FireDrillThreeTest {
    @Test
    public void collectScoreTest(){
        FireDrillThree myFireDrill = new FireDrillThree();
        int[] inputArray = {1,2,3,4,5,6,7,8,9,10};

        assertEquals(Arrays.toString(inputArray),Arrays.toString(myFireDrill.taskOne(1,2,3,4,5,6,7,8,9,10)));


    }



}