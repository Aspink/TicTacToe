import java.util.Scanner;

public class TicTacToe {
    static String[] name = new String[2];
    static String[] callPlayerName = {"Podaj swoje imię, graczu 1:", "Podaj imię gracza 2. Jeśli chcesz grać ze mną, podaj moje imię - Computer."};
    Board newBoard = new Board();
    public static Player player1 = new Player();
    Player player2 = new Player();

    public static void main(String[] args) {
        InOutPut  userInterface = new InOutPut();
        player1.setSign(userInterface.choiceSign());

//        Scanner input = new Scanner(System.in);
//        inputNames(name, callPlayerName);
//
//
//        player1.setName(name[0]);
//        player1.setSign(inputSign());
//        ClearScreen.cls();
//        newBoard.boardTable[0][2] = "O";
//        newBoard.boardTable[1][0] = "X";
//        newBoard.boardPrinting();
//        newBoard.boardTable[1][1] = "O";
//        newBoard.boardTable[2][0] = "X";
//        ClearScreen.cls();
//        newBoard.boardPrinting();
//        newBoard.boardTable[0][0] = "O";
//        newBoard.boardTable[2][2] = "X";
//        System.out.print("\033[H\033[2J");
//        System.out.flush();
//        newBoard.boardPrinting();


    }

//    private static String inputSign() {
//        System.out.println(player1.getName() + ", czym grasz? Wybierz X, O lub L(losuj) ");
//    }
//
//    public static void inputNames(String[] name, String[] callPlayerName) {
//        for (int i = 0; i<2; i++) {
//            System.out.println(callPlayerName[i]);
//            name[i] = input.nextLine();
//        }
//    }
}