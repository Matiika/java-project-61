package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
public class Prime {
    private static final int RANDOM_NUMBER_BOUND_MAX = 99;

    public static void startGame() {
        String commonQuestion = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] questionsAndAnswersArray = Engine.createQuestionsAndAnswersArray(Engine.getQuestionCount());
        generateQuestionsAndAnswers(questionsAndAnswersArray);
        Engine.checkAnswer(questionsAndAnswersArray, commonQuestion);
    }

    public static void generateQuestionsAndAnswers(String[][] questionsAndAnswersArray) {
        Random random = new Random();

        int randomNumberBoundMin = 2;

        for (int i = 0; i < Engine.getQuestionCount(); i++) {
            int randomNumber = random.nextInt(RANDOM_NUMBER_BOUND_MAX) + randomNumberBoundMin;
            questionsAndAnswersArray[i][Engine.questionColumn] = String.valueOf(randomNumber);
            questionsAndAnswersArray[i][Engine.answerColumn] = "yes";

            for (int j = 2; j < randomNumber; j++) {
                if (randomNumber % j == 0) {
                    questionsAndAnswersArray[i][Engine.answerColumn] = "no";
                    break;
                }
            }
        }
    }

}
