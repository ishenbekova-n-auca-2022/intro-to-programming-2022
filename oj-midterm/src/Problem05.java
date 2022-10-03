import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int remain = (a * 8) + (b * 3) - 28;
        System.out.println(remain);
    }
}
