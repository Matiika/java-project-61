package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Random;
public class Even {
    private static final int RANDOM_NUMBER_BOUND = 100;
    public static void startGame() {
        String commonQuestion = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] questionsAndAnswersArray = Engine.createQuestionsAndAnswersArray(Engine.getQuestionCount());
        generateQuestionsAndAnswers(questionsAndAnswersArray);
        Engine.checkAnswer(questionsAndAnswersArray, commonQuestion);
    }

    public static void generateQuestionsAndAnswers(String[][] questionsAndAnswersArray) {
        Random random = new Random();
        for (int i = 0; i < Engine.getQuestionCount(); i++) {
            int randomNumber = random.nextInt(RANDOM_NUMBER_BOUND);
            questionsAndAnswersArray[i][Engine.questionColumn] = String.valueOf(randomNumber);

            if (randomNumber % 2 == 0) {
                questionsAndAnswersArray[i][Engine.answerColumn] = "yes";
            } else {
                questionsAndAnswersArray[i][Engine.answerColumn] = "no";
            }
        }
    }
}
