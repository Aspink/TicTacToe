public class Player {
    public void setName(String name) {
        this.name = name;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    private String name;
    private String sign;

    public Player() {

    }

    public String getName() {
        return name;
    }

    public String getSign() {
        return sign;
    }
}
