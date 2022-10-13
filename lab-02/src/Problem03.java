import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("A four-digit integer? ");
        int number = input.nextInt();

        int sumOfDigits = 0;
        sumOfDigits += number % 10;
        number /= 10;
        sumOfDigits += number % 10;
        number /= 10;
        sumOfDigits += number % 10;
        number /= 10;
        sumOfDigits += number % 10;
        number /= 10;

        System.out.println("The sum of all digits is " + sumOfDigits);
    }
}
