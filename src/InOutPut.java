import java.util.Scanner;
import java.util.Random;
public class InOutPut {
    public static final String RESET = "\033[0m";
    public static final String BLACK = "\033[1;30";
    public static final String RED = "\033[1;31m";
    public static final String GREEN = "\033[1;32m";
    public static final String YELLOW = "\033[1;33m";
    public static final String BLUE = "\033[1;34m";
    public static final String PURPLE = "\033[1;35m";
    public static final String CYAN = "\033[1;36m";
    public static final String WHITE = "\033[1;37m";
    public void InOutPut() {

    }

    public String choiceSign() {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String sign = " ";
        while(!sign.equals("O") && !sign.equals("X") && !sign.equals("L")) {
            System.out.println(YELLOW + "Wybierasz kółko (O), krzyżyk (X) czy losowanie (L)?" + RESET);
            sign = input.nextLine().toUpperCase();
        }
        if(sign.equals("L")) {
            sign = "X";
            int rnd = random.nextInt(2);
            if(rnd == 0) {
                sign = "O";
            }
        }
        System.out.println(YELLOW + "Twój znak to " + sign + RESET);
        return sign;
    }
    public static String whatsYourName(String color) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String name;
        System.out.println(color + "Podaj swoje imię!" + RESET);
        name = input.nextLine();
        System.out.println(color + "Witaj, " + name + "!" + RESET);
        return name;
    }
    public String choiceOpponent() {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String enemy = " ";
        while(!enemy.equals("K") && !enemy.equals("C")) {
            System.out.println(YELLOW + "Grasz ze mną (K) czy z człowiekiem (C)?" + RESET);
            enemy = input.nextLine().toUpperCase();
        }
        return enemy;
    }
}
