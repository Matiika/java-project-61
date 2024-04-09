package hexlet.code;
import java.sql.SQLOutput;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("Please enter the game number and press Enter.\n" +
                "1 - Greet\n" +
                "2 - Even\n"+
                "0 - Exit");
        Scanner in = new Scanner(System.in);
        int playerChoice = in.nextInt();
        System.out.println("Your choice: "+playerChoice);

        switch(playerChoice) {
            case 0:
                break;
            case 1:
                Cli.askName();
                break;
            case 2:
                Even.startGame();
                break;
            default:
                break;
        }

    }
}
