import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Number of points? ");
        int point = input.nextInt();

        if (point >= 90 && point <= 100) {
            System.out.println("Grade: A");
        } else if (point >= 80 && point < 90) {
            System.out.println("Grade: B");
        } else if (point >= 70 && point < 80) {
            System.out.println("Grade: C");
        } else if (point >= 60 && point < 70) {
            System.out.println("Grade: D");
        } else if (point < 60) {
            System.out.println("Grade: F");
        } else {
            System.out.printf("%d is not in the permitted range.", point);
        }
    }
}
