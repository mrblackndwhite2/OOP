package week1.les2.practicum2B;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class VoetbalclubTest {

    @Test
    public void clubNameEmpty() {
        Voetbalclub c = new Voetbalclub("");
        assertEquals("FC", c.getNaam());
    }

    @Test
    public void clubNameNull() {
        Voetbalclub c = new Voetbalclub(null);
        assertEquals("FC", c.getNaam());
    }

    @Test
    public void verwerkResultatenBeginSeizoenPunten() {
        Voetbalclub c = new Voetbalclub("");
        assertEquals(0, c.aantalPunten(), "aantalPunten moet 0 zijn");
    }

    @Test
    public void verwerkResultatenBeginSeizoenGespeeld() {
        Voetbalclub c = new Voetbalclub("");
        assertEquals(0, c.aantalGespeeld(), "aantalGespeeld moet 0 zijn");
    }

    @Test
    public void verwerkResultatenWinPunten() {
        Voetbalclub c = new Voetbalclub("club");
        c.verwerkResultaat('w');
        assertEquals(3, c.aantalPunten(), "aantalPunten moet 3 zijn");
    }

    @Test
    public void verwerkResultatenWinGespeeld() {
        Voetbalclub c = new Voetbalclub("club");
        c.verwerkResultaat('w');
        assertEquals(1, c.aantalGespeeld(), "aantalGespeeld moet 1 zijn");
    }

    @Test
    public void verwerkResultatenWinToString() {
        Voetbalclub c = new Voetbalclub("club");
        c.verwerkResultaat('w');
        String s = "club 1 1 0 0 3";
        assertEquals(s, c.toString());
    }

    @Test
    public void verwerkResultatenLossPunten() {
        Voetbalclub c = new Voetbalclub("club");
        c.verwerkResultaat('v');
        assertEquals(0, c.aantalPunten(), "aantalPunten moet 0 zijn");
    }

    @Test
    public void verwerkResultatenLossGespeeld() {
        Voetbalclub c = new Voetbalclub("club");
        c.verwerkResultaat('v');
        assertEquals(1, c.aantalGespeeld(), "aantalGespeeld moet 1 zijn");
    }

    @Test
    public void verwerkResultatenLossToString() {
        Voetbalclub c = new Voetbalclub("club");
        c.verwerkResultaat('v');
        String s = "club 1 0 0 1 0";
        assertEquals(s, c.toString());
    }

    @Test
    public void verwerkResultatenGelijkPunten() {
        Voetbalclub c = new Voetbalclub("club");
        c.verwerkResultaat('g');
        assertEquals(1, c.aantalPunten(), "aantalPunten moet 1 zijn");
    }

    @Test
    public void verwerkResultatenGelijkGespeeld() {
        Voetbalclub c = new Voetbalclub("club");
        c.verwerkResultaat('g');
        assertEquals(1, c.aantalGespeeld(), "aantalGespeeld moet 1 zijn");
    }

    @Test
    public void verwerkResultatenGelijkToString() {
        Voetbalclub c = new Voetbalclub("club");
        c.verwerkResultaat('g');
        String s = "club 1 0 1 0 1";
        assertEquals(s, c.toString());
    }

    @Test
    public void verwerkResultatenFoutPunten() {
        Voetbalclub c = new Voetbalclub("club");
        c.verwerkResultaat('x');
        assertEquals(0, c.aantalPunten(), "aantalPunten moet 0 zijn");
    }

    @Test
    public void verwerkResultatenFoutGespeeld() {
        Voetbalclub c = new Voetbalclub("club");
        c.verwerkResultaat('x');
        assertEquals(0, c.aantalGespeeld(), "aantalGespeeld moet 1 zijn");
    }

    @Test
    public void verwerkResultatenFoutToString() {
        Voetbalclub c = new Voetbalclub("club");
        c.verwerkResultaat('x');
        String s = "club 0 0 0 0 0";
        assertEquals(s, c.toString());
    }

    @Test
    public void MultipleResultsToString(){
        Voetbalclub c = new Voetbalclub("club");
        c.verwerkResultaat('v');
        c.verwerkResultaat('w');
        c.verwerkResultaat('w');
        c.verwerkResultaat('g');
        c.verwerkResultaat('x');
        String s = "club 4 2 1 1 7";
        assertEquals(s, c.toString());
    }
}