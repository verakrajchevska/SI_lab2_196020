import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {


    @Test
    void testMultipleCondition() {

    }

    @Test
    public void testEveryBranch() {
        RuntimeException ex;

        ex = assertThrows(RuntimeException.class, () -> new Time(27,0,5));
        assertTrue(ex.getMessage().contains("The hours are grater than the maximum"));

        ex = assertThrows(RuntimeException.class, () -> new Time(-2,18,6));
        assertTrue(ex.getMessage().contains("The hours are smaller than the minimum"));

        assertEquals(37830,new Time(10,30,30));

        ex = assertThrows(RuntimeException.class, () -> new Time(9,15,63));
        assertTrue(ex.getMessage().contains("The seconds are not valid"));

        ex = assertThrows(RuntimeException.class, () -> new Time(20,70,10));
        assertTrue(ex.getMessage().contains("The minutes are not valid!"));

        assertEquals(86400,new Time(24,0,0));

        ex = assertThrows(RuntimeException.class, () -> new Time(24,14,4));
        assertTrue(ex.getMessage().contains("The time is greater than the maximum"));

    }

}
