import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int sumOfDigits = 0;
        sumOfDigits += number % 10;  //7
        number /= 10;                //123
        sumOfDigits += number % 10;  //7 + 3
        number /= 10;                //12
        sumOfDigits += number % 10;  //10 + 2
        number /= 10;                //1
        sumOfDigits += number % 10;  // 12 + 1
        number /= 10;

        System.out.println("The sum of all digits is " + sumOfDigits);
    }
}
