import java.util.Scanner;

public class Aufgabe8_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {

            System.out.println("Gib die Operatoren + - / * % ein: ");
            char operator = scanner.nextLine().charAt(0);

            if (operator == 'x') {
                isRunning = false;
            } else if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {

                System.out.println(" Gib die Zahl 1 ein: ");
                double x = Double.parseDouble(scanner.nextLine());
                System.out.println(" Gib die Zahl 2 ein: ");
                double y = Double.parseDouble(scanner.nextLine());

                double calc = 0;
                switch (operator) {
                    case '+':
                        calc = x + y;
                        break;

                    case '-':
                        calc = x - y;
                        break;

                    case '*':
                        calc = x * y;
                        break;

                    case '/':
                        calc = x / y;
                        break;

                    case '%':
                        calc = x % y;
                        break;
                }
                System.out.println(x + " " + operator + " " + y + " = " + calc);

            } else {
                System.out.println(" Das ist eine ungültige Eingabe! ");
            }
        }
        System.out.println("Taschenrechner beendet, auf Wiedersehen! ");

    }
}
