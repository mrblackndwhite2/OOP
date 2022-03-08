package practicum5;

import java.util.ArrayList;

public class Klas {
    private String klasCode;
    private ArrayList<Leerling> deLeerlingen;

    public Klas(String kC) {
        this.klasCode = kC;
        this.deLeerlingen = new ArrayList<Leerling>();
    }

    public void voegLeerlingToe(Leerling l) {
        this.deLeerlingen.add(l);
    }

    public void wijzigCijfer(String nm, double nweCijfer) {
        for (Leerling l : this.deLeerlingen) {
            if (l.getNaam().equals(nm)) {
                l.setCijfer(nweCijfer);
                return;
            }
        }
    }

    public ArrayList<Leerling> getLeerlingen() {
        return deLeerlingen;
    }

    public int aantalLeerlingen() {
        return this.deLeerlingen.size();
    }

    @Override
    public String toString() {
        String res = "In klas ";
        res += this.klasCode;
        res += " zitten de volgende leerlingen:\n";
        for (Leerling l : this.deLeerlingen) {
            res += l.toString() + "\n";
        }
        return res;
    }
}
