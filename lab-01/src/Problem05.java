import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1st double? ");
        double firstDouble = scanner.nextDouble();
        System.out.print("2nd double? ");
        double secondDouble = scanner.nextDouble();
        double addition = firstDouble + secondDouble;
        double subtraction = firstDouble - secondDouble;
        double multiplication = firstDouble * secondDouble;
        double division = firstDouble / secondDouble;
        double modulo = firstDouble % secondDouble;

        System.out.println(firstDouble + " + " + secondDouble + " = " + addition);
        System.out.println(firstDouble + " - " + secondDouble + " = " + subtraction);
        System.out.println(firstDouble + " * " + secondDouble + " = " + multiplication);
        System.out.println(firstDouble + " / " + secondDouble + " = " + division);
        System.out.println(firstDouble + " % " + secondDouble + " = " + modulo);
    }
}
