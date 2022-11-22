import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        String word;

        for (int i = 0; i < number + 1; i++) {
            word = scanner.next();
            if (i % 2 == 0) {
                System.out.println(word);
            }
        }
    }
}
