import java.util.Scanner;

public class Problem28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int digit1 = input.nextInt();
        int digit2 = input.nextInt();
        int digit3 = input.nextInt();
        int digit4 = input.nextInt();

        if (digit1 > 7 && digit1 < 10 && digit2 == digit3 && digit4 > 7 && digit4 < 10) {
            System.out.println("ignore");
        } else {
            System.out.println("answer");
        }
    }
}
