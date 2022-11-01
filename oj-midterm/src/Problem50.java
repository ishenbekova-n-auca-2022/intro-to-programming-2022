import java.util.Scanner;

public class Problem50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        int modulo = n % m;
        int min = Math.min(n, m - 1);

        int answer = Math.max(modulo, min);

        System.out.println(answer);
    }
}
