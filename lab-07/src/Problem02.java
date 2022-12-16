import java.util.Scanner;

public class Problem02 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        while (true){
            int year = readInt("Year: ", "incorrect message", 1, 10000);
            int month = readInt("Month: ", "incorrect month", 1, 12);

            System.out.println("Number of days: " + getNumberOfDays(year, month));
        }
    }

    static int getNumberOfDays(int year, int month){
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int result = days[month - 1];

        if (month == 2 && isLeap(year)){
            result++;
        }

        return result;
    }

    static int readInt(String prompt, String errorMessage, int minValue, int maxValue) {
        System.out.print(prompt);
        if (!scanner.hasNextInt()){
            System.exit(0);
        }
        int res = scanner.nextInt();
        if (res < minValue || maxValue < res) {
            System.out.print(errorMessage);
            System.exit(1);
        }
        return res;
    }

    static boolean isLeap(int year) {
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }
}
