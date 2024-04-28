package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
public class Calc {
    private static final int MATH_SYMBOL_COUNT = 3;
    private static final int NUMBER_BOUND = 10;
    private static Random RANDOM = new Random();
    public static void startGame() {
        String[][] questionsAndAnswers = Engine.createQuestionsAndAnswersArray(Engine.getQuestionCount());
        String commonQuestion = "What is the result of the expression?";
        generateQuestionsAndAnswers(questionsAndAnswers);
        Engine.startGame(questionsAndAnswers, commonQuestion);
    }

    public static void generateQuestionsAndAnswers(String[][] questionsAndAnswersArray) {

        for (int i = 0; i < Engine.getQuestionCount(); i++) {
            var firstNumber = RANDOM.nextInt(NUMBER_BOUND);
            var secondNumber = RANDOM.nextInt(NUMBER_BOUND);
            String[] questionAndAnswer = choiceMathOperation(firstNumber, secondNumber);

            questionsAndAnswersArray[i][Engine.getQuestionColumn()] =
                    questionAndAnswer[Engine.getQuestionColumn()];
            questionsAndAnswersArray[i][Engine.getAnswerColumn()] =
                    questionAndAnswer[Engine.getAnswerColumn()];
        }
    }

    public static String[] choiceMathOperation(int firstNumber, int secondNumber) {
        int mathSymbol = RANDOM.nextInt(MATH_SYMBOL_COUNT);
        String[] mathExpression = new String[2];
        switch (mathSymbol) {
            case 0:
                mathExpression[Engine.getQuestionColumn()] = (firstNumber + " + " + secondNumber);
                mathExpression[Engine.getAnswerColumn()] = String.valueOf(firstNumber + secondNumber);
                break;
            case 1:
                mathExpression[Engine.getQuestionColumn()] = (firstNumber + " - " + secondNumber);
                mathExpression[Engine.getAnswerColumn()] = String.valueOf(firstNumber - secondNumber);
                break;
            case 2:
                mathExpression[Engine.getQuestionColumn()] = (firstNumber + " * " + secondNumber);
                mathExpression[Engine.getAnswerColumn()] = String.valueOf(firstNumber * secondNumber);
                break;
            default:
                break;
        }
        return mathExpression;
    }

}
