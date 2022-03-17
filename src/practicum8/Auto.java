package practicum8;

import java.time.LocalDate;

public class Auto extends Voertuig {
    private String kenteken;

    public Auto(String tp, double pr, int jr, String kt) {
        super(tp, pr, jr);
        kenteken = kt;
    }

    @Override
    public double huidigeWaarde() {
        int exp = LocalDate.now().getYear() - bouwjaar;
        double base = 0.7;  //30% minder per jaar
        return nieuwprijs * Math.pow(base, exp);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(super.equals(obj))) {
            return false;
        }

        if (!(obj instanceof Auto)) {
            return false;
        }

        Auto a = (Auto) obj;
        if (!(a.kenteken.equals(this.kenteken))){
            return false;
        }

        return true;
    }
}
