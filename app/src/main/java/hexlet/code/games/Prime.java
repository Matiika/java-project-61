package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
public class Prime {
    private static final int RANDOM_NUMBER_BOUND_MAX = 99;

    public static void startGame() {
        String[][] questionsAndAnswers = new String[Engine.getQuestionCount()][2];
        String commonQuestion = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        generateQuestionsAndAnswers(questionsAndAnswers);
        Engine.startGame(questionsAndAnswers, commonQuestion);
    }

    public static void generateQuestionsAndAnswers(String[][] questionsAndAnswersArray) {

        for (int i = 0; i < Engine.getQuestionCount(); i++) {
            int randomNumber = Utils.getRandomInt(0, RANDOM_NUMBER_BOUND_MAX);
            questionsAndAnswersArray[i][Engine.getQuestionColumn()] = String.valueOf(randomNumber);
            questionsAndAnswersArray[i][Engine.getAnswerColumn()] = isPrime(randomNumber) ? "yes" : "no";
        }
    }

    public static boolean isPrime(int randomNumber) {
        if (randomNumber < 2) {
            return false;
        }

        for (int j = 2; j < randomNumber; j++) {
            if (randomNumber % j == 0) {
                return false;
            }
        }
        return true;
    }
}
