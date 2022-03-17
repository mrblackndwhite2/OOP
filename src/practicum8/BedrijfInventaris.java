package practicum8;

import java.util.ArrayList;

public class BedrijfInventaris {
    private String bedrijfsnaam;
    private double budget;
    private ArrayList<Goed> alleGoederen;

    public BedrijfInventaris(String nm, double bud) {
        bedrijfsnaam = nm;
        budget = bud;
        alleGoederen = new ArrayList<Goed>();
    }

    public void schafAan(Goed g) {
        if (g.huidigeWaarde() < budget) {
            if (!(alleGoederen.contains(g))) {
                alleGoederen.add(g);
                budget -= g.huidigeWaarde();
            }
        }
    }

    @Override
    public String toString() {
        String format = "Bedrijfsinventaris %s heeft een budget van €%.2f en heeft de volgende goederen:";
        String res = String.format(format, bedrijfsnaam, budget);
        for (Goed g : alleGoederen){
            res += "\n" + g.toString();
        }
        return res;
    }
}
