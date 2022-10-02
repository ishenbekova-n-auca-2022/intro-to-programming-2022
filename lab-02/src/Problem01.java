import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1st value? ");
        int num1 = scanner.nextInt();

        System.out.print("2nd value? ");
        int num2 = scanner.nextInt();
        System.out.printf("Before swapping: a = %d; b = %d;%n", num1, num2);

        int t = num1;
        num1 = num2;
        num2 = t;
        System.out.printf("After swapping: a = %d; b = %d;%n", num1, num2);

    }
}
