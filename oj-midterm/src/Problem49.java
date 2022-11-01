import java.util.Scanner;

public class Problem49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p = input.nextInt();
        int c = input.nextInt();
        int v = input.nextInt();

        int countP = p / 3;
        int countC = c / 3;
        int countV = v / 3;

        if (p % 3 != 0) {
            countP = countP + 1;
        }

        if (c % 3 != 0) {
            countC = countC + 1;
        }

        if (v % 3 != 0) {
            countV = countV + 1;
        }
        System.out.println(countC + countP + countV);
    }
}
