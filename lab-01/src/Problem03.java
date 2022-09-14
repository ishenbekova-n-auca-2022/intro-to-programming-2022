import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        System.out.print("What is your name? ");
        Scanner scanner = new Scanner(System.in);
        String firstName;
        firstName = scanner.next();
        System.out.println("Hello, " + firstName + "!");
    }
}
