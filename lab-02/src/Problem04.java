import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Length in inches? ");
        int number = scanner.nextInt();
        double cm = number * 2.54;
        System.out.println(number + " in. = " + cm + " cm.");
    }
}
