import java.util.Scanner;

public class Problem24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        if (a < b){
            System.out.println(a + " " + b);
        } else {
            System.out.println(b + " " + a);
        }
    }
}
