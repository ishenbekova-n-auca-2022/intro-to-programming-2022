import java.util.Scanner;

public class Problem21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
