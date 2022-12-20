import java.util.Scanner;

public class Problem25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfTests = input.nextInt();


        for (int i = 0; i < numberOfTests; ++i) {
            int count = 1;

            int numberOfPowerStrips = input.nextInt();

            for (int k = 0; k < numberOfPowerStrips; ++k) {
                int numberOfOutlets = input.nextInt();
                count += numberOfOutlets - 1;
            }

            System.out.println(count);
        }
    }
}
