package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final int STEP_MAX_RANDOM = 10;
    private static final int PROGRESSION_LENGTH = 9;

    public static void startGame() {
        String[][] questionsAndAnswers = new String[Engine.getQuestionCount()][2];
        String commonQuestion = "What number is missing in the progression?";
        generateQuestionsAndAnswers(questionsAndAnswers);
        Engine.startGame(questionsAndAnswers, commonQuestion);
    }

    public static void generateQuestionsAndAnswers(String[][] questionsAndAnswersArray) {

        for (int i = 0; i < Engine.getQuestionCount(); i++) {
            int firstElement = Utils.getRandomInt(2, STEP_MAX_RANDOM);
            int step = Utils.getRandomInt(2, STEP_MAX_RANDOM);
            String[] progression = getProgression(firstElement, step, PROGRESSION_LENGTH);
            int numberPosition = Utils.getRandomInt(2, PROGRESSION_LENGTH - 1);

            questionsAndAnswersArray[i][Engine.getAnswerColumn()] = progression[numberPosition];
            progression[numberPosition] = "..";
            questionsAndAnswersArray[i][Engine.getQuestionColumn()] = String.join(" ", progression);
        }
    }

    public static String[] getProgression(int firstElement, int step, int length) {
        String[] progression = new String[length];
        for (int i = 0; i < progression.length; i++) {
            progression[i] = String.valueOf(firstElement);
            firstElement += step;
        }
        return progression;
    }
}
