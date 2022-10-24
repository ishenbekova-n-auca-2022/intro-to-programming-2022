import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter today's day: ");
        int today = input.nextInt();

        String dayNameToday = "";

        if (today == 0) {
            dayNameToday = "Sunday";
        } else if (today == 1) {
            dayNameToday = "Monday";
        } else if (today == 2) {
            dayNameToday = "Tuesday";
        } else if (today == 3) {
            dayNameToday = "Wednesday";
        } else if (today == 4) {
            dayNameToday = "Thursday";
        } else if (today == 5) {
            dayNameToday = "Friday";
        } else if (today == 6) {
            dayNameToday = "Saturday";
        }

        System.out.print("Enter the number of days elapsed since today: ");
        int dayElapsed = input.nextInt();

        int futureDay = (today + dayElapsed) % 7;
        String dayNameInFuture = "";

        if (futureDay == 0) {
            dayNameInFuture = "Sunday";
        } else if (futureDay == 1) {
            dayNameInFuture = "Monday";
        } else if (futureDay == 2) {
            dayNameInFuture = "Tuesday";
        } else if (futureDay == 3) {
            dayNameInFuture = "Wednesday";
        } else if (futureDay == 4) {
            dayNameInFuture = "Thursday";
        } else if (futureDay == 5) {
            dayNameInFuture = "Friday";
        } else if (futureDay == 6) {
            dayNameInFuture = "Saturday";
        }

        System.out.printf("Today is %s and the future day is %s%n", dayNameToday, dayNameInFuture);
    }
}
