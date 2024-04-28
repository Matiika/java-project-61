package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Gcd {
    private static final int RANDOM_NUMBER_BOUND = 100;

    public static void startGame() {
        String[][] questionsAndAnswers = Engine.createQuestionsAndAnswersArray(Engine.getQuestionCount());
        String commonQuestion = "Find the greatest common divisor of given numbers.";
        generateQuestionsAndAnswers(questionsAndAnswers);
        Engine.startGame(questionsAndAnswers, commonQuestion);
    }

    public static void generateQuestionsAndAnswers(String[][] questionsAndAnswersArray) {
        Random random = new Random();
        int gcd = 0;

        for (int i = 0; i < Engine.getQuestionCount(); i++) {
            int firstNumber = random.nextInt(RANDOM_NUMBER_BOUND);
            int secondNumber = random.nextInt(RANDOM_NUMBER_BOUND);
            questionsAndAnswersArray[i][Engine.getQuestionColumn()] = firstNumber + " " + secondNumber;

            for (int j = 1; j < Math.min(firstNumber, secondNumber) + 1; j++) {
                if (firstNumber % j == 0 && secondNumber % j == 0) {
                    gcd = j;
                }
            }

            if (firstNumber == 0 || secondNumber == 0) {
                gcd = 0;
            }

            questionsAndAnswersArray[i][Engine.getAnswerColumn()] = String.valueOf(gcd);
        }
    }
}
