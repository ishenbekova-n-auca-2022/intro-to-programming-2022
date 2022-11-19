import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String greeting = scanner.next();

        int count = 0;
        int lastE = 0;

        for (int i = 0; i < greeting.length(); i++) {
            if (greeting.charAt(i) == 'e') {
                count++;
                lastE = i;
            }
        }

        String processing = greeting.substring(0, lastE);
        String countOfString = "";

        for (int i = 0; i < count; i++) {
            countOfString += 'e';
        }

        String result = processing + countOfString + greeting.substring(lastE);
        System.out.println(result);
    }
}
