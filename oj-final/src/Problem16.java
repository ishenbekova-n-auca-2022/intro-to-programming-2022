import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int n;
        for (int i = 0; i < t; i++) {
            n = scanner.nextInt();
            if (n > 315 || n <= 45) {
                System.out.println("n");
            }
            if (n > 45 && n <= 135) {
                System.out.println("E");
            }
            if (n > 135 && n <= 225) {
                System.out.println("S");
            }
            if (n > 225 && n <= 315) {
                System.out.println("W");
            }
        }
    }
}
