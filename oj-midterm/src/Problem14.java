import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int h = input.nextInt();
        int v = input.nextInt();

        double length = h / Math.sin(Math.toRadians(v));

        if (length - Math.round(length) >= 0) {
            length = length + 1;
        }

        System.out.printf("%.0f", length);
    }
}
