import java.util.Scanner;

public class Problem22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int countOfStones = input.nextInt();

        if (countOfStones % 2 != 0){
            System.out.println("Alice");
        } else {
            System.out.println("Bob");
        }
    }
}
