public class Aufgabe18 {

    public static void main(String[] args) {
        String[][] chessboard = new String[8][8];

        fillChessboard(chessboard);
        printChessboard(chessboard);
    }

    //////////////////////////////////////////////////////////////// METHODEN
    static void fillChessboard(String[][] chessboard) {
        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard[i].length; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        chessboard[i][j] = "schw";
                    } else {
                        chessboard[i][j] = "weiß";
                    }
                } else {
                    if (j % 2 == 0) {
                        chessboard[i][j] = "weiß";
                    } else {
                        chessboard[i][j] = "schw";
                    }
                }
                //  System.out.print(chessboard[i][j] + " "); // for testing
            }
            //  System.out.println(); // for testing
        }
    }

    static void printChessboard(String[][] chessboard) {
        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard.length; j++) {
                System.out.print(chessboard[i][j] + " ");
            }
            System.out.println();
        }
    }


}
