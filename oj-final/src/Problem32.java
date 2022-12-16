import java.util.Scanner;

public class Problem32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        int digit = 0;

        for (int i = 0; i < t; i++) {
            int number = scanner.nextInt();
            do {
                number = number / 10;
                digit++;
            } while (number != 0);
            System.out.println(digit);
        }
    }
}
