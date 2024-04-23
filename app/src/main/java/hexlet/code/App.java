package hexlet.code;
import hexlet.code.games.*;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    final static int greet = 1;
    final static int even = 2;
    final static int calc = 3;
    final static int gcd = 4;
    final static int progression = 5;
    final static int prime = 6;
    final static int exit = 0;

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
            case exit:
                break;
            case greet:
                Cli.askName();
                break;
            case even:
                Even.startGame();
                break;
            case calc:
                Calc.startGame();
                break;
            case gcd:
                GCD.startGame();
                break;
            case progression:
                Progression.startGame();
                break;
            case prime:
                Prime.startGame();
                break;
            default:
                System.out.println("No such option");
                break;
        }

    }
}
