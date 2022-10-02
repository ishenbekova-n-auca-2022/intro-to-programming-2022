import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();

        int minutesPerYear = 365 * 24 * 60;
        int minutesPerDay = 60 * 24;
        int year = minutes / minutesPerYear;
        int day = (minutes % minutesPerYear)/(minutesPerDay);

        System.out.println(minutes + " minutes is approximately " + year + " years and " + day + " days");
    }
}
