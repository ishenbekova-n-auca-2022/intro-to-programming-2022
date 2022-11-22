import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        for (int i = 0; i < number + 1; i ++){
            String word = scanner.nextLine();
            if (i % 2 == 1) {
                System.out.println(word);
            }
        }
    }
}
