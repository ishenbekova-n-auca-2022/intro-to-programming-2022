import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bats = scanner.nextInt();

        double sum = 0;
        int countOfWalk = 0;

        for (int i = 0; i < bats; i++) {
            int number = scanner.nextInt();

            if (number < 0) continue;
            countOfWalk++;
            sum += number;
        }

        System.out.println(sum / countOfWalk);
    }
}
