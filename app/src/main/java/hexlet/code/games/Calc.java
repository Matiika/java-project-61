package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    static Scanner in = new Scanner(System.in);

    public static void startGame() {
        var name = Engine.askName();
        System.out.println("What is the result of the expression?");
        Random random = new Random();

        String answer = "";
        String correctAnswer = "";
        int firstNumber;
        int secondNumber;


        for (int i = 0; i < 3; i++) {
            var mathSymbol = random.nextInt(3);
            firstNumber = random.nextInt(10);
            secondNumber = random.nextInt(10);

            switch (mathSymbol) {
                case 0:
                    System.out.println("Question: " + firstNumber + " + " + secondNumber);
                    correctAnswer = String.valueOf(firstNumber + secondNumber);
                    break;
                case 1:
                    System.out.println("Question: " + firstNumber + " - " + secondNumber);
                    correctAnswer = String.valueOf(firstNumber - secondNumber);
                    break;
                case 2:
                    System.out.println("Question: " + firstNumber + " * " + secondNumber);
                    correctAnswer = String.valueOf(firstNumber * secondNumber);
                    break;
                default:
                    break;
            }

            answer = Calc.typeAnswer();
            if (!Engine.checkAnswer(correctAnswer, answer, name)) {
                break;
            }

            if (i == 2) {
                Engine.congratulations(name);
            }
        }
    }

    public static String typeAnswer() {
        System.out.print("Your answer: ");
        var answer = in.nextLine();
        return answer;
    }
}
