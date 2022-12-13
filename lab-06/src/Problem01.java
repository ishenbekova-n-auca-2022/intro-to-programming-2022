import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Your coordinate: ");
        int coordinate = scanner.nextInt();

        System.out.print("Coordinate of the 1st point: ");
        int point1 = scanner.nextInt();

        System.out.print("Coordinate of the 2nd point: ");
        int point2 = scanner.nextInt();

        int d1 = myAbs(point1 - coordinate);
        int d2 = myAbs(coordinate - point2);

        if (d1 < d2) {
            System.out.print("1st point is closer. Distance is " + d1);
        } else if (d2 < d1) {
            System.out.print("2nd is closer. Distance is " + d2);
        } else {
            System.out.print("Distance is the same: ");
        }
    }

    static int myAbs(int n) {
        if (n < 0) {
            n = -n;
        }
        return n;
    }
}
