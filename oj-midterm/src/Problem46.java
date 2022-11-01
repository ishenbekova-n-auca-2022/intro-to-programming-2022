import java.util.Scanner;

public class Problem46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int gold = input.nextInt();
        int silver = input.nextInt();
        int copper = input.nextInt();

        int cards = copper + (gold * 3) + (silver * 2);

        if (cards >= 8) {
            System.out.println("Province or Gold");
        } else if (cards == 7 || cards == 6) {
            System.out.println("Duchy or Gold");
        } else if (cards == 5) {
            System.out.println("Duchy or Silver");
        } else if (cards == 4 || cards == 3) {
            System.out.println("Estate or Silver");
        } else if (cards == 2) {
            System.out.println("Estate or Copper");
        } else {
            System.out.println("Copper");
        }
    }
}
