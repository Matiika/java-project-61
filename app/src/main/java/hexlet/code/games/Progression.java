package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    private static final int STEP_MAX_RANDOM = 7;
    private static final int NUMBER_AMOUNT = 9;

    public static void startGame() {
        String commonQuestion = "What number is missing in the progression?";
        String[][] questionsAndAnswersArray = Engine.createQuestionsAndAnswersArray(Engine.getQuestionCount());
        generateQuestionsAndAnswers(questionsAndAnswersArray);
        Engine.checkAnswer(questionsAndAnswersArray, commonQuestion);
    }

    public static void generateQuestionsAndAnswers(String[][] questionsAndAnswersArray) {
        Random random = new Random();
        for (int i = 0; i < Engine.getQuestionCount(); i++) {


            int stepMinRandom = 2;
            int step = random.nextInt(STEP_MAX_RANDOM) + stepMinRandom;
            int position = random.nextInt(STEP_MAX_RANDOM) + stepMinRandom;
            int start = random.nextInt(STEP_MAX_RANDOM) + step;

            String question = String.valueOf(start);

            for (int j = 0; j < NUMBER_AMOUNT; j++) {
                if (j == position) {
                    question += " ..";
                    start += step;
                    questionsAndAnswersArray[i][Engine.answerColumn] = String.valueOf(start);
                    continue;
                }
                start += step;
                question += (" " + start);
            }
            questionsAndAnswersArray[i][Engine.questionColumn] = question;
        }
    }
}
