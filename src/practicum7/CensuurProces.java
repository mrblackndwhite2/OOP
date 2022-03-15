package practicum7;

import java.util.ArrayList;

public class CensuurProces implements OpmaakProces {
    private ArrayList<String> woorden;

    public CensuurProces(ArrayList<String> woorden) {
        this.woorden = woorden;
    }

    public String maakOp(String input) {
        String censoredWoord;
        for (String woord : this.woorden) {
            censoredWoord = "*".repeat(woord.length());
            input = input.replace(woord, censoredWoord);
        }
        return input;
    }

    public void voegWoordToe(String woord){
        this.woorden.add(woord);
    }
}
