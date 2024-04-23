package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Random;
public class Even {
    public static void startGame() {
        String commonQuestion = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] questionsAndAnswersArray = Engine.createQuestionsAndAnswersArray(Engine.questionCount);
        generateQuestionsAndAnswers(questionsAndAnswersArray);
        Engine.checkAnswer(questionsAndAnswersArray, commonQuestion);
    }

    public static void generateQuestionsAndAnswers(String[][] questionsAndAnswersArray) {
        Random random = new Random();
        int randomNumberBound = 100;
        for (int i = 0; i < Engine.questionCount; i++) {
            int randomNumber = random.nextInt(randomNumberBound);
            questionsAndAnswersArray[i][Engine.questionColumn] = String.valueOf(randomNumber);

            if (randomNumber % 2 == 0) {
                questionsAndAnswersArray[i][Engine.answerColumn] = "yes";
            } else {
                questionsAndAnswersArray[i][Engine.answerColumn] = "no";
            }
        }
    }
}
