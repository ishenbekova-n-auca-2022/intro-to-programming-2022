import java.util.Scanner;

public class Problem24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int count = 0;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (i + j == 10) {
                    count++;
                }
            }
        }

        if (count == 1) {
            System.out.printf("There is %d way to get the sum 10.", count);
        } else {
            System.out.printf("There are %d ways to get the sum 10.", count);
        }
    }
}
