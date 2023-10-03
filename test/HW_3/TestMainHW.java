package HW_3;

import org.junit.jupiter.api.Test;
import hw3.MainHW;

//import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestMainHW {
    @Test
    public void testOddNumber(){
        assertTrue(MainHW.evenOddNumber(2));
    }

    @Test
    public void testEvenNumber() {
        assertFalse(MainHW.evenOddNumber(1));
    }

    @Test
    public void testLowNumberInInterval(){
        assertFalse(MainHW.numberInInterval(20));
    }
    @Test
    public void testNormalNumberInInterval(){
        assertTrue(MainHW.numberInInterval(56));
    }
    @Test
    public void testBigNumberInInterval(){
        assertFalse(MainHW.numberInInterval(201));
    }
}
