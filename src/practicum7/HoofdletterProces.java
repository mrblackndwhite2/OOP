package practicum7;

import java.util.Locale;

public class HoofdletterProces implements OpmaakProces {
    public HoofdletterProces() {

    }

    public String maakOp(String input) {
        return input.toUpperCase(Locale.ROOT);
    }
}
