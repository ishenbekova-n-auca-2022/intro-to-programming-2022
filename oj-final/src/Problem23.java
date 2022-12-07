import java.util.Scanner;

public class Problem23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = scanner.nextInt();

        for (int i = 0; i < lines; i++){
            int count = scanner.nextInt();
            char character = scanner.next().charAt(0);

            System.out.println();

            for (int j = 0; j < count; j++){
                System.out.print(character);
            }
        }
    }
}
