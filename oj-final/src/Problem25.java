import java.util.Scanner;

public class Problem25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCase = scanner.nextInt();

        for (int i = 0; i < testCase; i++){
            int powerStrips = scanner.nextInt();
            for (int j = 0; j < powerStrips; j++){
                int outlets = scanner.nextInt();
                for (int k = 0; k < testCase; k++){
                    System.out.println((powerStrips * outlets) - (powerStrips - 1));
                }
            }
        }
    }
}
