import java.util.Scanner;

public class TicTacToe {
    static String[] name = new String[2];
    static String[] callPlayerName = {"Podaj swoje imię, graczu 1:", "Podaj imię gracza 2. Jeśli chcesz grać ze mną, podaj moje imię - Computer."};

    public static void main(String[] args) {
        inputNames(name, callPlayerName);
        Board newBoard = new Board();
        Player player1 = new Player();
        Player player2 = new Player();

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

    public static void inputNames(String[] name, String[] callPlayerName) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i<2; i++) {
            System.out.println(callPlayerName[i]);
            name[i] = input.nextLine();
        }
    }
}