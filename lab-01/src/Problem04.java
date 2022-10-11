import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1st int? ");
        int firstInt = scanner.nextInt();

        System.out.print("2nd int? ");
        int secondInt = scanner.nextInt();
        
        int addition = firstInt + secondInt;
        int subtraction = firstInt - secondInt;
        int multiplication = firstInt * secondInt;
        int division = firstInt / secondInt;
        int modulo = firstInt % secondInt;

        System.out.println(firstInt + " + " + secondInt + " = " + addition);
        System.out.println(firstInt + " - " + secondInt + " = " + subtraction);
        System.out.println(firstInt + " * " + secondInt + " = " + multiplication);
        System.out.println(firstInt + " / " + secondInt + " = " + division);
        System.out.println(firstInt + " % " + secondInt + " = " + modulo);
    }
}
