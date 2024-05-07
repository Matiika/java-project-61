package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;
public class Even {
    private static final int RANDOM_NUMBER_BOUND = 100;

    public static void startGame() {
        String[][] questionsAndAnswers = new String[Engine.getQuestionCount()][2];
        String commonQuestion = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        generateQuestionsAndAnswers(questionsAndAnswers);
        Engine.startGame(questionsAndAnswers, commonQuestion);
    }

    public static void generateQuestionsAndAnswers(String[][] questionsAndAnswersArray) {
        for (int i = 0; i < Engine.getQuestionCount(); i++) {
            int randomNumber = Utils.getRandomInt(0, RANDOM_NUMBER_BOUND);
            questionsAndAnswersArray[i][Engine.getQuestionColumn()] = String.valueOf(randomNumber);
            questionsAndAnswersArray[i][Engine.getAnswerColumn()] = isEven(randomNumber) ? "yes" : "no";
        }
    }

    public static boolean isEven(int randomNumber) {
        return randomNumber % 2 == 0;
    }
}
