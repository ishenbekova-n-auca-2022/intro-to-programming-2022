import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int t = input.nextInt();

        int difference = Math.abs(a - c) + Math.abs(b - d);
        int result = t - difference;

        if (difference > t || result % 2 == 1){
            System.out.println("N");
        } else {
            System.out.println("Y");
        }
    }
}
