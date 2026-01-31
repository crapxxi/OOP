package secondlab;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

class Student {
    private static int gid = 1;
    private String name;
    private int id;
    private int year;
    Student(String name, int year) {
        if(year > 7 || year < 0) return;
        this.name = name;
        this.id= gid++;
        this.year = year;
    }

    public String getName() {return name;}
    public int getId() { return id;}
    public int getYear() {return year;}

}
public class firsttask {
    public static void solution() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please, enter the number of students!");
        int n = s.nextInt();
        for(int i= 0; i<n; i++) {
            System.out.println("Enter the name: ");
            String name = s.next();
            System.out.println("Enter the year of study: ");
            int year = s.nextInt();
            Student student = new Student(name, year);
            System.out.println(student.getId() + " | " + student.getName() + " year of study## " + student.getYear());
        }
    }

}
