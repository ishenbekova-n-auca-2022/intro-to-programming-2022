import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();

        double a = Math.PI * radius * radius;
        double v = a * length;
        System.out.printf("The area is %.4f%n", a);
        System.out.printf("The volume is %.1f", v);
    }
}
