import java.util.Scanner;

public class Problem28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        int s = scanner.nextInt();
        int h = scanner.nextInt();

        for (int i = 0; i < 3; i++){
            System.out.print("*");
            for (int j = 0; j < s; j++){
                System.out.print(" ");
            }
        }
    }
}
