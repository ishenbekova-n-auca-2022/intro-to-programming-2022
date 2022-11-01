import java.util.Locale;
import java.util.Scanner;

public class Problem37 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        double daytime = input.nextInt();
        double evening = input.nextInt();
        double weekend = input.nextInt();

        double planA = daytime - 100;

        if (planA <= 0) {
            planA = 0;
        } else {
            planA = planA * 25;
        }

        double plan1 = evening * 15;
        double plan2 = weekend * 20;
        double cost1 = (planA + plan1 + plan2) / 100;

        double planB = daytime - 250;

        if (planB <= 0) {
            planB = 0;
        } else {
            planB = planB * 45;
        }

        double plan3 = evening * 35;
        double plan4 = weekend * 25;
        double cost2 = (planB + plan4 + plan3) / 100;

        System.out.printf("Plan A costs %.2f%n", cost1);
        System.out.printf("Plan B costs %.2f%n", cost2);

        if (cost1 > cost2) {
            System.out.println("Plan B is cheapest.");
        } else if (cost1 < cost2) {
            System.out.println("Plan A is cheapest.");
        } else {
            System.out.println("Plan A and B are the same price.");
        }
    }
}
