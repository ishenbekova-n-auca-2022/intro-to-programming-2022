import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int r1 = input.nextInt();
        int s = input.nextInt();
        int r2 = s * 2 - r1;

        System.out.println(r2);
    }
}