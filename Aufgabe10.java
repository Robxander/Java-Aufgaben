import java.util.Scanner;

public class Aufgabe10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int beer = 0;
        int shots = 0;
        int drinks = 0;

        System.out.println("Gib ein wie viel Bier du getrunken hast:");
        beer = Integer.parseInt(scanner.nextLine());
        System.out.println("Gib ein wie viele Shots du getrunken hast:");
        shots = Integer.parseInt(scanner.nextLine());

        drinks = beer + shots;


        if (drinks == 0) {
            System.out.println("gar nicht betrunken");
        } else if (drinks <= 2) {
            System.out.println("leicht betrunken");
        } else if (drinks <= 6 && shots == 0) {
            System.out.println("betrunken");
        } else {
            System.out.println("hoffnungslos betrunken");
        }


    }
}
