import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int sum = 0;

        do {
            System.out.print("Enter an integer (the input ends if it is 0): ");
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);

        System.out.println("The sum is " + sum);
    }
}
