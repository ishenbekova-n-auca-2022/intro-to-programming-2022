import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int t = input.nextInt();
        int m = input.nextInt();

        int combination = n * t * m;

        System.out.println(combination);
    }
}