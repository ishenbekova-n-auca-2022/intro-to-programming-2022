import java.util.Scanner;

public class Problem26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rangeTop = scanner.nextInt();
        int rangeEnd = scanner.nextInt();

        int count = 0;
        int rsa = 0;

        for (int i = rangeTop; i <= rangeEnd; i++) {
            for (int j = 1; j <= rangeTop; j++) {
                if (i % j == 0) {
                    count++;
                }
                if (count == 4){
                    rsa++;
                }
            }
        }
            System.out.printf("The number of RSA numbers between %d and %d is %d", rangeTop, rangeEnd, rsa);
        //
    }
}
