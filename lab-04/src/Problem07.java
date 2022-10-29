import java.util.Locale;
import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the weight of the package: ");
        double weight = input.nextDouble();

        double shippingCost = 0;

        if (weight > 20) {
            System.out.println("The package cannot be shipped.");
        } else if (weight > 0 && weight <= 2) {
            shippingCost = 3.5;
            System.out.println("The shipping cost: " + shippingCost);
        } else if (weight > 2 && weight <= 4) {
            shippingCost = 4.5;
            System.out.println("The shipping cost: " + shippingCost);
        } else if (weight > 4 && weight <= 10) {
            shippingCost = 7.5;
            System.out.println("The shipping cost: " + shippingCost);
        } else if (weight > 10 && weight <= 20) {
            shippingCost = 10.5;
            System.out.println("The shipping cost: " + shippingCost);
        } else {
            System.out.println("The package cannot be shipped.");
        }
    }
}
