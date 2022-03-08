package practicum6A;

import java.util.ArrayList;

public class Persoon {
    private String naam;
    private double budget;
    private ArrayList<Game> mijnGames;

    public Persoon(String nm, double bud) {
        this.naam = nm;
        this.budget = bud;
        this.mijnGames = new ArrayList<Game>();
    }

    public double getBudget() {
        return budget;
    }

    public boolean koop(Game g) {
        // zit game al in library
        if (mijnGames.contains(g)) {
            return false;
        }

        // genoeg budget
        if (g.huidigeWaarde() > budget) {
            return false;
        }

        mijnGames.add(g);
        budget -= g.huidigeWaarde();
        return true;
    }

    public boolean verkoop(Game g, Persoon koper) {
        // als verkoper game niet bezit
        if (!(mijnGames.contains(g))) {
            return false;
        }

        //als koper game al heeft
        if (koper.mijnGames.contains(g)) {
            return false;
        }

        // als koper niet genoeg geld heeft
        if (koper.budget < g.huidigeWaarde()) {
            return false;
        }

        this.mijnGames.remove(g);
        koper.mijnGames.add(g);
        koper.budget -= g.huidigeWaarde();
        this.budget += g.huidigeWaarde();
        return true;
    }

    @Override
    public String toString() {
        String res = naam;
        res += " heeft een budget van €";
        res += String.format("%.2f", budget);
        res += " en bezit de volgende games:";
        for (int i = 0; i < mijnGames.size(); i++) {
            res += "\n" + mijnGames.get(i).toString();
        }
        return res;
    }
}
