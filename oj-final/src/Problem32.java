import java.util.Scanner;

public class Problem32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int n, counter = 0;

        for (int i = 0; i < t; i++) {
            n = Math.abs(scanner.nextInt());

            if (n == 0) {
                counter = 1;
            } else while (n != 0) {
                n /= 10;
                counter += 1;
            }

            System.out.println(counter);
            counter = 0;
        }
    }
}
