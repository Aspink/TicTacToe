public class Game {
    public Board board = new Board();
    public Player player1 = new Player(board);
    public Player player2;
    public Player currentPlayer;
    InOutPut userInterface = new InOutPut();
//    public void Game() {}
    public void start() {
        player1.setColor(InOutPut.YELLOW);
        player1.setName(userInterface.whatsYourName(InOutPut.YELLOW));
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
        if(player1.getSign().equals("X")) {
            currentPlayer = player1;
            player2.setSign("O");
        } else {
            currentPlayer = player2;
            player2.setSign("X");
        }
        System.out.println(player2.getName() + " ma znak " + player2.getSign() + "\n");
        currentPlayer.yourTurn();
        board.boardPrinting();
    }


}
