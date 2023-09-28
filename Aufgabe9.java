public class Aufgabe9 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Oachkatzlschwoaf");
            } else if (i % 3 == 0) {
                System.out.println("Oachkatzl");
            } else if (i % 5 == 0) {
                System.out.println("Schwoaf");
            } else {
                System.out.println(i + " ");
            }
        }
    }
}
