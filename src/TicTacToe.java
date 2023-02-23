import java.util.Scanner;

public class TicTacToe {
    Board newBoard = new Board();
    public static Player player1 = new Player();
    Player player2 = new Player();

    public static void main(String[] args) {
        InOutPut userInterface = new InOutPut();
        player1.setSign(userInterface.choiceSign());
        player1.setName(userInterface.whatsYourName());
    }
}

