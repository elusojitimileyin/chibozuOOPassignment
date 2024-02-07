import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutomaticBikeTest {
    private AutomaticBike myAutomaticBike;

    @BeforeEach
    void intializeBike(){
        myAutomaticBike = new AutomaticBike();
    }

    @Test
    void bikeIsOnTest(){

        myAutomaticBike.setBikeOn(true);
        assertTrue(myAutomaticBike.isBikeOn());
    }
    @Test
    void bikeIsOffTest(){

        myAutomaticBike.setBikeOn(true);
        assertTrue(myAutomaticBike.isBikeOn());

        myAutomaticBike.setBikeOff(true);
        assertTrue(myAutomaticBike.isBikeOff());
    }


    @Test
    void bikeAccelerationTest(){
        myAutomaticBike.setBikeOn(true);
        assertTrue(myAutomaticBike.isBikeOn());
        myAutomaticBike.accelerateSpeed();

    }

    @Test
    void bikeDecelerationTest(){
        myAutomaticBike.setBikeOn(true);
        assertTrue(myAutomaticBike.isBikeOn());
        myAutomaticBike.decelerateSpeed();
        assertEquals(10, myAutomaticBike.getSpeed());

    }

    @Test
      void bikeGearIncreaseByOneTest(){
        myAutomaticBike.setBikeOn(true);
        assertTrue(myAutomaticBike.isBikeOn());


    }


}