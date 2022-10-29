import java.util.Locale;
import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        double distanceX = Math.pow(x * x, 0.5D);
        double distanceY = Math.pow(y * y, 0.5D);

        if (distanceX <= 5 && distanceY <= 2.5){
            System.out.printf("Point (%.1f, %.1f) is in the rectangle", x, y);
        } else {
            System.out.printf("Point (%.1f, %.1f) is not in the rectangle", x, y);
        }
    }
}
