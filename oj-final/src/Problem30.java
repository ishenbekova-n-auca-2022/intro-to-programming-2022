import java.util.Scanner;

public class Problem30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();

        for(int i = 0; i < h; i++){
            System.out.println("*");
            for (int j = 0; j < h-2; j++){
                System.out.print("*");
            }
        }
    }
}
