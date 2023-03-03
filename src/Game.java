public class Game {
    private final Board board = new Board();
    private final Player player1 = new Player(board);
    private Player player2;
    private Player currentPlayer;
    private boolean win = false;
    private int turn = 0;
    private final InOutPut userInterface = new InOutPut();
    public void start() {
        player1.setColor(InOutPut.YELLOW);
        player1.setName(InOutPut.whatsYourName(InOutPut.YELLOW));
        player1.setSign(userInterface.choiceSign());
        String opponent = userInterface.choiceOpponent();
        switch(opponent){
            case "K":
                System.out.println(InOutPut.YELLOW + "Świetny wybór, zatem gramy!" + InOutPut.RESET);
                player2 = new ComputerPlayer(board);
                player2.setColor(InOutPut.GREEN);
                break;
            case "C":
                System.out.println(InOutPut.YELLOW + "Super, dawaj go do klawiatury!\n" + InOutPut.RESET);
                player2 = new Player(board);
                player2.setColor(InOutPut.CYAN);
                player2.setName(InOutPut.whatsYourName(InOutPut.CYAN));
                break;
        }
        if(player1.getSign().equals("⛌")) {
            currentPlayer = player1;
            player2.setSign("〇");
        } else {
            currentPlayer = player2;
            player2.setSign("⛌");
        }
        System.out.println(player2.getSignMessage());
        board.boardPrinting();

        while(turn < 9 && !win) {
            currentPlayer.yourTurn();
            if(turn >= 4) {
                win = board.isWinner(currentPlayer.getSign());
            }
            board.boardPrinting();
            if(win) {
                currentPlayer.youWin();
            }
            currentPlayer = switchPlayer();
            turn++;
        }
        if(!win) {
            System.out.println(InOutPut.GREEN + "Plansza pełna, jest remis!" + InOutPut.RESET);
        }
        InOutPut.playAgain();
    }

    public Player switchPlayer() {
        if(currentPlayer == player1) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
        return currentPlayer;
    }
}
