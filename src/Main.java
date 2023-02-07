public class Main {
    public static void main(String[] args) {
        Board newBoard = new Board();
        newBoard.boardTable[0][2] = "O";
        newBoard.boardTable[1][0] = "X";
        newBoard.boardPrinting();
        newBoard.boardTable[1][1] = "O";
        newBoard.boardTable[2][0] = "X";
        newBoard.boardPrinting();
        newBoard.boardTable[0][0] = "O";
        newBoard.boardTable[2][2] = "X";
        newBoard.boardPrinting();


    }
}