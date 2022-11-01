import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int d = input.nextInt();
        int q = input.nextInt();
        int l = input.nextInt();
        int t = input.nextInt();

        int nValue = 5 * n;
        int dValue = 10 * d;
        int qValue = 25 * q;
        int lValue = 100 * l;
        int tValue = 200 * t;

        int cents = nValue + dValue + qValue + lValue + tValue;

        System.out.println(cents);
    }
}
