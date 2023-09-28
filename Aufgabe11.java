import java.util.Scanner;

public class Aufgabe11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int beer = 0;
        int shots = 0;
        int drinks = 0;
        int age = 0;
        boolean license = false;

        System.out.println("Wie alt bist du?");
        age = Integer.parseInt(scanner.nextLine());

        if (age < 17) {
            System.out.println("du darfst nicht autofahren");
        } else {
            System.out.println("Hast du einen Führerschein?");
            license = Boolean.parseBoolean(scanner.nextLine());
            if (license) {
                System.out.println("Gib ein wie viel Bier du getrunken hast:");
                beer = Integer.parseInt(scanner.nextLine());
                System.out.println("Gib ein wie viele Shots du getrunken hast:");
                shots = Integer.parseInt(scanner.nextLine());
                drinks = beer + shots;
                if (age > 16 && age < 19 && drinks == 0) {
                    System.out.println("du darfst Auto fahren");
                } else if (age > 18 && drinks <= 2) {
                    System.out.println("du bist leicht betrunken und darfst Auto fahren");
                } else {
                    System.out.println("du darfst nicht Auto fahren");
                }
            } else {
                System.out.println("du darfst nicht Auto fahren");
            }
        }
    }
}
