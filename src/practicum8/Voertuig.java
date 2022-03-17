package practicum8;

public abstract class Voertuig implements Goed {
    private String type;
    protected double nieuwprijs;
    protected int bouwjaar;

    public Voertuig(String tp, double pr, int jr) {
        type = tp;
        nieuwprijs = pr;
        bouwjaar = jr;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Voertuig)) {
            return false;
        }

        Voertuig v = (Voertuig) obj;
        if (!(v.type.equals(this.type))) {
            return false;
        }

        if (v.bouwjaar != this.bouwjaar) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        String format = "Voertuig: %s met bouwjaar %d heeft een waarde van: €%.2f";
        return String.format(format, this.type, this.bouwjaar, this.huidigeWaarde());
    }
}
