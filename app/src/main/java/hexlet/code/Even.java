package hexlet.code;
import java.util.Scanner;
import java.util.Random;
public class Even {
    public static void startGame() {
        Scanner in = new Scanner(System.in);
        System.out.print("May I have your name?");
        var name = in.nextLine();
        System.out.println("Hello, " + name + "\n" + "Answer 'yes' if the number is even, otherwise answer 'no'.");

        Random random = new Random();
        int randomNumber = random.nextInt(100);
        String answer;
        int i = 0;
        for (i = 0; i < 3; i++) {
            randomNumber = random.nextInt(100);
            System.out.println("Question: " + randomNumber);
            answer = in.nextLine();
            System.out.println("Your answer: " + answer);
            String correctAnswer;

            if (randomNumber % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }

            if (correctAnswer.equals(answer)) {
                System.out.println("Correct!");
            }

            if (!correctAnswer.equals(answer) && correctAnswer.equals("yes")) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'yes'.\n" +
                        "Let's try again, " + name + "!");
                break;
            }

            if (!correctAnswer.equals(answer) && correctAnswer.equals("no")) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'no'.\n" +
                        "Let's try again, " + name + "!");
                break;
            }


            if (i == 2) {
                System.out.print("Congratulations, " + name + "!");
            }
        }
    }
}
