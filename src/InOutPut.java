import java.util.Scanner;
import java.util.Random;
public class InOutPut {

    public void InOutPut() {
        Scanner input = new Scanner(System.in);
    }

    public String choiceSign() {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String sign = " ";
        while(!sign.equals("O") && !sign.equals("X") && !sign.equals("L")) {
            System.out.println("Wybierasz kółko (O), krzyżyk (X) czy losowanie (L)?");
            sign = input.nextLine().toUpperCase();
        }
        if(sign.equals("L")) {
            sign = "X";
            int rnd = random.nextInt(2);
            if(rnd == 0) {
                sign = "O";
            }
        }
        System.out.println("\033[1;33mTwój znak to " + sign + "\u001B[0m");
        return sign;
    }
    public String whatsYourName() {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String name;
        System.out.println("Podaj swoje imię.");
        name = input.nextLine();
        System.out.println("\033[1;33mWitaj, " + name + "!\u001B[0m");
        return name;
    }
}
