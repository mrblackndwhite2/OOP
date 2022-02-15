package week1.les1.practicum1;

public class Main {
    public static void opdracht1() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1);
        }
    }

    public static void opdracht2() {
        int i = 1;
        while (i < 11) {
            System.out.println(i);
            i++;
        }
    }

    public static void opdracht3() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random());
        }
    }

    public static void opdracht4() {
        int res = 0;
        for (int i = 1; i < 40; i++) {
            res += i;
        }
        System.out.println(res);
    }

    public static void opdracht5() {
        for (int i = 0; i < 4; i++) {
            if (i % 2 == 0) {
                System.out.println('s');
            } else {
                System.out.println("ss");
            }
        }
    }

    public static void main(String[] args) {
        opdracht1();
        opdracht2();
        opdracht3();
        opdracht4();
        opdracht5();
    }
}
