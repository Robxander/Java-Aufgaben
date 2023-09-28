import java.util.Scanner;

public class Aufgabe8_Ue3 {
    public static void main(String[] args) {
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Gib die Operatoren + - / * % ein: ");
            Scanner scanner = new Scanner(System.in);
            char operator = scanner.nextLine().charAt(0);
            if (operator == 'x') {
                isRunning = false;
            } else if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {
                System.out.println("Gib die Zahl 1 ein: ");
                double x = Double.parseDouble(scanner.nextLine());
                System.out.println("Gib die Zahl 2 ein: ");
                double y = Double.parseDouble(scanner.nextLine());

 // berechne die Rechnung
                double calc = 0;
                switch (operator){
                    case '+': calc = x + y; break;
                    case '-': calc = x - y; break;
                    case '*': calc = x + y; break;
                    case '/': calc = x + y; break;
                    case '%': calc = x + y; break;

                }

            } else {
                System.out.println("Falsche Eingabe, gib den Operator ein: ");
            }
        }
        System.out.println("Das Programm wird beendet, auf Wiedersehen. ");
    }
}
