package week2.les3.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RekeningTest {

    @Test
    public void test(){
        Rekening r = new Rekening(12345678);
        r.stort(1000);
        assertEquals(1000, r.getSaldo());
    }

}