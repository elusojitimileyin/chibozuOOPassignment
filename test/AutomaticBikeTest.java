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
        myAutomaticBike.setSpeed(0);
        myAutomaticBike.accelerateSpeed();

        assertEquals(1,myAutomaticBike.getSpeed());

    }

    @Test
    void bikeDecelerationTest(){
        myAutomaticBike.setBikeOn(true);
        myAutomaticBike.setSpeed(20);
        myAutomaticBike.decelerateSpeed();

        assertEquals(19,myAutomaticBike.getSpeed());
    }

    @Test
      void bikeGearIncreaseByOneTest(){
        myAutomaticBike.setBikeOn(true);
        myAutomaticBike.setSpeed(14);
        myAutomaticBike.accelerateSpeed();
        myAutomaticBike.accelerateSpeed();
        myAutomaticBike.accelerateSpeed();

        assertEquals(17,myAutomaticBike.getSpeed());
        assertEquals(1,myAutomaticBike.getGear());


    }


}