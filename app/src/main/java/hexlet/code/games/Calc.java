package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final int MATH_SYMBOL_COUNT = 2;
    private static final int NUMBER_BOUND = 9;
    private static final String[] MATH_SYMBOL_ARRAY = {"+", "-", "*"};

    public static void startGame() {
        String[][] questionsAndAnswers = Engine.createQuestionsAndAnswersArray(Engine.getQuestionCount());
        String commonQuestion = "What is the result of the expression?";
        generateQuestionsAndAnswers(questionsAndAnswers);
        Engine.startGame(questionsAndAnswers, commonQuestion);
    }

    public static void generateQuestionsAndAnswers(String[][] questionsAndAnswersArray) {

        for (int i = 0; i < Engine.getQuestionCount(); i++) {
            var firstNumber = Utils.getRandomInt(0, NUMBER_BOUND);
            var secondNumber = Utils.getRandomInt(0, NUMBER_BOUND);

            String[] questionAndAnswer = choiceMathOperation
                    (MATH_SYMBOL_ARRAY[Utils.getRandomInt(0, MATH_SYMBOL_COUNT)], firstNumber, secondNumber);

            questionsAndAnswersArray[i][Engine.getQuestionColumn()] =
                    questionAndAnswer[Engine.getQuestionColumn()];
            questionsAndAnswersArray[i][Engine.getAnswerColumn()] =
                    questionAndAnswer[Engine.getAnswerColumn()];
        }
    }

    public static String[] choiceMathOperation(String mathSymbol, int firstNumber, int secondNumber) {
        String[] mathExpression = new String[2];
        switch (mathSymbol) {
            case "+":
                mathExpression[Engine.getQuestionColumn()] = (firstNumber + " + " + secondNumber);
                mathExpression[Engine.getAnswerColumn()] = String.valueOf(firstNumber + secondNumber);
                break;
            case "-":
                mathExpression[Engine.getQuestionColumn()] = (firstNumber + " - " + secondNumber);
                mathExpression[Engine.getAnswerColumn()] = String.valueOf(firstNumber - secondNumber);
                break;
            case "*":
                mathExpression[Engine.getQuestionColumn()] = (firstNumber + " * " + secondNumber);
                mathExpression[Engine.getAnswerColumn()] = String.valueOf(firstNumber * secondNumber);
                break;
            default:
                break;
        }
        return mathExpression;
    }

}
