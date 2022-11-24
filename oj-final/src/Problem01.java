import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String greeting = scanner.next();

        int countE = greeting.length() - 2;

        System.out.print("h");

        for (int i = 0; i < 2 * countE; i++) {
            System.out.print("e");
        }

        System.out.print("y");
    }
}
