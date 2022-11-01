import java.util.Scanner;

public class Problem26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        if (a >= c && a < d || a <= c && c < b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
