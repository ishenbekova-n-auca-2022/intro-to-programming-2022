import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three integer numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int x;

        if (num1 > num2) {
            x = num1;
            num1 = num2;
            num2 = x;
        } else {
            x = num2;
            num2 = num3;
            num3 = x;
        }

        System.out.println(num1 + "\n" + num2 + "\n" + num3);
    }
}
