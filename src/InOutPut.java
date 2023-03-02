import java.util.Scanner;
import java.util.Random;
public class InOutPut {
    public static final String RESET = "\033[0m";
    public static final String RED = "\033[1;31m";
    public static final String GREEN = "\033[1;32m";
    public static final String YELLOW = "\033[1;33m";
    public static final String CYAN = "\033[1;36m";

    public String choiceSign() {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String sign = " ";
        while(!sign.equals("〇") && !sign.equals("⛌") && !sign.equals("L")) {
            System.out.println(YELLOW + "Wybierasz kółko (O), krzyżyk (X) czy losowanie (L)?" + RESET);
            sign = input.nextLine().toUpperCase();
            if(sign.equals("O")) {
                sign = "〇";
            }
            if(sign.equals("X")) {
                sign = "⛌";
            }
        }
        if(sign.equals("L")) {
            sign = "⛌";
            int rnd = random.nextInt(2);
            if(rnd == 0) {
                sign = "〇";
            }
        }
        System.out.println(YELLOW + "Twój znak to " + sign + "."+ RESET);
        return sign;
    }
    public static String whatsYourName(String color) {
        Scanner input = new Scanner(System.in);
        String name;
        System.out.println(color + "Podaj swoje imię!" + RESET);
        name = input.nextLine();
        System.out.println(color + "Witaj, " + name + "!" + RESET);
        return name;
    }
    public String choiceOpponent() {
        Scanner input = new Scanner(System.in);
        String enemy = " ";
        while(!enemy.equals("K") && !enemy.equals("C")) {
            System.out.println(YELLOW + "Grasz ze mną (K) czy z człowiekiem (C)?" + RESET);
            enemy = input.nextLine().toUpperCase();
        }
        return enemy;
    }
    public static int choiceColumn() {
        Scanner input = new Scanner(System.in);
        int column;
        System.out.print("Wybierz kolumnę (od 1 do 3): ");
        column = input.nextInt();
        return column;
    }
    public static int choiceRow() {
        Scanner input = new Scanner(System.in);
        int row;
        System.out.print("Wybierz wiersz (od 1 do 3): ");
        row = input.nextInt();
        return row;
    }
    public static void playAgain() {
        Scanner input = new Scanner(System.in);
        String wannaPlay;
        System.out.print(YELLOW + "Chcesz zagrać ponownie? Wpisz T (tak) lub cokolwiek innego, żeby zakończyć. " + RESET);
        wannaPlay = input.nextLine().toUpperCase();
        if(wannaPlay.equals("T")) {
            Game game = new Game();
            game.start();
        } else {
            System.out.println(GREEN + "\nDziękuję za grę i do następnego razu!");
        }
    }
}
