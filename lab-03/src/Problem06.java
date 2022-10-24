import java.util.Locale;
import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double d = b * b - (4 * a * c);

        if (d > 0) {
            double x1, x2;
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.printf("The equation has two roots %.4f and %.4f", x1, x2);
        } else if (d == 0) {
            double x;
            x = -b / (2 * a);
            System.out.printf("The equation has one root %f", x);
        } else {
            System.out.println("The equation has no real roots");
        }
    }
}
