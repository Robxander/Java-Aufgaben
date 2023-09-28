import java.util.Random;

public class Aufgabe14 {
    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 100};
        int[] secondArray = new int[100];
        boolean[] thirdArray = new boolean[100];
//        Random randomTest = new Random();
//        boolean testBoolean;
        boolean booleanOne = true;
        boolean booleanTwo = false;

        for (int i = 0; i < firstArray.length; i++) {
            System.out.println(firstArray[i]);
        }
        System.out.println();

        for (int i = 0; i < secondArray.length; i++) {
            double doubleRandom = 100 * Math.random();
            int testConvert = (int) doubleRandom;
            secondArray[i] = testConvert;
            System.out.println(secondArray[i]);
        }
        System.out.println();
//        testBoolean = randomTest.nextBoolean();
//        boolean oppositBoolean;

        for (int i = 0; i < thirdArray.length; i++) {
            thirdArray[i] = (i % 2 == 0);   // der Vergleichsoperator == wandelt das Statement in ein Boolean um.

//            if (i%2 == 0){
//                thirdArray[i] = true;
//            } else {
//                thirdArray[i] = false;
//            }
            System.out.println(thirdArray[i]);
        }

//        for (int i = 0; i< thirdArray.length){
//            i = i + 2;
//            thirdArray[i] = true;
//        }
    }
}
