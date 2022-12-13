import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int countOfGrades = 0;
        int grade;

        do {
            grade = scanner.nextInt();
            countOfGrades++;
            sum += grade;
        } while (grade != 0);

        if (countOfGrades != 0 && sum !=0) {
            System.out.println("The arithmetic mean is " + sum / (countOfGrades - 1));
        } else if (countOfGrades == 1){
            System.out.println("Nothing to calculate");
        }
    }
}
