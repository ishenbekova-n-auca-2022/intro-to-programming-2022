import java.util.Scanner;

public class Problem21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int n = scanner.nextInt();
        int r = scanner.nextInt();
        int m = 0;
        int infected = 0;

        while (infected <= p) {
            infected += n * Math.pow(r, m);
            m++;
        }

        System.out.println(m - 1);

    }
}
