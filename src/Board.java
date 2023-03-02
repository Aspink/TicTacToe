public class Board {
    private final String[][] boardTable = { {" ", " ", " "},
                            {" ", " ", " "},
                            {" ", " ", " "}};
    private final int[][][] winningSets = {
        {{0,0},{1,1},{2,2}},
        {{0,2},{1,1},{2,0}},
        {{1,0},{1,1},{1,2}},
        {{0,1},{1,1},{2,1}},
        {{0,0},{0,1},{0,2}},
        {{2,0},{2,1},{2,2}},
        {{0,0},{1,0},{2,0}},
        {{0,2},{1,2},{2,2}},
    };
    public void boardPrinting() {
        System.out.println("\n\t1\t2\t3 ");
        for(int i = 0; i < 3; i++) {
            System.out.print(i + 1);
            for(int j = 0; j < 3; j++) {
                System.out.print("\t" + boardTable[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    public boolean checkColumn(int column) {
        boolean free = false;
        if(column < 0 || column > 2) {
            return false;
        }
        for(int i = 0; i < 3; i++) {
            if (boardTable[i][column].equals(" ")) {
                free = true;
                break;
            }
        }
        return free;
    }
    public boolean checkRow(int column, int row) {
        if(row < 0 || row > 2) {
            return false;
        }
        return boardTable[row][column].equals(" ");
    }
    public void putSign(String sign, int column, int row) {
        boardTable[row][column] = sign;
    }

    public boolean isWinner(String sign) {
        boolean victory = false;
        int startSet = 0;
        if(!boardTable[1][1].equals(sign)) {
            startSet = 4;
        }
        for(int set = startSet; set<8; set++) {
            if( boardTable[winningSets[set][0][0]][winningSets[set][0][1]].equals(sign) &&
                boardTable[winningSets[set][1][0]][winningSets[set][1][1]].equals(sign) &&
                boardTable[winningSets[set][2][0]][winningSets[set][2][1]].equals(sign)) {
                boardTable[winningSets[set][0][0]][winningSets[set][0][1]] = InOutPut.RED + sign + InOutPut.RESET;
                boardTable[winningSets[set][1][0]][winningSets[set][1][1]] = InOutPut.RED + sign + InOutPut.RESET;
                boardTable[winningSets[set][2][0]][winningSets[set][2][1]] = InOutPut.RED + sign + InOutPut.RESET;
                victory = true;
                break;
            }
        }
        return victory;
    }
}
