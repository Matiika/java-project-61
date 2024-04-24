package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Random;
public class Even {
    private static final int RANDOM_NUMBER_BOUND = 100;

    public static void generateQuestionsAndAnswers(String[][] questionsAndAnswersArray) {
        Random random = new Random();
        for (int i = 0; i < Engine.getQuestionCount(); i++) {
            int randomNumber = random.nextInt(RANDOM_NUMBER_BOUND);
            questionsAndAnswersArray[i][Engine.getQuestionColumn()] = String.valueOf(randomNumber);

            if (randomNumber % 2 == 0) {
                questionsAndAnswersArray[i][Engine.getAnswerColumn()] = "yes";
            } else {
                questionsAndAnswersArray[i][Engine.getAnswerColumn()] = "no";
            }
        }
    }
}
