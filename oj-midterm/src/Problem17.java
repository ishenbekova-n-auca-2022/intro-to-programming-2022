import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int s = input.nextInt();
        int m = input.nextInt();
        int l = input.nextInt();

        int score = s + (2 * m) + (3 * l);

        if (score >= 10) {
            System.out.println("happy");
        } else {
            System.out.println("sad");
        }
    }
}
