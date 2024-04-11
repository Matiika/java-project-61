package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Scanner;
import java.util.Random;
public class Even {
    public static void startGame() {
        Scanner in = new Scanner(System.in);
        var name = Engine.askName();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        Random random = new Random();
        int randomNumber;
        String answer;
        String correctAnswer;

        for (int i = 0; i < 3; i++) {
            randomNumber = random.nextInt(100);
            System.out.println("Question: " + randomNumber);
            answer = in.nextLine();
            System.out.println("Your answer: " + answer);

            if (randomNumber % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }

            if (!Engine.checkAnswer(correctAnswer, answer, name)) {
                break;
            }

            if (i == 2) {
                Engine.congratulations(name);
            }
        }
    }
}
