package firstlab;

import java.util.Scanner;

public class GradeSystem {
    public static void solution() {
        Scanner s = new Scanner(System.in);
        System.out.println("Write a score: ");
        int score = s.nextInt();
        if(score > 100 || score < 0) {
            System.out.println("Wrong number, please retry!");
            return;
        }
        if(score >= 95){
            System.out.println("GPA is 4.0, Grade: A");
        } else if(score >= 90) {
            System.out.println("GPA is 3.67, Grade: A-");
        }else if(score >= 85) {
            System.out.println("GPA is 3.33, Grade: B+");
        }else if(score >= 80) {
            System.out.println("GPA is 3.0, Grade: B");
        }else if(score >= 75) {
            System.out.println("GPA is 2.67, Grade: B-");
        }else if(score >= 70) {
            System.out.println("GPA is 2.33, Grade: C+");
        }else if(score >= 65) {
            System.out.println("GPA is 2.0, Grade: C");
        }else if(score >= 60) {
            System.out.println("GPA is 1.67, Grade: C-");
        }else if(score >= 55) {
            System.out.println("GPA is 1.33, Grade: D+");
        }else if(score >= 50) {
            System.out.println("GPA is 1.0, Grade: D");
        } else{
            System.out.println("GPA is 0, Grade: F");
        }
    }

}
