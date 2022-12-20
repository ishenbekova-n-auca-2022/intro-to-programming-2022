import java.util.Scanner;

public class Problem26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int beginOfRange = input.nextInt();
        int endOfRange = input.nextInt();

        int count = 0;

        for (int i = beginOfRange; i <= endOfRange; ++i) {
            int countOfDivisors = 0;

            for (int k = 1; k <= Math.sqrt(i); ++k) {
                if (i % k == 0) {
                    if (i / k == k) {
                        countOfDivisors++;
                    } else {
                        countOfDivisors = countOfDivisors + 2;
                    }
                }
            }

            if (countOfDivisors == 4) {
                count++;
            }
        }

        System.out.printf("The number of RSA numbers between %d and %d is %d%n", beginOfRange, endOfRange, count);
    }
}
