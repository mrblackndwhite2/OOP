package practicum5;

public class Main {
    public static void main(String[] arg) {
        Klas k = new Klas("V1Z");
        Leerling l = new Leerling("Hans");
        k.voegLeerlingToe(l);
        l = new Leerling("Jan");
        k.voegLeerlingToe(l);
        l = new Leerling("Wim");
        k.voegLeerlingToe(l);
        System.out.println(k);
        k.wijzigCijfer(new String("Hans"), 7.6);
        k.wijzigCijfer("Klaas", 7.6);
        System.out.println(k.toString());
        System.out.println("Aantal leerlingen: " + k.aantalLeerlingen());
    }
}
/*
In klas V1Z zitten de volgende leerlingen:
Hans heeft cijfer: 0.0
Jan heeft cijfer: 0.0
Wim heeft cijfer: 0.0

In klas V1Z zitten de volgende leerlingen:
Hans heeft cijfer: 7.6
Jan heeft cijfer: 0.0
Wim heeft cijfer: 0.0

Aantal leerlingen: 3
 */
