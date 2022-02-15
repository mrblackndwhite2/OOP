package week1.les2.practicum2A;

public class Zwembad {
    private double breedte;
    private double lengte;
    private double diepte;

    public Zwembad() {
        breedte = 0;
        lengte = 0;
        diepte = 0;
    }

    public Zwembad(double b, double l, double d) {
        breedte = b;
        lengte = l;
        diepte = d;
    }

    public double getBreedte() {
        return breedte;
    }

    public double getLengte() {
        return lengte;
    }

    public double getDiepte() {
        return diepte;
    }

    public void setBreedte(double b) {
        breedte = b;
    }

    public void setLengte(double l) {
        lengte = l;
    }

    public void setDiepte(double d) {
        diepte = d;
    }

    public double inhoud(){
        return lengte * breedte * diepte;
    }

    @Override
    public String toString(){
        return "Dit zwembad is " +
                breedte + " meter breed, " +
                lengte + " meter lang, en " +
                diepte + " meter diep";
    }
}
