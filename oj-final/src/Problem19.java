import java.util.Scanner;

public class Problem19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int m = scanner.nextInt();

        int n = x;
        int count = 0;

        while (n <= m + 1) {
            if (n * x % m == 1) {
                System.out.println(n);
                count++;
            }
            n++;
        }

        if (count == 0) {
            System.out.println("No such integer exist.");
        }
        //
    }
}
