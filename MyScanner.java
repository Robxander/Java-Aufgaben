import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.println("Gib deinen Namen ein");

        String name = scanner.nextLine();

        System.out.println("Gib dein Alter ein");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("Gib deine Größe ein");
        String height1 = scanner.nextLine();
        double height = Double.parseDouble(height1);

        System.out.println("Dein Name ist " + name + " und du bist " + age + " Jahre alt und " + height + " Meter groß");




    }
}
