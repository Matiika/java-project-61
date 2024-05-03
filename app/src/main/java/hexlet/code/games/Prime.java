package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;
public class Prime {
    private static final int RANDOM_NUMBER_BOUND_MAX = 99;

    public static void startGame() {
        String[][] questionsAndAnswers = Engine.createQuestionsAndAnswersArray(Engine.getQuestionCount());
        String commonQuestion = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        generateQuestionsAndAnswers(questionsAndAnswers);
        Engine.startGame(questionsAndAnswers, commonQuestion);
    }

    public static void generateQuestionsAndAnswers(String[][] questionsAndAnswersArray) {

        int randomNumberBoundMin = 2;

        for (int i = 0; i < Engine.getQuestionCount(); i++) {
            int randomNumber = Utils.getRandomInt(randomNumberBoundMin, RANDOM_NUMBER_BOUND_MAX);
            questionsAndAnswersArray[i][Engine.getQuestionColumn()] = String.valueOf(randomNumber);
            questionsAndAnswersArray[i][Engine.getAnswerColumn()] = isPrime(randomNumber) ? "yes" : "no";
        }
    }

    public static boolean isPrime(int randomNumber) {
        for (int j = 2; j < randomNumber; j++) {
            if (randomNumber % j == 0) {
                return false;
            }
        }
        return true;
    }
}