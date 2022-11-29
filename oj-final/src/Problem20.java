import java.util.Scanner;

public class Problem20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String letter;
        int victory = 0;
        int loss = 0;
        int cases = 1;
        int max = 6;

        while (cases != max) {
            letter = scanner.next();

            if (scanner.hasNext("W")) {
                victory++;
            } else if (scanner.hasNext("L")) {
                loss++;
            }
//            if (letter.equals("W")) {
//                victory++;
//            } else if (letter.equals("L")) {
//                loss++;
//            }
        }

        if (victory >= 5) {
            System.out.println(1);
        } else if (victory == 3 || victory == 4) {
            System.out.println(2);
        } else if (victory == 1 || victory == 2) {
            System.out.println(3);
        } else {
            System.out.println(-1);
        }
    }
}
