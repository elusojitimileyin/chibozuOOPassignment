
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionerTest {

    private AirConditioner myAirconditioner;

    @BeforeEach
    void intializeAC() {
        myAirconditioner = new AirConditioner();
    }

    @Test
    void testAcIsOn() {
        myAirconditioner.setOff(true);
        assertTrue(myAirconditioner.isOff());

        myAirconditioner.setOn(true);
        assertTrue(myAirconditioner.isOn());

    }

    @Test
    void testACIsOff() {

        myAirconditioner.setOff(true);
        assertTrue(myAirconditioner.isOff());

        myAirconditioner.setOn(true);
        assertTrue(myAirconditioner.isOn());

        myAirconditioner.setOff(true);
        assertTrue(myAirconditioner.isOff());
    }

    @Test
    void testACTemperatureIsIncreasing() {
        myAirconditioner.setOn(true);
        assertTrue(myAirconditioner.isOn());

        myAirconditioner.increaseTemperature();
        assertEquals(17, myAirconditioner.getTemperature());

        myAirconditioner.increaseTemperature();
        assertEquals(18, myAirconditioner.getTemperature());

    }

    @Test
    void testACTemperatureIsDecreasing() {
        myAirconditioner.setOn(true);
        assertTrue(myAirconditioner.isOn());
        myAirconditioner.increaseTemperature();
        myAirconditioner.increaseTemperature();
        assertEquals(18, myAirconditioner.getTemperature());

        myAirconditioner.decreaseTemperature();
        assertEquals(17, myAirconditioner.getTemperature());
    }
    @Test
    public void increaseAcTemperatureAt30_temperatureIs30Test() {
        myAirconditioner.setOn(true);
        assertTrue(myAirconditioner.isOn());

        for (int count = 0; count < 14; count++) myAirconditioner.increaseTemperature();
        assertEquals(30, myAirconditioner.getTemperature());

        myAirconditioner.increaseTemperature();
        assertEquals(30, myAirconditioner.getTemperature());
    }

    @Test
    public void decreaseAcTemperatureAt16_temperatureIs16Test() {
        myAirconditioner.setOn(true);
        assertTrue(myAirconditioner.isOn());

        myAirconditioner.decreaseTemperature();
        assertEquals(16, myAirconditioner.getTemperature());

        myAirconditioner.decreaseTemperature();
        assertEquals(16, myAirconditioner.getTemperature());
    }
}
