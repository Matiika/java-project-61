package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    public static void startGame() {
        String commonQuestion = "What number is missing in the progression?";
        String[][] questionsAndAnswersArray = Engine.createQuestionsAndAnswersArray(Engine.questionCount);
        generateQuestionsAndAnswers(questionsAndAnswersArray);
        Engine.checkAnswer(questionsAndAnswersArray, commonQuestion);
    }

    public static void generateQuestionsAndAnswers(String[][] questionsAndAnswersArray) {
        Random random = new Random();
        for (int i = 0; i < Engine.questionCount; i++) {

            int stepMaxRandom = 7;
            int stepMinRandom = 2;
            int step = random.nextInt(stepMaxRandom) + stepMinRandom;
            int position = random.nextInt(stepMaxRandom) + stepMinRandom;
            int start = random.nextInt(stepMaxRandom) + step;
            int numberAmount = 9;
            String question = String.valueOf(start);

            for (int j = 0; j < numberAmount; j++) {
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
