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

