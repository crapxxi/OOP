package firstlab;

import java.util.Scanner;

public class SProblem {
    public static double areaCalculation(int a){
        return a*a;
    }
    public static double perimeterCalculation(int a){
        return 4*a;
    }
    public static double lengthdiagonalCalculation(int a){
        return a*Math.sqrt(2);
    }
    public static void solution() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        int side = input.nextInt();
        if(side < 0) {
            System.out.println("side is less than 0!");
            return;
        }
        System.out.println("Area of " + side + " is " + areaCalculation(side));
        System.out.println("Perimeter of " + side + " is " + perimeterCalculation(side));
        System.out.print("Length diagonal is " + lengthdiagonalCalculation(side));
    }
}
