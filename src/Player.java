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

    public String getName() {
        return name;
    }

    public String getSign() {
        return sign;
    }

    public String getColor() {
        return color;
    }

    public void yourTurn() {
        System.out.println(color + name + ", twój ruch!");
        int column = 0, row = 0;
        boolean free = false;
        while(free == false) {
            column = InOutPut.choiceColumn()-1;
            free = board.checkColumn(column);
        }
//        System.out.println("Kolumna: " + (column + 1));
        while(free == false) {
            row = InOutPut.choiceRow()-1;
            free = board.checkRow(column, row);
        }
//        System.out.println("Wiersz: " + (row + 1) + "\n" + InOutPut.RESET);
        board.putSign(sign, column, row);
    }

    public void youWin() {
        System.out.println(color + name + ", wygrałeś, gratulacje!" + InOutPut.RESET);
    }
}
