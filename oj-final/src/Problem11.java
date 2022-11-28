import java.util.Locale;
import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        double min = 0;

        for (int i = 0; i < number; i ++) {
            double n = scanner.nextDouble();

            if (n < number) {
                min = n;
                i ++;
            }
        }
        System.out.printf("%.2f", min);
    }
    //
}
