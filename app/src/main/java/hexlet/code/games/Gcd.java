package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Gcd {
    private static final int RANDOM_NUMBER_BOUND = 100;

    public static void startGame() {
        String commonQuestion = "Find the greatest common divisor of given numbers.";
        String[][] questionsAndAnswersArray = Engine.createQuestionsAndAnswersArray(Engine.getQuestionCount());
        generateQuestionsAndAnswers(questionsAndAnswersArray);
        Engine.checkAnswer(questionsAndAnswersArray, commonQuestion);

    }

    public static void generateQuestionsAndAnswers(String[][] questionsAndAnswersArray) {
        Random random = new Random();
        int gcd = 0;

        for (int i = 0; i < Engine.getQuestionCount(); i++) {
            int firstNumber = random.nextInt(RANDOM_NUMBER_BOUND);
            int secondNumber = random.nextInt(RANDOM_NUMBER_BOUND);
            questionsAndAnswersArray[i][Engine.questionColumn] = firstNumber + " " + secondNumber;

            for (int j = 1; j < Math.min(firstNumber, secondNumber) + 1; j++) {
                if (firstNumber % j == 0 && secondNumber % j == 0) {
                    gcd = j;
                }
            }

            questionsAndAnswersArray[i][Engine.answerColumn] = String.valueOf(gcd);
        }
    }
}
