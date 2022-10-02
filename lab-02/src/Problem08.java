import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kilogram = 0.454;
        System.out.print("Enter a number in pounds: ");
        double pound = input.nextDouble();
        double cnv = kilogram * pound;
        System.out.println(pound + " pounds is " + cnv + " kilograms");
    }
}
