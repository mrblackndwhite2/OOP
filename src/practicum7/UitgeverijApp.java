package practicum7;

import java.util.ArrayList;

public class UitgeverijApp {
    public static void main(String[] args) {
        StringProcessor processor = new StringProcessor();
        processor.voegProcesToe(new VervangProces("hij", "hij/zij"));
        processor.voegProcesToe(new HoofdletterProces());
        ArrayList<String> woorden = new ArrayList<String>();
        woorden.add("MEESTAL");
        processor.voegProcesToe(new CensuurProces(woorden));
        String inputString = "Een student loopt meestal in het derde jaar stage. Dan moet hij zelf een stageplek vinden.";
        String result = processor.verwerk(inputString);
        System.out.println(result);
    }
}
