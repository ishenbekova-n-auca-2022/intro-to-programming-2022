import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            int year = scanner.nextInt();
            int month = scanner.nextInt();
            int day = scanner.nextInt();

            if (year < 1989) {
                System.out.println("Yes");
            } else if (year == 1989 && month < 2) {
                System.out.println("Yes");
            } else if (year == 1989 && month == 2 && day <= 27) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
