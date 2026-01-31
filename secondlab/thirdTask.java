package secondlab;

import java.util.Scanner;

class Time{
    private int hour;
    private int minute;
    private int second;

    Time(int hour, int minute, int second) {
        if(hour >= 24 || hour < 0) return;
        if(minute < 0 || minute > 60) return;
        if(second < 0 || second > 60) return;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public String toUniversal() {
        StringBuilder sb = new StringBuilder();
        if(hour < 10)
            sb.append(0);
        sb.append(hour);
        sb.append(":");
        if(minute < 10)
            sb.append(0);
        sb.append(minute);
        sb.append(":");
        if(second < 10)
            sb.append(0);
        sb.append(second);
        return sb.toString();
    }
    public String toStandard() {
        final int mod = 12;
        StringBuilder sb = new StringBuilder();
        if(hour%mod < 10)
            sb.append(0);
        sb.append(hour%mod);
        sb.append(":");
        if(minute < 10)
            sb.append(0);
        sb.append(minute);
        sb.append(":");
        if(second < 10)
            sb.append(0);
        sb.append(second);
        if(hour > 12)
            sb.append(" AM");
        else
            sb.append(" PM");
        return sb.toString();
    }

    public void add(Time t2) {
        if(this.second + t2.second > 60) {
            if(this.minute + 1 > 60)
                this.hour = (this.hour + 1)%24;
            this.minute = (this.minute + 1)%60;
        }
        this.second = (this.second + t2.second)%60;
        if(this.minute + t2.minute > 60)
            this.hour = (this.hour + 1)%24;
        this.minute = (this.minute + t2.minute)%60;
        this.hour = (this.hour + t2.hour)%24;
    }


}

public class thirdTask {
    public static void solution() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first time's hour: ");
        int hour = s.nextInt();
        System.out.println("Enter the first time's minute: ");
        int minute = s.nextInt();
        System.out.println("Enter the first time's second: ");
        int second = s.nextInt();


        Time t = new Time(hour,minute, second);

        System.out.println(t.toStandard());
        System.out.println(t.toUniversal());

        System.out.println("Enter the second time's hour: ");
        hour = s.nextInt();
        System.out.println("Enter the second time's minute: ");
        minute = s.nextInt();
        System.out.println("Enter the second time's second: ");
        second = s.nextInt();
        Time t2 = new Time(hour, minute, second);
        t.add(t2);
        System.out.println(t.toUniversal());
    }

}
