import java.util.Scanner;

public class Problem47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x1 = input.nextInt();
        int y1 = input.nextInt();

        int x2 = input.nextInt();
        int y2 = input.nextInt();

        int x3 = input.nextInt();
        int y3 = input.nextInt();

        if (x1 == x2) {
            System.out.println(x3);
        } else if (x1 == x3) {
            System.out.println(x2);
        } else if (x2 == x3) {
            System.out.println(x1);
        }

        if (y1 == y2) {
            System.out.println(" " + y3);
        } else if (y1 == y3) {
            System.out.println(" " + y2);
        } else if (y2 == y3) {
            System.out.println(" " + y1);
        }
    }
}
