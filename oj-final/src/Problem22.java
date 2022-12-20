import java.util.Scanner;

public class Problem22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double p = scanner.nextDouble();
        int a = scanner.nextInt();
        int y = scanner.nextInt();
        int b = scanner.nextInt();
        while (a < b) {
            y += 1;
            a *= (1 + p / 100);
        }
        System.out.println(y);
    }
}
