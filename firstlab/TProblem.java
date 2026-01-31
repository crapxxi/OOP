package firstlab;

import java.util.Scanner;

public class TProblem {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder s1 = new StringBuilder();
        for (int i = s.length()-1; i >= 0; i--) s1.append(s.charAt(i));
        return s.equals(s1.toString());
    }
    public static boolean optimized(String s) {

        if(s.length()%2==0) {
            int a = s.length()/2-1;
            int b = s.length()/2;
            while(a >= 0 && b < s.length()) {
                if(s.charAt(a) != s.charAt(b))
                    return false;
                a--;b++;
            }
            return true;
        }
        int a = s.length()/2;
        int b = s.length()/2;
        while(a >= 0 && b < s.length()) {
            if(s.charAt(a) != s.charAt(b))
                return false;
            a--;b++;
        }
        return true;
    }

    public static void solution() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write your text: ");
        String s = sc.nextLine();
        System.out.println(optimized(s));
    }
}
