public class Main {
    public static void main(String[] args) {
        System.out.println("  1  2  3 ");
        System.out.println("1 X  O  X");
        System.out.println("2    O  X");
        System.out.println("3 X  O   ");
        Board newBoard = new Board();
        newBoard.boardTable[0][2] = "O";
        newBoard.boardTable[1][0] = "X";
        newBoard.boardPrinting();
        newBoard.boardTable[1][1] = "O";
        newBoard.boardTable[2][0] = "X";
        newBoard.boardPrinting();


    }
}