import java.util.Scanner;

public class InOutPut {

    public void InOutPut() {
        Scanner input = new Scanner(System.in);
    }

    public String choiceSign() {
        Scanner input = new Scanner(System.in);
        String sign = " ";
        while(!sign.equals("O") && !sign.equals("X") && !sign.equals("L")) {
            System.out.println("Wybierasz kółko (O), krzyżyk (X) czy losowanie (L)?");
            sign = input.nextLine().toUpperCase();
        }
        return sign;
    }
}
