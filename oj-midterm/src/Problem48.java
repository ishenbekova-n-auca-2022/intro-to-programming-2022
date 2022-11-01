import java.util.Scanner;

public class Problem48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double x = input.nextDouble();
        double y = input.nextDouble();

        double d = input.nextDouble();

        double root1 = Math.pow(x - x1, 2) + Math.pow(y - y1, 2);
        double firstDistance = Math.pow(root1, 0.5);

        double root2 = Math.pow(x - x2, 2) + Math.pow(y - y2, 2);
        double secondDistance = Math.pow(root2, 0.5);

        if (firstDistance <= d || secondDistance <= d) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
