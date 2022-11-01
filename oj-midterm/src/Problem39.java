import java.util.Scanner;

public class Problem39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = input.nextInt();

        switch (i) {
            case 1:
            case 9:
            case 10:
                System.out.println(1);
                break;
            case 2:
            case 3:
            case 7:
            case 8:
                System.out.println(2);
                break;
            case 4:
            case 5:
            case 6:
                System.out.println(3);
                break;
        }
    }
}
