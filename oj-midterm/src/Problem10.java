import java.util.Scanner;

public class Problem10 {
    public static final double G = -9.8;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double v = input.nextInt();

        double t = -2 * v / G;

        System.out.printf("%.6f", t);
    }
}