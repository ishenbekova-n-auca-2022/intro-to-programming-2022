import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfMatches = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();

        for (int i = 0; i < numberOfMatches; i ++) {
            int length = scanner.nextInt();

            if (Math.pow(w, 2) + Math.pow(h, 2) >= Math.pow(length, 2)) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }
    }
}
