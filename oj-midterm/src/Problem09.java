import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int radius = input.nextInt();
        int height = input.nextInt();

        double volume = Math.PI * radius * radius * height / 3.0;

        System.out.printf("%.2f%n", volume);
    }
}