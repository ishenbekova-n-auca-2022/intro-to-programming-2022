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

        if (difference > 0 && result % 2 == 0){
            System.out.println("Y");
        } else {
            System.out.println("N");
        }
    }
}
