package practicum4B;

public class Main {
    public static void main(String[] args) {
        AutoHuur ah1 = new AutoHuur();
        System.out.println("Eerste autohuur:\n" + ah1 + "\n");

        Klant k = new Klant("Mijnheer de Vries");
        k.setKorting(10.0);
        ah1.setHuurder(k);
        System.out.println("Eerste autohuur:\n" + ah1 + "\n");

        Auto a1 = new Auto("Peugeot 207", 50);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(4);
        System.out.println("Eerste autohuur:\n" + ah1 + "\n");

        AutoHuur ah2 = new AutoHuur();
        Auto a2 = new Auto("Ferrari", 3500);
        ah2.setGehuurdeAuto(a2);
        ah2.setHuurder(k);
        ah2.setAantalDagen(1);
        System.out.println("Tweede autohuur:\n" + ah2 + "\n");

        System.out.println("Gehuurd: " + ah1.getGehuurdeAuto());
        System.out.println("Gehuurd: " + ah2.getGehuurdeAuto());
    }
    /*
    expected output
        Eerste autohuur:
        er is geen auto bekend
        er is geen huurder bekend
        aantal dagen: 0 en dat kost 0.0

        Eerste autohuur:
        er is geen auto bekend
        op naam van: Mijnheer de Vries (korting: 10.0%)
        aantal dagen: 0 en dat kost 0.0

        Eerste autohuur:
        autotype: Peugeot 207 met prijs per dag: 50.0
        op naam van: Mijnheer de Vries (korting: 10.0%)
        aantal dagen: 4 en dat kost 180.0

        Tweede autohuur:
        autotype: Ferrari met prijs per dag: 3500.0
        op naam van: Mijnheer de Vries (korting: 10.0%)
        aantal dagen: 1 en dat kost 3150.0

        Gehuurd: Peugeot 207 met prijs per dag: 50.0
        Gehuurd: Ferrari met prijs per dag: 3500.0
     */
}
