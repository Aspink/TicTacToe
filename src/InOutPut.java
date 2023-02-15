import java.util.Scanner;

public class InOutPut {

    public void InOutPut() {
        Scanner input = new Scanner(System.in);
    }

    public String choiceSign() {
        Scanner input = new Scanner(System.in);
        System.out.println("Wybierasz kółko (O), krzyżyk (X) czy losowanie (L)?");
        String sign = input.nextLine();
        return sign;
    }
}
