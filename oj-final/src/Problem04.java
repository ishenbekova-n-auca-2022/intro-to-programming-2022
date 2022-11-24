import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfTestCases = scanner.nextInt();

        for (int i = 0; i < numberOfTestCases; i++) {
            int dataNumber = scanner.nextInt();
            int day = scanner.nextInt();

            System.out.println(dataNumber + " " + ((day + 1) * day / 2 + day));
        }
    }
}
