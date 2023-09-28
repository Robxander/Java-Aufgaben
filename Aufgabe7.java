import java.util.Random;
import java.util.Scanner;

public class Aufgabe7 {
    public static void main(String[] args) {
        Random r = new Random();
     //   boolean head = r.nextBoolean();
        Scanner scanner = new Scanner(System.in);
        int countHead = 0;
        int countNumber = 0;
        int frequent = 0;

        System.out.println("Wie oft soll geworfen werden?");
        frequent = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < frequent; i++) {

          //  head = r.nextBoolean();
            if (r.nextBoolean()) {
                System.out.println("Werfe Münze .... Kopf");
                countHead++;
            } else {
                System.out.println("Werfe Münze .... Zahl");
                countNumber++;
            }
        }
        if (countHead == countNumber) {
            System.out.println("unentschieden, keiner hat gewonnen");
        } else {
            System.out.println("Summe Kopf: " + countHead);
            System.out.println("Summe Zahl: " + countNumber);
        }


    }
}