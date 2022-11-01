import java.util.Scanner;

public class Problem34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        int piece = 0;

        if (m > n && m - n != 1) {
            piece = m - n;
            System.out.printf("Dr. Chaz will have %d pieces of chicken left over!", piece);
        } else if (m > n && m - n == 1) {
            piece = m - n;
            System.out.printf("Dr. Chaz will have %d piece of chicken left over!", piece);
        } else if (m < n && n - m != 1) {
            piece = n - m;
            System.out.printf("Dr. Chaz needs %d more pieces of chicken!", piece);
        } else if (m < n && n - m == 1) {
            piece = n - m;
            System.out.printf("Dr. Chaz needs %d more piece of chicken!", piece);
        }
    }
}
