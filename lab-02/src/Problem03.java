import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("A four-digit integer? ");
        int number = input.nextInt();
        int sumOfDigits = 0;
        sumOfDigits += number % 10;

        System.out.print(number / 100 + "," + (number % 100)/10 + "," + number %10);
    }
}
