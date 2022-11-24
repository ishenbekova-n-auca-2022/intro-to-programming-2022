import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int g = scanner.nextInt();
        int t = scanner.nextInt();
        int n = scanner.nextInt();

        int totalWeight = 0;

        for (int i = 0; i < n; i++) {
            totalWeight += scanner.nextInt();
        }

        System.out.println((int) ((g - t) * 0.9 - totalWeight));

    }
}
