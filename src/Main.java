public class Main {
    public static void main(String[] args) {
        Board newBoard = new Board();

        ClearScreen.cls();
        newBoard.boardTable[0][2] = "O";
        newBoard.boardTable[1][0] = "X";
        newBoard.boardPrinting();
        newBoard.boardTable[1][1] = "O";
        newBoard.boardTable[2][0] = "X";
        ClearScreen.cls();
        newBoard.boardPrinting();
        newBoard.boardTable[0][0] = "O";
        newBoard.boardTable[2][2] = "X";
        System.out.print("\033[H\033[2J");
        System.out.flush();
        newBoard.boardPrinting();


    }
}