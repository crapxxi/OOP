package secondlab;

import java.util.Scanner;

class StarTriangle{
    private int width;
    StarTriangle(int width) {
        this.width = width;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i= 1; i<=width; i++) {
            sb.append("[*]".repeat(i));
            sb.append("\n");
        }
        return sb.toString();
    }
}

public class secondtask {
    public static void solution() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please, enter the width of triangle: ");
        int width = s.nextInt();
        StarTriangle small = new StarTriangle(width);
        System.out.println(small.toString());
    }

}
