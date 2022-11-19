import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Integer? ");
        int number = scanner.nextInt();

        int sumOfDigits = 0;

        while (number != 0) {
            sumOfDigits += number % 10;
            number /= 10;
        }

        System.out.println("The sum of all digits is " + sumOfDigits);

    }
}
