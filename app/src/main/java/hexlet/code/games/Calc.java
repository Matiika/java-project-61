package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
public class Calc {
    private static final int MATH_SYMBOL_COUNT = 3;
    private static final int NUMBER_BOUND = 10;

    public static void generateQuestionsAndAnswers(String[][] questionsAndAnswersArray) {
        Random random = new Random();
        for (int i = 0; i < Engine.getQuestionCount(); i++) {
            var mathSymbol = random.nextInt(MATH_SYMBOL_COUNT);


            var firstNumber = random.nextInt(NUMBER_BOUND);
            var secondNumber = random.nextInt(NUMBER_BOUND);

            switch (mathSymbol) {
                case 0:
                    questionsAndAnswersArray[i][Engine.getQuestionColumn()] = (firstNumber + " + " + secondNumber);
                    questionsAndAnswersArray[i][Engine.getAnswerColumn()] = String.valueOf(firstNumber + secondNumber);
                    break;
                case 1:
                    questionsAndAnswersArray[i][Engine.getQuestionColumn()] = (firstNumber + " - " + secondNumber);
                    questionsAndAnswersArray[i][Engine.getAnswerColumn()] = String.valueOf(firstNumber - secondNumber);
                    break;
                case 2:
                    questionsAndAnswersArray[i][Engine.getQuestionColumn()] = (firstNumber + " * " + secondNumber);
                    questionsAndAnswersArray[i][Engine.getAnswerColumn()] = String.valueOf(firstNumber * secondNumber);
                    break;
                default:
                    break;
            }
        }
    }

}
