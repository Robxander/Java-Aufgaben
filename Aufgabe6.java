import java.util.Random;
import java.util.Scanner;

public class Aufgabe6 {
    public static void main(String[] args) {
        Random r = new Random();
        boolean head = r.nextBoolean();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Möchtest du das Spiel beginnen, ja oder no?");
        String input = scanner.nextLine();


        while (input.equals("ja")) {
            if (head) {
                System.out.println("Die Münze ist auf Kopf gelandet, ich gewinne");
            } else {
                System.out.println("Die Münze ist auf Zahl gelandet, du gewinnst");
            }
            head = r.nextBoolean();
            System.out.println("Möchtest du das Spiel beginnen?");
            input = scanner.nextLine();
        }

    }
}
