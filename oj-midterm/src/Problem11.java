import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int i = input.nextInt();

        int scientistsCount = a * i - a + 1;

        System.out.println(scientistsCount);
    }
}
