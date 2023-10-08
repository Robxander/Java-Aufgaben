public class Aufgabe14_2 {
    public static void main(String[] args) {
        int[] arrayOne = {6,7,4,5,6,2,9,10,11,12};
        int[] arrayTwo = new int[100];



        for (int i = 0; i< arrayTwo.length; i++){
            arrayTwo[i] = (int)(100 * Math.random());
            System.out.println(arrayTwo[i]);
        }


    }
}
