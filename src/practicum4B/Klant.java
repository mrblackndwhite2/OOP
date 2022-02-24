package practicum4B;

public class Klant {
    private String naam;
    private double kortingsPercentage;

    public Klant(String nm) {
        this.naam = nm;
        this.kortingsPercentage = 0.0;
    }

    public void setKorting(double kP) {
        if (kP <= 0) {
            this.kortingsPercentage = 0;
        } else {
            this.kortingsPercentage = kP;
        }
    }

    public double getKorting() {
        return kortingsPercentage;
    }

    @Override
    public String toString() {
        return naam + " (korting: " + kortingsPercentage + "%)";
    }
}
