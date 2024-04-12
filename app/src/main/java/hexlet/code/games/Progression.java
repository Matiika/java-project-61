package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static void startGame() {
        Scanner in = new Scanner(System.in);
        var name = Engine.askName();
        String correctAnswer = "";
        String answer = "";
        System.out.println("What number is missing in the progression?");
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            int step = random.nextInt(5) + 1;
            int position = random.nextInt(7) + 2;
            int start = random.nextInt(10) + 1 + step;
            System.out.print("Question: " + (start));

            for (int j = 0; j < 9; j++) {
                if (j == position) {
                    System.out.printf(" ..");
                    start += step;
                    correctAnswer = String.valueOf(start);
                    continue;
                }
                start += step;
                System.out.printf(" " + start);
            }

            System.out.print("\nYour answer: ");
            answer = in.nextLine();

            if (!Engine.checkAnswer(correctAnswer, answer, name)) {
                break;
            }

            if (i == 2) {
                Engine.congratulations(name);
            }
        }
    }
}
