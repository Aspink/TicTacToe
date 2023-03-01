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
            if(free == false) {
                System.out.print("To zła kolumna była! ");
            }
        }
//        System.out.println("Kolumna: " + (column + 1));
        free = false;
        while(free == false) {
            row = InOutPut.choiceRow()-1;
            free = board.checkRow(column, row);
            if(free == false) {
                System.out.print("To miejsce jest już zajęte! ");
            }
        }
        System.out.print(InOutPut.RESET);
        board.putSign(sign, column, row);
    }

    public void youWin() {
        System.out.println(color + name + ", wygrałeś, gratulacje!" + InOutPut.RESET);
    }
    public String getSignMessage() {
        return color + "Twój znak to " + sign + "." + InOutPut.RESET;
    }
}
