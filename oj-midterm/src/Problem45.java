import java.util.Scanner;

public class Problem45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        if (c >= b || a >= d) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
