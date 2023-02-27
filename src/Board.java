public class Board {
    private String[][] boardTable = { {" ", " ", " "},
                            {" ", " ", " "},
                            {" ", " ", " "}};

    public void boardPrinting() {
        System.out.println("  1  2  3 ");
        for(int i = 0; i < 3; i++) {
            System.out.print(i + 1);
            for(int j = 0; j < 3; j++) {
                System.out.print(" " + boardTable[i][j] + " ");
            }
            System.out.println();
        }
    }
    public boolean checkColumn(int column) {
        boolean free = false;
        for(int i = 0; i < 3; i++) {
            if (boardTable[column][i].equals(" ")) {
                free = true;
                break;
            }
        }
        return free;
    }
    public boolean checkRow(int column, int row) {
        boolean free = false;
        if (boardTable[column][row].equals(" ")) {
            free = true;
        }
        return free;
    }
    public void putSign(String sign, int column, int row) {
        boardTable[row][column] = sign;
    }

    public boolean isWinner(String sign) {
        boolean victory = false;
        if(boardTable[1][1].equals(sign)) {
            if(boardTable[0][0].equals(sign) && boardTable[2][2].equals(sign)) {

            }
        }

        return victory;
    }
}
