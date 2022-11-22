import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int points;
        double sum = 0;

        for (int i = 0; i < number; i ++) {
            points = scanner.nextInt();
            if (points == -1){
                number = number - 1;
                sum = sum + points + 1;
            } else {
                sum += points;
            }
        }
        System.out.println(sum/number);
    }
}
