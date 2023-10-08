public class Aufgabe19 {
    public static void main(String[] args) {
        String[][] chessboard = new String[10][10];

        fillChessboardRandom(chessboard);
        printChessboard(chessboard);
    }
    ///////////////////////////////////////////////////// METHODEN


    static void printChessboard(String[][] chessboard) {
        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard.length; j++) {
                System.out.print(chessboard[i][j] + "  ");
            }
            System.out.println();
        }
    }

    static void fillChessboardRandom(String[][] chessboard) {
        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard[i].length; j++) {
            double randomNumber = 100 * Math.random();
                if (randomNumber < 50){
                    chessboard[i][j] = "X";
                } else {
                    chessboard[i][j] = "O";
                }
            }
        }
    }

}
