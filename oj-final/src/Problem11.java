import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        double[] list = new double[number];

        for (int i = 0; i < number; i++) {
            double n = scanner.nextDouble();
            list[i] = n;
        }

        double min = list[0];

        for (int i = 0; i < number; i++) {
            if (min > list[i]) {
                min = list[i];
            }
        }

        System.out.printf("%.2f", min);
    }
}
