package practicum8;

public class Main {
    public static void main(String[] args) {
        BedrijfInventaris bin = new BedrijfInventaris("bin", 10000);
        Computer c1 = new Computer("HP", "adres1", 500, 2020); // huidigewaarde 180
        Computer c2 = new Computer("HP", "adres1", 500, 2020);
        Auto a1 = new Auto("Volkswagen", 1300, 2019, "ab-12-cd"); // huidigewaarde 445.9
        Auto a2 = new Auto("Volkswagen", 1300, 2019, "ab-12-cd");
        Fiets f1 = new Fiets("Gazelle", 400, 2021, 12345);  // huidigewaarde 360
        Fiets f2 = new Fiets("Gazelle", 400, 2021, 12345);
        Computer c3 = new Computer("Apple", "adres2", 800, 2018);   // huidigewaarde 103.68
        Auto a3 = new Auto("Mercedes", 1100, 2020, "ef-34-gh");     // huidigewaarde 539
        Fiets f3 = new Fiets("Batavus", 500, 2022, 54321);         // huidigewaarde 360
        Auto a4 = new Auto("Ferrari", 20000, 2022, "12-aa-21");     // huidigewaarde 20000
        bin.schafAan(c1);
        bin.schafAan(c2);
        bin.schafAan(c3);
        bin.schafAan(a1);
        bin.schafAan(a2);
        bin.schafAan(a3);
        bin.schafAan(f1);
        bin.schafAan(f2);
        bin.schafAan(f3);
        bin.schafAan(a4);
        System.out.println(bin);
    }
}
