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
        int count = 0;

        while (count < numberOfTests) {
            int operation1 = -50 + random.nextInt(101);
            int operation2 = -50 + random.nextInt(101);

            System.out.printf("%d + %d = ", operation1, operation2);
            int answer = scanner.nextInt();

            if (answer == operation1 + operation2) {
                correctAnswers++;
            }

            count++;
        }

//        for (int i = 0; i < numberOfTests; i++) {
//            int operation1 = -50 + random.nextInt(101);
//            int operation2 = -50 + random.nextInt(101);
//            System.out.printf("%d + %d = ", operation1, operation2);
//            int answer = scanner.nextInt();
//            if (answer == operation1 + operation2) {
//                ++correctAnswers;
//            }
//        }
        System.out.println("Number of correct answers: " + correctAnswers);
        System.out.println("Number of incorrect answers: " + (numberOfTests - correctAnswers));
    }
}
