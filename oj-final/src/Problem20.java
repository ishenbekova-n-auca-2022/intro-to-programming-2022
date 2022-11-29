import java.util.Scanner;

public class Problem20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int victory = 0;
        int loss = 0;
        int i = 0;

        while (i < 6) {
            String letter = scanner.next();
            i++;

            if (scanner.hasNext("W")) {
                victory++;
            } else if (scanner.hasNext("L")) {
                loss++;
            }
        }

        switch (victory){
            case 1:
            case 2:
                System.out.println(3);
                break;
            case 3:
            case 4:
                System.out.println(2);
                break;
            case 5:
            case 6:
                System.out.println(1);
                break;
            case 0:
                System.out.println(-1);
        }
    }
}