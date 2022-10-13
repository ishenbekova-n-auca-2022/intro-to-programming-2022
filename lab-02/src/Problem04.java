import java.util.Locale;
import java.util.Scanner;

public class Problem04 {
    public static final double CM_PER_INCH = 2.54;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Length in inches? ");
        double lengthInInches = scanner.nextInt();

        double lengthInCm = lengthInInches * CM_PER_INCH;

        System.out.printf("%.0f in. = %.2f cm.%n", lengthInInches, lengthInCm);
    }
}
