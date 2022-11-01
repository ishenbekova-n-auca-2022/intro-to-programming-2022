import java.util.Scanner;

public class Problem30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a == 60 && b == c){
            System.out.println("Equilateral");
        } else if (a + b + c == 180 && a == b || b == c || a == c) {
            System.out.println("Isosceles");
        } else if (a + b + c == 180 && a != b && b != c ) {
            System.out.println("Scalene");
        } else if (a + b + c != 180) {
            System.out.println("Error");
        }
    }
}
