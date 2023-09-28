import java.util.Scanner;

public class Aufgabe4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Welche Reihe soll ausgegeben werden?");
        int b = Integer.parseInt(scanner.nextLine());
        int a = 1;
/*
        System.out.println("Welche Reihe soll ausgegeben werden?");
        int b = scanner.nextInt();
        int a = 1;
*/
        /*
        System.out.println("Welche Reihe soll ausgegeben werden?");
        int b = scanner.nextInt();
        System.out.println("Gib jetzt einen Text ein");
        String text = scanner.nextLine();
        System.out.println(text);
        int a = 1;
        /*
        scanner.nextLine();
        String text = scanner.nextLine();
         */

        System.out.println(a + "x" + b + "=" + (a*b));     a++;
        System.out.println(a + "x" + b + "=" + (a*b));     a++;
        System.out.println(a + "x" + b + "=" + (a*b));     a++;
        System.out.println(a + "x" + b + "=" + (a*b));     a++;
        System.out.println(a + "x" + b + "=" + (a*b));     a++;
        System.out.println(a + "x" + b + "=" + (a*b));     a++;
        System.out.println(a + "x" + b + "=" + (a*b));     a++;
        System.out.println(a + "x" + b + "=" + (a*b));     a++;
        System.out.println(a + "x" + b + "=" + (a*b));     a++;
        System.out.println(a + "x" + b + "=" + (a*b));     a++;
    }
}
