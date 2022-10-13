import java.util.Locale;
import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("some real number? ");
        double x = input.nextDouble();

        double r = x;

        if (r < 0) {
            r = -r;
        }

        System.out.printf("|%.4f| = %.4f%n", x, r);

    }
}
