import java.util.Scanner;

public class Problem19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int distance = input.nextInt();
        String direction = input.next();
        int distance2 = input.nextInt();

        if (direction.equals("Infront")){
            System.out.println(distance -distance2);
        }else if (direction.equals("Behind")){
            System.out.println(distance2 - distance);
        }
    }
}
