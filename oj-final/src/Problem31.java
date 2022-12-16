import java.util.Scanner;

public class Problem31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rangeTop = scanner.nextInt();
        int rangeEnd = scanner.nextInt();

        for (int i = rangeTop; i <= rangeEnd; i++) {
            i++;
            int a = i / 100;
            int b = i / 10 % 10;
            int c = i % 100;

            if (Math.pow(a + b + c, 3) == i) {
                System.out.println(i);
            }
            i++;

        }
    }
}
