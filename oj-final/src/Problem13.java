import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int max = 0;
        String winner = "";

        for (int i = 0; i < number; i++) {
            String name = scanner.next();
            int bid = scanner.nextInt();

            if (bid > max) {
                max = bid;
                winner = name;
            }
        }

        System.out.println(winner);
    }
}
