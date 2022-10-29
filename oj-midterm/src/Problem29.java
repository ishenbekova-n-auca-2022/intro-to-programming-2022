import java.util.Scanner;

public class Problem29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bowl1 = input.nextInt();
        int bowl2 = input.nextInt();
        int bowl3 = input.nextInt();

        if (bowl1 > bowl2 && bowl1 < bowl3 || bowl1 > bowl3 && bowl1 < bowl2) {
            System.out.println(bowl1);
        } else if (bowl2 > bowl1 && bowl2 < bowl3 || bowl2 > bowl3 && bowl2 < bowl1 ) {
            System.out.println(bowl2);
        } else {
            System.out.println(bowl3);
        }
    }
}
