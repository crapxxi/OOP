package firstlab;

import java.util.Scanner;

public class FProblem {
    public static void FirstProblem() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the text:");
        String givenText = s.next();
        System.out.println("+" + "-".repeat(givenText.length()) + "+" + "\n|" +givenText + "|\n" +"+" + "-".repeat(givenText.length()) + "+");
    }

}
