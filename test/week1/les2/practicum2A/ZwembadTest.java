package week1.les2.practicum2A;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZwembadTest {

    @Test
    public void berekenInhoud() {
        Zwembad z = new Zwembad(1,2,3);

        assertEquals(6, z.inhoud(), "incorrect antwoord.");
    }
}