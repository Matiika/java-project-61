package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Prime {
    public static void startGame() {
        Scanner in = new Scanner(System.in);
        var name = Engine.askName();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        Random random = new Random();
        int randomNumber;
        String answer;


        for (int i = 0; i < 3; i++) {
            randomNumber = random.nextInt(99) + 2;
            System.out.println("Question: " + randomNumber);

            System.out.print("Your answer: ");
            answer = in.nextLine();
            String correctAnswer = "yes";

            for (int j = 2; j < randomNumber; j++) {
                if (randomNumber % j == 0) {
                    correctAnswer = "no";
                    break;
                }
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
