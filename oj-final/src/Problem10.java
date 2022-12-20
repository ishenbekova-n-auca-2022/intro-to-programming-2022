import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int k = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i <= k; i++) {
            sum += number;
            number *= 10;
        }

        System.out.println(sum);
    }
}
