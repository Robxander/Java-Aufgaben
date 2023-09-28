import java.util.Scanner;

public class Aufgabe8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char operator;
        int number1;
        int number2;

        System.out.println("Gib den Operator +, -, *, /, %, ein: ");
        operator = scanner.nextLine().charAt(0);

        while (operator != '+' && operator != '-' && operator != '*' && operator != '/' && operator != '%') {
            System.out.println(" Das war leider falsch, gib noch mal die Operatoren ein:  +, -, *, /, %, ein: ");
            operator = scanner.nextLine().charAt(0);
        }

        while (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {
            System.out.println("Enter numer 1: ");
            number1 = scanner.nextInt();
            System.out.println("Enter number 2: ");
            number2 = scanner.nextInt();

            if (operator == '+') {
                System.out.println(number1 + " " + operator + " " + number2 + " = " + (number1 + number2));
            } else if (operator == '-') {
                System.out.println(number1 + " " + operator + " " + number2 + " = " + (number1 - number2));
            } else if (operator == '*') {
                System.out.println(number1 + " " + operator + " " + number2 + " = " + (number1 * number2));
            } else if (operator == '/') {
                System.out.println(number1 + " " + operator + " " + number2 + " = " + ((double) number1 / (double) number2));
            } else {
                System.out.println(number1 + " " + operator + " " + number2 + " = " + (number1 % number2));
            }

            System.out.println("Enter the operator: ");
            scanner.nextLine();
            operator = scanner.nextLine().charAt(0);

            if (operator == 'x') {
                System.out.println("nun werde ich breaken ");
                break;
            }
            while (operator != '+' && operator != '-' && operator != '*' && operator != '/' && operator != '%') {
                System.out.println(" Das war leider falsch, gib noch mal die Operatoren ein:  +, -, *, /, %, ein: ");
                operator = scanner.nextLine().charAt(0);
            }
        }
        System.out.println("Programm is finished ");
    }
}
