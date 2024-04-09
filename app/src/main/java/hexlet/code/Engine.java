package hexlet.code;

public class Engine {
    public static boolean checkAnswer(String correctAnswer, String playerAnswer, String name) {
        if (correctAnswer.equals(playerAnswer)) {
            System.out.println("Correct!");
            return true;
        } else  {
            System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.\n" +
                    "Let's try again, " + name + "!");
            return false;
        }
    }

    public static void congratulations(String name) {
        System.out.println("Congratulations, " + name + "!");
    }
}
