package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void askName() {
        Scanner in = new Scanner(System.in);
        System.out.print("May I have your name? ");
        var name = in.nextLine();
        System.out.println("Hello, " + name + "!");
    }


}
