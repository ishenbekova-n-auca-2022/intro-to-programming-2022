import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int players = scanner.nextInt();

        int count = 0;

        for (int i = 0; i < players; i++) {
            int score = scanner.nextInt();
            int foul = scanner.nextInt();

            if (score * 5 - foul * 3 > 40) {
                count++;
            }
        }

        if (count == players) {
            System.out.println(count + "+");
        } else {
            System.out.println(count);
        }
    }
}
