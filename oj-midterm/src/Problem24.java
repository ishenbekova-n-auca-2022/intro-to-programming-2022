import java.util.Scanner;

public class Problem24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word = input.next();

        if (word.contains("ss")) {
            System.out.println("hiss");
        } else {
            System.out.println("no hiss");
        }
    }
}
