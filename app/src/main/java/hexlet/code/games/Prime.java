package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
public class Prime {
    public static void startGame() {
        String commonQuestion = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] questionsAndAnswersArray = Engine.createQuestionsAndAnswersArray(Engine.questionCount);
        generateQuestionsAndAnswers(questionsAndAnswersArray);
        Engine.checkAnswer(questionsAndAnswersArray, commonQuestion);
    }

    public static void generateQuestionsAndAnswers(String[][] questionsAndAnswersArray) {
        Random random = new Random();
        int randomNumberBoundMax = 99;
        int randomNumberBoundMin = 2;

        for (int i = 0; i < Engine.questionCount; i++) {
            int randomNumber = random.nextInt(randomNumberBoundMax) + randomNumberBoundMin;
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
