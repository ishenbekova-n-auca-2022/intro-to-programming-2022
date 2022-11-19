import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int countOfGrades = 0;

        int grade = scanner.nextInt();

        while (grade != 0) {
            sum += countOfGrades;
            ++countOfGrades;
            grade = scanner.nextInt();
        }
        if (countOfGrades != 0) {
            System.out.printf("%.1f%n", sum / countOfGrades);
        } else {
            System.out.println("Nothing to calculate");
        }
    }

}
