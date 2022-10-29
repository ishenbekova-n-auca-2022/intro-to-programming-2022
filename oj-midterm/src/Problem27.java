import java.util.Scanner;

public class Problem27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int w = input.nextInt();
        int c = input.nextInt();

        String satisfaction = "";

        if (w == 3 && c >= 95) {
            satisfaction = "absolutely";
            System.out.printf("C.C. is %s satisfied with her pizza.", satisfaction);
        } else if (w == 1 && c <= 50) {
            satisfaction = "fairly";
            System.out.printf("C.C. is %s satisfied with her pizza.", satisfaction);
        } else {
            satisfaction = "very";
            System.out.printf("C.C. is %s satisfied with her pizza.", satisfaction);
        }
    }
}
