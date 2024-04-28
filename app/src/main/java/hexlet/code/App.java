package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    static final int GREET = 1;
    static final int EVEN = 2;
    static final int CALC = 3;
    static final int GCD = 4;
    static final int PROGRESSION = 5;
    static final int PRIME = 6;
    static final int EXIT = 0;

    public static void main(String[] args) {


        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit");
        Scanner in = new Scanner(System.in);
        int playerChoice = in.nextInt();
        System.out.println("Your choice: " + playerChoice);

        switch (playerChoice) {
            case EXIT:
                return;
            case GREET:
                Cli.askName();
                return;
            case EVEN:
                Even.startGame();
                break;
            case CALC:
                Calc.startGame();
                break;
            case GCD:
                Gcd.startGame();
                break;
            case PROGRESSION:
                Progression.startGame();
                break;
            case PRIME:
                Prime.startGame();
                break;
            default:
                System.out.println("No such option");
                break;
        }

    }
}
