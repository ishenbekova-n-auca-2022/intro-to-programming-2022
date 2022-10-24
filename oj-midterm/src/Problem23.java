import java.util.Scanner;

public class Problem23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hour = input.nextInt();
        int minute = input.nextInt();

        int alarmHour = hour;
        int alarmMinute = minute;

        if (minute < 45) {
            if (hour == 0) {
                alarmHour = 24 - 1;
            } else {
                alarmHour = alarmHour - 1;
            }
            alarmMinute = alarmMinute - 45 + 60;
        } else if (hour == 0) {
            alarmHour = 24 - 1;
            alarmMinute = alarmMinute - 45 + 60;
        } else {
            alarmMinute = alarmMinute - 45;
        }
        System.out.println(alarmHour + " " + alarmMinute);
    }
}