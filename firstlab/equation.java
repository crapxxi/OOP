package firstlab;

import java.util.Scanner;

public class equation {
    public static void solution() {
        Scanner s = new Scanner(System.in);
        System.out.println("Write coefficent of x^2: ");
        double a = s.nextDouble();
        System.out.println("Write coefficent of x: ");
        double b = s.nextDouble();
        System.out.println("Write C: ");
        double c = s.nextDouble();
        double D = b*b-4*a*c;
        if(D<0){
            System.out.println("Discriminant is less than 0!");
            return;
        } else if(D ==0) {
            double x = (-1)*b/(2*a);
            System.out.println("The answer is: " + x);
            return;
        }
        double x1 = ((-1)*b + Math.sqrt(D))/(2*a);
        double x2 = ((-1)*b - Math.sqrt(D))/(2*a);
        System.out.println("The answer is: " + x1 + " and " + x2);
    }

}
