import java.util.Scanner;

public class Problem28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int digit1 = input.nextInt();
        int digit2 = input.nextInt();
        int digit3 = input.nextInt();
        int digit4 = input.nextInt();

        if (digit1 == 8 || digit1 == 9 && digit4 == 8 || digit4 == 9 && digit2 == digit3) {
            System.out.println("ignore");
        } else {
            System.out.println("answer");
        }
    }
}
