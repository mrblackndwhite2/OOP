package practicum8;

import java.time.LocalDate;

public class Fiets extends Voertuig {
    private int framenummer;

    public Fiets(String tp, double pr, int jr, int fnr) {
        super(tp, pr, jr);
        framenummer = fnr;
    }

    @Override
    public double huidigeWaarde() {
        int exp = LocalDate.now().getYear() - bouwjaar;
        double base = 0.9;  //10% minder per jaar
        return nieuwprijs * Math.pow(base, exp);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(super.equals(obj))) {
            return false;
        }

        if (!(obj instanceof Fiets)) {
            return false;
        }

        Fiets f = (Fiets) obj;
        if (f.framenummer != this.framenummer){
            return false;
        }

        return true;
    }
}
