import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfTiles = scanner.nextInt();

        int num = 1;

        while (Math.pow(num, 2) <= numberOfTiles) {
            num++;
        }

        System.out.println("The largest square has side length " + (num - 1) + ".");
    }
}
