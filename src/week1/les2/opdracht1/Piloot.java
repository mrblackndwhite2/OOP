package week1.les2.opdracht1;

public class Piloot {
    private String naam;
    private double salaris;
    private int vlieguren;

    public Piloot(String naam) {
        this.naam = naam;
        this.salaris = 0;
        this.vlieguren = 0;
    }

    public double getSalaris() {
        return this.salaris;
    }

    public int getVlieguren() {
        return vlieguren;
    }

    public void setSalaris(double salaris) {
        this.salaris = salaris;
    }

    public void verhoogVliegurenMet(int verhoging) {
        this.vlieguren += verhoging;
    }

    @Override
    public String toString(){
        return naam + " heeft " + vlieguren + " vlieguren gemaakt en verdient " +  salaris;
    }
}
