package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Random;
public class Even {
    private static final int RANDOM_NUMBER_BOUND = 100;

    public static void startGame() {
        String[][] questionsAndAnswers = Engine.createQuestionsAndAnswersArray(Engine.getQuestionCount());
        String commonQuestion = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        generateQuestionsAndAnswers(questionsAndAnswers);
        Engine.startGame(questionsAndAnswers, commonQuestion);
    }

    public static void generateQuestionsAndAnswers(String[][] questionsAndAnswersArray) {
        Random random = new Random();
        for (int i = 0; i < Engine.getQuestionCount(); i++) {
            int randomNumber = random.nextInt(RANDOM_NUMBER_BOUND);
            questionsAndAnswersArray[i][Engine.getQuestionColumn()] = String.valueOf(randomNumber);
            questionsAndAnswersArray[i][Engine.getAnswerColumn()] = answer(randomNumber);
        }
    }

    public static String answer(int randomNumber) {
        if (randomNumber % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }
}
