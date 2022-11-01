import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        int reversedNumber = 0;
        int reversedNumber2 = 0;

        while (a > 0) {
            int mod = a % 10;
            reversedNumber = reversedNumber * 10 + mod;
            a /= 10;
        }

        while (b > 0) {
            int mod = b % 10;
            reversedNumber2 = reversedNumber2 * 10 + mod;
            b /= 10;
        }

        System.out.println(Math.max(reversedNumber, reversedNumber2));
    }
}
