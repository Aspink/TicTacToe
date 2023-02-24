public class Player {
    private String name;

    private String sign;
    private String color;

    public Player() {

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
        System.out.println(color + name + ", twój ruch!" + InOutPut.RESET);
    }
}
