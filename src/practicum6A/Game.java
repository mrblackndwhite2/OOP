package practicum6A;

import java.time.LocalDate;

public class Game {
    private String naam;
    private int releaseJaar;
    private double nieuwprijs;

    public Game(String nm, int rJ, double nwpr) {
        this.naam = nm;
        this.releaseJaar = rJ;
        this.nieuwprijs = nwpr;
    }

    public String getNaam() {
        return naam;
    }

    public double huidigeWaarde() {
        int exp = LocalDate.now().getYear() - releaseJaar;
        double prijs = nieuwprijs * Math.pow(0.7, exp); //30% per jaar
        return prijs;
    }

    @Override
    public boolean equals(Object andereObject) {
        // check class
        if (!(andereObject.getClass().getSimpleName().equals(this.getClass().getSimpleName()))) {
            return false;
        }

        Game andereGame = (Game) andereObject;

        // check naam en releasejaar
        if (!(andereGame.naam.equals(this.naam))) {
            return false;
        }

        if (andereGame.releaseJaar != this.releaseJaar) {
            return false;
        }

        // passed all the checks
        return true;
    }

    @Override
    public String toString() {
        String res = naam;
        res += ", uitgegeven in ";
        res += releaseJaar;
        res += "; nieuwprijs: €";
        res += String.format("%.2f", nieuwprijs);
        res += " nu voor: €";
        res += String.format("%.2f", huidigeWaarde());
        return res;
    }
}
