import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius: ");
        double tC = input.nextDouble();
        double tF = 9/5.0 * tC + 32.0;
        System.out.println(tC + " Celsius is " + tF + " Fahrenheit");
    }
}
