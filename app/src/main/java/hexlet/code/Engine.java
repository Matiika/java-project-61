package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static boolean checkAnswer(String correctAnswer, String playerAnswer, String name) {
        if (correctAnswer.equals(playerAnswer)) {
            System.out.println("Correct!");
            return true;
        } else  {
            System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.\n" +
                    "Let's try again, " + name + "!");
            return false;
        }
    }

    public static void congratulations(String name) {
        System.out.println("Congratulations, " + name + "!");
    }

    public static String askName() {
        Scanner in = new Scanner(System.in);
        System.out.print("May I have your name? ");
        var name = in.nextLine();
        System.out.println("Hello, " + name);
        return name;
    }
}
