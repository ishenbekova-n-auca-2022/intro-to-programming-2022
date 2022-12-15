import java.util.Random;
import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random  random = new Random();

        int[] counters = new int[11];

        System.out.print("N: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++){
            int d1 = 1 + random.nextInt(6);
            int d2 = 1 + random.nextInt(6);
            ++counters[d1 + d2 - 2];

        }

        for (int i = 0; i < counters.length; i++) {
            System.out.printf("%d: %d%n", i + 2, counters[i]);
        }
    }
}
