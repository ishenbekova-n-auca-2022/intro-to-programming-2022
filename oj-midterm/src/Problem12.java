import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int code = input.nextInt();

        int digit1 = code % 10;
        int digit2 = code / 10;

        System.out.printf("%d%d%n", digit1, digit2);

    }
}
