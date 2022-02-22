package week1.les2.practicum2B;

public class Voetbalclub {
    private String naam;
    private int aantalGewonnen;
    private int aantalVerloren;
    private int aantalGelijk;

    public Voetbalclub(String naam) {
        if (naam == null || naam.isEmpty()) {
            this.naam = "FC";
        } else {
            this.naam = naam;
        }
        this.aantalGewonnen = 0;
        this.aantalGelijk = 0;
        this.aantalVerloren = 0;
    }

    public String getNaam() {
        return naam;
    }

    public int getAantalGewonnen() {
        return aantalGewonnen;
    }

    public int getAantalVerloren() {
        return aantalVerloren;
    }

    public int getAantalGelijk() {
        return aantalGelijk;
    }

    public int aantalGespeeld() {
        return aantalGewonnen + aantalVerloren + aantalGelijk;
    }

    public int aantalPunten() {
        return (aantalGewonnen * 3) + aantalGelijk;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }

    @Override
    public String toString() {
        return naam + " " + aantalGespeeld() +
                " " + aantalGewonnen +
                " " + aantalGelijk +
                " " + aantalVerloren +
                " " + aantalPunten();
    }
}
