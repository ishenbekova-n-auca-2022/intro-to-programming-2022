import java.util.Random;
import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        double r = Math.random();

        System.out.print("Number of tests? ");
        int numberOfTests = scanner.nextInt();

        int correctAnswers = 0;

        for (int i = 0; i < numberOfTests; i++) {
            int op1 = -50 + random.nextInt(101);
            int op2 = -50 + random.nextInt(101);
            System.out.printf("%d + %d = ", op1, op2);
            int answer = scanner.nextInt();
            if (answer == op1 + op2) {
                ++correctAnswers;
            }
        }
        System.out.println("Number of correct answers: " + correctAnswers);
        System.out.println("Number of incorrect answers:" + (numberOfTests - correctAnswers));
    }
}
