package practicum7;

import java.util.ArrayList;

public class StringProcessor {
    private ArrayList<OpmaakProces> processen;

    public StringProcessor() {
        this.processen = new ArrayList<OpmaakProces>();
    }

    public String verwerk(String input) {
        for (OpmaakProces p : this.processen) {
            input = p.maakOp(input);
        }
        return input;
    }

    public void voegProcesToe(OpmaakProces proces) {
        this.processen.add(proces);
    }
}
