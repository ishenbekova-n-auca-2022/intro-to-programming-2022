import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfRounds = scanner.nextInt();

        int totalPoint = 100;
        int lossA = 0;
        int lossD = 0;

        for (int i = 0; i < numberOfRounds; i++) {
            int rollAntonia = scanner.nextInt();
            int rollDavid = scanner.nextInt();

            if (rollAntonia < rollDavid) {
                lossA += rollDavid;
            } else if (rollAntonia > rollDavid) {
                lossD += rollAntonia;
            }
        }
        System.out.println(totalPoint - lossA);
        System.out.println(totalPoint - lossD);
    }
}
