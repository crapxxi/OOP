package secondlab;

import java.util.Date;
import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Choose which task to solve!");
        int ch = s.nextInt();
        switch (ch) {
            case 1:
                firsttask.solution();
                break;
            case 2:
                secondtask.solution();
                break;
            case 3:
                thirdTask.solution();
                break;
            default:
                System.out.println("Incorrect number of the task!");
                break;
        }
    }
}
