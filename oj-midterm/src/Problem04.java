import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double height = input.nextInt();
        double base = input.nextInt();
        double a = height * base / 2;
        if (a % 2 == 0){
            System.out.println((int) a);
        } else {
            System.out.println(a);
        }
    }
}
