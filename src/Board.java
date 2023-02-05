public class Board {
    String[][] boardTable = { {" ", " ", " "},
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

}
