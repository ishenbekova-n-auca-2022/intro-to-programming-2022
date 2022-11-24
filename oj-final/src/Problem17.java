import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int power = 2;
        int count = 1;

        while (power <= number) {
            power *= 2;
            count++;
        }

        if (number <= 0 || number == 1) {
            count = 0;
        }

        System.out.println(count);
    }
}
