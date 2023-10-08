public class Aufgabe20 {
    public static void main(String[] args) {

        String[][][] array = new String[3][4][5];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                for (int k = 0; k < array[0][0].length; k++) {
                  //  array[i][j][k] = "hallo";
                    array[i][j][k] = "" + k;

                    System.out.println("Ebene "+i+ " Reihe "+j+ " Tabelle " +array[i][j][k]);
                }
                System.out.println();
            }
          //  System.out.println();

        }


    }

    /////////////////////////////////////////////////////////////// METHODEN


}
