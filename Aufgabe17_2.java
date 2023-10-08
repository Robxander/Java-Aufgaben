import java.util.Scanner;

public class Aufgabe17_2 {
    static Scanner scanner = new Scanner(System.in);

    static void printTriangle(int height) {
        String[][] array = new String[height][height];

        for (int i = 0; i < array.length; i++) { // rows
            for (int j = 0; j < array[i].length; j++) { // columns
                if (j < i + 1) {
                    array[i][j] = "*";
                } else {
                    array[i][j] = " ";
                }
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    static void printFullTriangle(int height) {
        String[][] array = new String[height][2 * height - 1];

        for (int i = 0; i < array.length; i++) { // rows
            for (int j = 0; j < array[i].length; j++) { // columns
                if ((height - i - 1) > j || (height + i - 1) < j) {
                    array[i][j] = " ";
                } else {
                    array[i][j] = "*";
                }
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    /////////////////////////////////////////////////////////////////  MAIN
    public static void main(String[] args) {
        System.out.println("Gib die Höhe des Triangles an:");
        int height = Integer.parseInt(scanner.nextLine());

        //   printTriangle(height);
        System.out.println();
        printFullTriangle(height);
    }


}
