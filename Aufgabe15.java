public class Aufgabe15 {
    public static void main(String[] args) {
        String satz = "Unter #Handy finden sich 6 große Anbieter, 2 davon sind aber die besten!";
        int großbuchstabe = 0;
        int kleinbuchstabe = 0;
        int zahlen = 0;
        int sonstigeZeichen = 0;

        for (int i = 0; i < satz.length(); i++) {
            char x = satz.charAt(i);

            if (x > 64 && x < 91) {
                großbuchstabe++;
            } else if (x > 96 && x < 123) {
                kleinbuchstabe++;
            } else if (x > 47 && x < 58) {
                zahlen++;
            } else {
                sonstigeZeichen++;
            }
        }
        System.out.println("Es sind " + großbuchstabe + " Großbuchstaben zu finden");
        System.out.println("Es sind " + kleinbuchstabe + " Kleinbuchstaben zu finden");
        System.out.println("Es sind " + zahlen + " Zahlen zu finden");
        System.out.println("Es sind " + sonstigeZeichen + " sonstige Zeichen zu finden");
        System.out.println("In Summe gibt es " + satz.length() + " Zeichen");
    }
}
