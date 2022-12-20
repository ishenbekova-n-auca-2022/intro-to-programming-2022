import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();
        for (int i = 0; i <= y - x; i++) {
            if (i % 60 == 0) {
                System.out.printf("All positions change in year %d%n", i + x);
            }
        }
    }
}
