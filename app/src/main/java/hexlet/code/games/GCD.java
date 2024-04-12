package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class GCD {
    public static void startGame() {
        Scanner in = new Scanner(System.in);
        var name = Engine.askName();
        System.out.println("Find the greatest common divisor of given numbers.");

        Random random = new Random();
        int firstNumber;
        int secondNumber;
        String answer;
        int gcd = 0;

        for (int i = 0; i < 3; i++) {
            firstNumber = random.nextInt(100);
            secondNumber = random.nextInt(100);
            System.out.println("Question: " + firstNumber + " " + secondNumber);
            for (int j = 1; j < Math.min(firstNumber, secondNumber) + 1; j++) {
                if (firstNumber % j == 0 && secondNumber % j == 0) {
                    gcd = j;
                }
            }

            System.out.print("Your answer: ");
            answer = in.nextLine();

            if (!Engine.checkAnswer(String.valueOf(gcd), answer, name)) {
                break;
            }

            if (i == 2) {
                Engine.congratulations(name);
            }
        }
    }
}
