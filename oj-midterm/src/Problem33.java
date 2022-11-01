import java.util.Scanner;

public class Problem33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String n = input.next();

        int indexOfParentheses = n.indexOf("(");

        String firstPart = n.substring(0, indexOfParentheses);
        String secondPart = n.substring(indexOfParentheses + 2);

        if (firstPart.equals(secondPart)) {
            System.out.println("correct");
        } else {
            System.out.println("fix");
        }
    }
}
