package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    final static int GREET = 1;
    final static int EVEN = 2;
    final static int CALC = 3;
    final static int GCD = 4;
    final static int PROGRESSION = 5;
    final static int PRIME = 6;
    final static int EXIT = 0;

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
                break;
            case GREET:
                Cli.askName();
                break;
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
