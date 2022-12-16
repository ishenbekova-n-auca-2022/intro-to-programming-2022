import java.util.Scanner;

public class Problem33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        int count = 0;

        for (int i = 0; i < t; i++){
            int year = scanner.nextInt();
            int month = scanner.nextInt();
            int day = scanner.nextInt();
            System.out.println(getNumberOfDays(year, month, day));
        }

    }

    static boolean isLeap(int year){
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }
    static int getNumberOfDays(int year, int month, int day) {
        int count = 0;
        switch (month) {
            case 2:
                count = isLeap(year) ? 29 : 28;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                count = 31;
            case 4:
            case 6:
            case 9:
            case 11:
                count = 30;
            default:
                count = 0;
        }

        for (int i = 0; i < month; i++){
            count += count + day;
        }
        return count;
    }
}
