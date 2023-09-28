public class Aufgabe16 {
    public static void main(String[] args) {

        int asciiStart = 65;
        int asciiEnd = 90;
        int quantityAscii = asciiEnd - asciiStart + 1;
        int howMuch = 5;
        boolean condition = true;
        char[] allBigLetters = new char[quantityAscii];
        char[] lettersShift = new char[quantityAscii];
        //  int i = 0;

        for (int i = 0; i < allBigLetters.length; i++) {
            allBigLetters[i] = (char) (asciiStart + i);

        }
        System.out.println(allBigLetters);
        int j = 0;
        for (int i = 0; i < lettersShift.length; i++) {
            if (i < (lettersShift.length - howMuch)) {
                lettersShift[i] = allBigLetters[howMuch + i];
            } else {
                lettersShift[i] = allBigLetters[j];
                j++;
            }
        }
        System.out.println(lettersShift);

//        while (condition) {
//            allBigLetters[i] = (char) (asciiStart + howMuch + i);
//            if (i > (quantityAscii - howMuch - 2)) {
//                condition = false;
//            }
//            i++;
//        }
//
//        condition = true;
//
//        int j = 0;
//        while (condition) {
//            if (i < quantityAscii) {
//                allBigLetters[i] = (char) (asciiStart + j);
//                i++;
//                j++;
//            } else {
//                condition = false;
//            }
//
//
//        }
//        System.out.println(allBigLetters);

    }
}
