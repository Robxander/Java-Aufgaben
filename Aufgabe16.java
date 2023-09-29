import com.sun.jdi.event.MethodEntryEvent;

public class Aufgabe16 {
    public static void main(String[] args) {

        int asciiStart = 65;
        int asciiEnd = 90;
        int quantityAscii = asciiEnd - asciiStart + 1;
        int howMuch =-2;
     //   boolean condition = true;
        char[] allBigLetters = new char[quantityAscii];

        for (int i = 0; i < allBigLetters.length; i++) {
            allBigLetters[i] = (char) (asciiStart + i);
        }
        System.out.println(allBigLetters);

        char[] lettersShift = new char[quantityAscii];
        shiftLeftRight(howMuch, lettersShift, quantityAscii, asciiStart);



////////////////////////////////////////////////////////////////////////////////////////////////////
//        int asciiStart = 65;
//        int asciiEnd = 90;
//        int quantityAscii = asciiEnd - asciiStart + 1;
//        int howMuch = 0;
//        boolean condition = true;
//        char[] allBigLetters = new char[quantityAscii];
//        char[] lettersShift = new char[quantityAscii];
//        //  int i = 0;
//
//        for (int i = 0; i < allBigLetters.length; i++) {
//            allBigLetters[i] = (char) (asciiStart + i);
//        }
//        System.out.println(allBigLetters);
//        int j = 0;
//        if (howMuch >= 0) { // left shifting
//            for (int i = 0; i < lettersShift.length; i++) {
//                if (i < (lettersShift.length - howMuch)) {
//                    lettersShift[i] = allBigLetters[howMuch + i];
//                } else {
//                    lettersShift[i] = allBigLetters[j];
//                    j++;
//                }
//            }
//        } else {    // right shifting
//            j = 0;
//            for (int i = 0; i < lettersShift.length; i++) {
//                if (i < (-howMuch)) {
//                    lettersShift[i] = allBigLetters[lettersShift.length + howMuch + i];
//                } else {
//                    lettersShift[i] = allBigLetters[j];
//                    j++;
//                }
//            }
//        }
//        System.out.println(lettersShift);


/////////////////////////////////////////////////////////////////////////////////////////////////
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
    ///////////////////////////////////////////////////
    //METHODEN

    static void shiftLeft(int howMuch, char[] lettersShift, int quantityAscii, int asciiStart) {
        for (int i = 0; i < lettersShift.length; i++) {
            // Left shifting
            lettersShift[i] = (char) (asciiStart + (howMuch + i) % quantityAscii);
        }
        System.out.println(lettersShift);
    }

    static void shiftRight(int howMuch, char[] lettersShift,int quantityAscii, int asciiStart) {
        for (int i = 0; i < lettersShift.length; i++) {
            // right shift
            lettersShift[i] = (char) (asciiStart + (quantityAscii + howMuch + i) % quantityAscii);
        }
        System.out.println(lettersShift);
    }

    static void shiftLeftRight (int howMuch, char[] lettersShift, int quantityAscii, int asciiStart){
        if (howMuch >= 0) {
            shiftLeft(howMuch, lettersShift, quantityAscii, asciiStart);
        } else {
            shiftRight(howMuch, lettersShift, quantityAscii, asciiStart);
        }
    }
}
