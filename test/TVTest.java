import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TVTest {

    private TV myTV;

    @BeforeEach
    void installTV(){

        myTV = new TV();
    }

    @Test
    void tvIsOnTest(){
        myTV.setTvIsOff(true);
        assertTrue(myTV.isTvIsOff());
        myTV.setTvIsOn(true);
        assertTrue(myTV.isTvIsOn());
    }
    @Test
    void tvIsOffTest(){
        myTV.setTvIsOn(true);
        assertTrue(myTV.isTvIsOn());
        myTV.setTvIsOff(true);
        assertTrue(myTV.isTvIsOff());
    }

    @Test
    void tvIsOnTest_setChannel(){
        myTV.setTvIsOff(true);
        assertTrue(myTV.isTvIsOff());
        myTV.setTvIsOn(true);
        assertTrue(myTV.isTvIsOn());
        myTV.setChannel(12);
        assertEquals(12, myTV.getChannel());
    }

    @Test
    void tvIsOnTest_setVolume(){
        myTV.setTvIsOff(true);
        assertTrue(myTV.isTvIsOff());
        myTV.setTvIsOn(true);
        assertTrue(myTV.isTvIsOn());
        myTV.setVolume(50);
        assertEquals(50, myTV.getVolume());
    }
    @Test
    void tvIsOnTest_(){
        myTV.setTvIsOff(true);
        assertTrue(myTV.isTvIsOff());
        myTV.setTvIsOn(true);
        assertTrue(myTV.isTvIsOn());
        myTV.setChannel(12);
        assertEquals(12, myTV.getChannel());
    }
}