import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        String isMultiple;

        isMultiple = "no";
        if (a % b == 0) {
            isMultiple = "yes";
        }
        System.out.println(isMultiple);
    }
}
