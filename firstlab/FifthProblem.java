import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class FifthProblem {
    public static void solution() {
        Scanner s = new Scanner(System.in);
        System.out.println("Write initial balance: ");
        double initbalance = s.nextDouble();
        if(initbalance<0) {
            System.out.println("Balance is less than 0!");
            return;
        }
        System.out.println("Write interest rate: ");
        double intrate = s.nextDouble();
        if(intrate < 0) {
            System.out.println("Interest Rate is less than 0!");
            return;
        }
        double intsum = initbalance/100 * intrate;
        double newbalance = initbalance+intsum;
        System.out.println("Init balance: " + initbalance + "\nInterest Rate: " + intrate + "%\nNewBalance: " + newbalance+ "\nDate: " + LocalDateTime.now());
    }
}
