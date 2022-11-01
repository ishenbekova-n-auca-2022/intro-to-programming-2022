import java.util.Locale;
import java.util.Scanner;

public class Problem44 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();

        double x = 0;

        if (a == 0 && b == 0) {
            System.out.println("indeterminate");
        } else if (b != 0 && a == 0) {
            System.out.println("undefined");
        } else {
            x = -b / a;
            System.out.printf("%.2f", x);
        }
    }
}
