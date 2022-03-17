package practicum8;

import java.time.LocalDate;

public class Computer implements Goed {
    private String type;
    private String macAdres;
    private double aanschafPrijs;
    private int productieJaar;

    public Computer(String tp, String adr, double pr, int jr) {
        type = tp;
        macAdres = adr;
        aanschafPrijs = pr;
        productieJaar = jr;
    }

    @Override
    public double huidigeWaarde() {
        int exp = LocalDate.now().getYear() - productieJaar;
        double base = 0.6;  //40% minder per jaar
        return aanschafPrijs * Math.pow(base, exp);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Computer)) {
            return false;
        }

        Computer g = (Computer) obj;
        if (!(g.macAdres.equals(this.macAdres))) {
            return false;
        }
        if (g.productieJaar != this.productieJaar) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        String format = "Computer: %s heeft een waarde van: %.2f";
        return String.format(format, this.type, this.huidigeWaarde());
    }
}
