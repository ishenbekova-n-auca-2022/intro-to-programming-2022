import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Temperature in degrees Fahrenheit? ");
        double fahrenheitTemp = input.nextInt();
        double celsius = 5 / 9.0 * (fahrenheitTemp -32);
        System.out.printf("The temperature in degrees Celsius is %.2f", celsius);
    }
}
