public class Player {
    private String name;

    public String sign;
    public String color;
    public Board board;

    public Player(Board board) {
        this.board = board;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSign() {
        return sign;
    }

    public void yourTurn() {
        System.out.println(color + name + ", twój ruch!");
        int column = 0, row = 0;
        boolean free = false;
        while(!free) {
            column = InOutPut.choiceColumn()-1;
            free = board.checkColumn(column);
            if(!free) {
                System.out.print("To zła kolumna była! Podaj prawidłową. ");
            }
        }
        free = false;
        while(!free) {
            row = InOutPut.choiceRow()-1;
            free = board.checkRow(column, row);
            if(!free) {
                System.out.print("Serio?! Podaj prawidłowy wiersz! ");
            }
        }
        System.out.print(InOutPut.RESET);
        board.putSign(sign, column, row);
    }

    public void youWin() {
        System.out.println(color + name + ", wygrywasz \uD83D\uDE42, gratulacje!" + InOutPut.RESET);
    }
    public String getSignMessage() {
        return color + "Twój znak to " + sign + "." + InOutPut.RESET;
    }
}
