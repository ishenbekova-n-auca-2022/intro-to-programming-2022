import java.util.Scanner;

public class Problem41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int shotA = input.nextInt();
        int fieldGoalA = input.nextInt();
        int freeThrowA = input.nextInt();
        int shotB = input.nextInt();
        int fieldGoalB = input.nextInt();
        int freeThrowB = input.nextInt();

        int appleScore = shotA * 3 + fieldGoalA * 2 + freeThrowA;
        int bananaScore = shotB * 3 + fieldGoalB * 2 + freeThrowB;

        if (appleScore > bananaScore) {
            System.out.println("A");
        } else if (appleScore < bananaScore) {
            System.out.println("B");
        } else {
            System.out.println("T");
        }
    }
}
