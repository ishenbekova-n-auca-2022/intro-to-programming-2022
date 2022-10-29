import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of edges of a triangle: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int perimeter = 0;

        if (a + b > c && a + c > b && b + c > a) {
            perimeter = a + b + c;
            System.out.println("The perimeter: " + perimeter);
        } else {
            System.out.println("The input is invalid.");
        }
    }
}
