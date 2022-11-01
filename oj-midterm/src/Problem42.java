import java.util.Scanner;

public class Problem42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int b = input.nextInt();

        int p = 5 * b - 400;

        if (p < 100){
            System.out.println(p);
            System.out.println(1);
        } else if (p > 100) {
            System.out.println(p);
            System.out.println(-1);
        } else {
            System.out.println(p);
            System.out.println(0);
        }
    }
}
