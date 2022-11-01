import java.util.Scanner;

public class Problem31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int month = input.nextInt();
        int day = input.nextInt();

        if (month < 2 || month == 2 && day < 18){
            System.out.println("Before");
        } else if (month > 2 || month == 2 && day > 18) {
            System.out.println("After");
        } else {
            System.out.println("Special");
        }
    }
}
