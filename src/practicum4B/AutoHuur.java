package practicum4B;

public class AutoHuur {
    private int aantalDagen;
    private Klant huurder;
    private Auto gehuurdeAuto;

    public AutoHuur() {
        aantalDagen = 0;
    }

    public int getAantalDagen() {
        return aantalDagen;
    }

    public void setAantalDagen(int aD) {
        this.aantalDagen = aD;
    }

    public Klant getHuurder() {
        return huurder;
    }

    public void setHuurder(Klant k) {
        this.huurder = k;
    }

    public Auto getGehuurdeAuto() {
        return gehuurdeAuto;
    }

    public void setGehuurdeAuto(Auto gA) {
        this.gehuurdeAuto = gA;
    }

    public double totaalPrijs() {
        if (gehuurdeAuto == null || aantalDagen == 0) {
            return 0.0;
        }

        if (huurder == null) {
            return aantalDagen * gehuurdeAuto.getPrijsPerDag();
        } else {
            return aantalDagen * gehuurdeAuto.getPrijsPerDag() * (1 - huurder.getKorting() / 100);
        }
    }

    @Override
    public String toString() {
        String result = "";
        if (gehuurdeAuto == null) {
            result += "  er is geen auto bekende\n";
        } else {
            result += "  autotype: " + gehuurdeAuto.toString() + "\n";
        }

        if (huurder == null) {
            result += "  er is geen huurder bekend\n";
        } else {
            result += "  op naam van: " + huurder.toString() + "\n";
        }

        result += "  aantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();
        return result;
    }
}
