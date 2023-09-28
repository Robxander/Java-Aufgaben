import java.util.Scanner;

public class Aufgabe5 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        System.out.println("Gib die erste Zahl ein: ");
        int a = Integer.parseInt(sca.nextLine());

        System.out.println("Gib die zweite Zahl ein: ");
        int b = Integer.parseInt(sca.nextLine());

        System.out.println("Gib den Operator +, -, *, /, %, ein: ");
        // sca.nextLine();
        char operator = sca.nextLine().charAt(0);

        /* System.out.println(a);
        System.out.println(b);
        System.out.println(operator);   */

        switch (operator) {
            case '+': System.out.println("Rechnung: " + a + operator + b + " = " + (a + b));
            break;

            case '-': System.out.println("Rechnung: " + a + operator + b + " = " + (a - b));
            break;

            case '*': System.out.println("Rechnung: " + a + operator + b + " = " + (a * b));
            break;

            case '/': System.out.println("Rechnung: " + a + operator + b + " = " + ((double)a / (double)b));
            break;

            case '%': System.out.println("Rechnung: " + a + operator + b + " = " + (a % b));
            break;

            default:  System.out.println("Falscher Operator");
            break;

        }


    }
}
