import java.util.Random;
public class ComputerPlayer extends Player{
    public ComputerPlayer(Board board) {
        super(board);
        setName("Komputer");
    }

    @Override
    public void yourTurn() {
        System.out.println(color + "Teraz mój ruch!\n");
        Random random = new Random();
        int column = 0, row = 0;
        boolean free = false;
        while(free == false) {
            column = random.nextInt(3);
            free = board.checkColumn(column);
        }
        System.out.println("Kolumna: " + (column + 1));
        free = false;
        while(free == false) {
            row = random.nextInt(3);
            free = board.checkRow(column, row);
        }
        System.out.println("Wiersz: " + (row + 1) + "\n" + InOutPut.RESET);
        board.putSign(sign, column, row);
    }
    @Override
    public void youWin() {
        System.out.println(color + "Wygrałem! Wygrałem! A Ty przegrałeś, ha ha ha!" + InOutPut.RESET);
    }
}
