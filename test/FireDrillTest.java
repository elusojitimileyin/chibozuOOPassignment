import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FireDrillTest {

    @Test
    public void displayDateOfBirthTest() {
        FireDrill myFireDrill = new FireDrill();
        assertEquals(1, myFireDrill.getBirthDate(Integer.parseInt("12/12/2022")));
    }
}