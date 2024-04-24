package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

public class Engine {
    static final int GREET = 1;
    static final int EVEN = 2;
    static final int CALC = 3;
    static final int GCD = 4;
    static final int PROGRESSION = 5;
    static final int PRIME = 6;
    static final int EXIT = 0;
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

    public static void startGame(int gameChoice) {
        String[][] questionsAndAnswers = createQuestionsAndAnswersArray(QUESTION_COUNT);
        String commonQuestion = "";
        switch (gameChoice) {
            case EXIT:
                return;
            case GREET:
                Cli.askName();
                return;
            case EVEN:
                Even.generateQuestionsAndAnswers(questionsAndAnswers);
                commonQuestion = "Answer 'yes' if the number is even, otherwise answer 'no'.";
                break;
            case CALC:
                Calc.generateQuestionsAndAnswers(questionsAndAnswers);
                commonQuestion = "What is the result of the expression?";
                break;
            case GCD:
                Gcd.generateQuestionsAndAnswers(questionsAndAnswers);
                commonQuestion = "Find the greatest common divisor of given numbers.";
                break;
            case PROGRESSION:
                Progression.generateQuestionsAndAnswers(questionsAndAnswers);
                commonQuestion = "What number is missing in the progression?";
                break;
            case PRIME:
                Prime.generateQuestionsAndAnswers(questionsAndAnswers);
                commonQuestion = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
                break;
            default:
                System.out.println("No such option");
                break;
        }
        checkAnswer(questionsAndAnswers, commonQuestion);
    }
    public static void checkAnswer(String[][] questionsAndAnswers, String commonQuestion) {
        String name = Engine.askName();
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
        congratulations(name);
    }

    public static void congratulations(String name) {
        System.out.println("Congratulations, " + name + "!");
    }

    public static String askName() {

        System.out.print("May I have your name? ");
        var name = IN.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }

    public static String[][] createQuestionsAndAnswersArray(int questionCount) {
        int columnAnswer = 2;
        return new String[questionCount][columnAnswer];
    }
}
