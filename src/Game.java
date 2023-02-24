public class Game {
    Board newBoard = new Board();
    public Player player1 = new Player();
    InOutPut userInterface = new InOutPut();
    public void Game() {}
    public void start() {
        player1.setName(userInterface.whatsYourName());
        player1.setSign(userInterface.choiceSign());
    }


}
