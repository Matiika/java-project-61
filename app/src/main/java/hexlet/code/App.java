package hexlet.code;
import hexlet.code.games.*;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
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
            case 0:
                break;
            case 1:
                Cli.askName();
                break;
            case 2:
                Even.startGame();
                break;
            case 3:
                Calc.startGame();
                break;
            case 4:
                GCD.startGame();
                break;
            case 5:
                Progression.startGame();
                break;
            case 6:
                Prime.startGame();
                break;
            default:
                System.out.println("Такого варианта выбора нет");
                break;
        }

    }
}
