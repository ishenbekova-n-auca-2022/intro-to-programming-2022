import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int youngestAge = input.nextInt();
        int middleAge = input.nextInt();
        int difference = middleAge - youngestAge;
        int oldestAge = middleAge + difference;
        System.out.println(oldestAge);
    }
}
