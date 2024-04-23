package hexlet.code;

import java.util.Scanner;

public class Engine {

    static final private int QUESTION_COUNT = 3;
    public static int getQuestionCount() {
        return QUESTION_COUNT;
    }

    static Scanner in = new Scanner(System.in);
    public static int questionColumn = 0;
    public static int answerColumn = 1;
    public static void checkAnswer(String[][] questionsAndAnswers, String commonQuestion) {
        String name = Engine.askName();
        System.out.println(commonQuestion);
        for (int i = 0; i < QUESTION_COUNT; i++) {
            System.out.println("Question: " + questionsAndAnswers[i][questionColumn]);
            System.out.print("Your answer: ");
            String answer = in.nextLine();
            if (!answer.equals(questionsAndAnswers[i][answerColumn])) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + questionsAndAnswers[i][answerColumn] + "'.\n"
                        + "Let's try again, " + name + "!");
                return;
            }
            System.out.println("Correct!");
        }
        congratulations(name);
    }

    public static void congratulations(String name) {
        System.out.println("Congratulations, " + name + "!");
    }

    public static String askName() {

        System.out.print("May I have your name? ");
        var name = in.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }

    public static String[][] createQuestionsAndAnswersArray(int questionCount) {
        int columnAnswer = 2;
        return new String[questionCount][columnAnswer];
    }
}
