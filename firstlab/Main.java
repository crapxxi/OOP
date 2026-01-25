import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please write lab's problem(only one number from 1 to 6):");
        int op = s.nextInt();
        switch (op){
            case 1:
                FProblem.FirstProblem();
                break;
            case 2:
                SProblem.solution();
                break;
            case 3:
                GradeSystem.solution();
                break;
            case 4:
                equation.solution();
                break;
            case 5:
                FifthProblem.solution();
                break;
            case 6:
                TProblem.solution();
                break;
            default:
                System.out.println("Unknown problem detected!");
        }
    }
}
