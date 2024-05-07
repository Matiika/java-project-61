package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final int NUMBER_BOUND = 9;
    private static final char[] MATH_SYMBOL_ARRAY = {'+', '-', '*'};

    public static void startGame() {
        String[][] questionsAndAnswers = new String[Engine.getQuestionCount()][2];
        String commonQuestion = "What is the result of the expression?";
        generateQuestionsAndAnswers(questionsAndAnswers);
        Engine.startGame(questionsAndAnswers, commonQuestion);
    }

    public static void generateQuestionsAndAnswers(String[][] questionsAndAnswersArray) {

        for (int i = 0; i < Engine.getQuestionCount(); i++) {
            var firstNumber = Utils.getRandomInt(0, NUMBER_BOUND);
            var secondNumber = Utils.getRandomInt(0, NUMBER_BOUND);
            char randomMathSymbol =
                    MATH_SYMBOL_ARRAY[Utils.getRandomInt(0, MATH_SYMBOL_ARRAY.length - 1)];

            questionsAndAnswersArray[i][Engine.getQuestionColumn()] =
                    firstNumber + " " +
                            randomMathSymbol +
                            " " + secondNumber;
            questionsAndAnswersArray[i][Engine.getAnswerColumn()] =
                    String.valueOf(choiceMathOperation(randomMathSymbol, firstNumber, secondNumber));
        }
    }

    public static int choiceMathOperation(char mathSymbol, int firstNumber, int secondNumber) {
        return switch (mathSymbol) {
            case '+' -> firstNumber + secondNumber;
            case '-' -> firstNumber - secondNumber;
            case '*' -> firstNumber * secondNumber;
            default -> 0;
        };
    }

}
