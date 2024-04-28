package hexlet.code;

import java.util.Scanner;
public class Engine {
    private static final int QUESTION_COUNT = 3;

    private static final Scanner IN = new Scanner(System.in);
    private static final int QUESTION_COLUMN = 0;
    private static final int ANSWER_COLUMN = 1;

    public static int getQuestionCount() {
        return QUESTION_COUNT;
    }

    public static int getQuestionColumn() {
        return QUESTION_COLUMN;
    }

    public static int getAnswerColumn() {
        return ANSWER_COLUMN;
    }

    public static void startGame(String[][] questionsAndAnswers, String commonQuestion) {
        checkAnswer(questionsAndAnswers, commonQuestion);
    }

    public static void checkAnswer(String[][] questionsAndAnswers, String commonQuestion) {
        System.out.print("May I have your name? ");
        var name = IN.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println(commonQuestion);
        for (int i = 0; i < QUESTION_COUNT; i++) {
            System.out.println("Question: " + questionsAndAnswers[i][QUESTION_COLUMN]);
            System.out.print("Your answer: ");
            String answer = IN.nextLine();
            if (!answer.equals(questionsAndAnswers[i][ANSWER_COLUMN])) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + questionsAndAnswers[i][ANSWER_COLUMN] + "'.\n"
                        + "Let's try again, " + name + "!");
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + name + "!");
    }

    public static String[][] createQuestionsAndAnswersArray(int questionCount) {
        int columnAnswer = 2;
        return new String[questionCount][columnAnswer];
    }
}
