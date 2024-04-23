package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
public class Calc {

    public static void startGame() {
        String commonQuestion = "What is the result of the expression?";
        String[][] questionsAndAnswersArray = Engine.createQuestionsAndAnswersArray(Engine.questionCount);
        generateQuestionsAndAnswers(questionsAndAnswersArray);
        Engine.checkAnswer(questionsAndAnswersArray, commonQuestion);
    }

    public static void generateQuestionsAndAnswers(String[][] questionsAndAnswersArray) {
        Random random = new Random();
        for (int i = 0; i < Engine.questionCount; i++) {
            var mathSymbolCount = 3;
            var mathSymbol = random.nextInt(mathSymbolCount);

            int numberBound = 10;
            var firstNumber = random.nextInt(numberBound);
            var secondNumber = random.nextInt(numberBound);

            switch (mathSymbol) {
                case 0:
                    questionsAndAnswersArray[i][Engine.questionColumn] = (firstNumber + " + " + secondNumber);
                    questionsAndAnswersArray[i][Engine.answerColumn] = String.valueOf(firstNumber + secondNumber);
                    break;
                case 1:
                    questionsAndAnswersArray[i][Engine.questionColumn] = (firstNumber + " - " + secondNumber);
                    questionsAndAnswersArray[i][Engine.answerColumn] = String.valueOf(firstNumber - secondNumber);
                    break;
                case 2:
                    questionsAndAnswersArray[i][Engine.questionColumn] = (firstNumber + " * " + secondNumber);
                    questionsAndAnswersArray[i][Engine.answerColumn] = String.valueOf(firstNumber * secondNumber);
                    break;
                default:
                    break;
            }
        }
    }

}
