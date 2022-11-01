import java.util.Scanner;

public class Problem35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int speedLimit = input.nextInt();
        int recordedSpeed = input.nextInt();

        int speeding = 0;
        int fine = 0;

        if (speedLimit >= recordedSpeed){
            System.out.println("Congratulations, you are within the speed limit!");
        } else if (speedLimit < recordedSpeed) {
            speeding = recordedSpeed - speedLimit;
            if (speeding >= 1 && speeding <=20){
                fine = 100;
                System.out.printf("You are speeding and your fine is $%d.", fine);
            } else if (speeding >= 21 && speeding <= 30) {
                fine = 270;
                System.out.printf("You are speeding and your fine is $%d.", fine);
            } else if (speeding >= 31) {
                fine = 500;
                System.out.printf("You are speeding and your fine is $%d.", fine);
            }
        }
    }
}
