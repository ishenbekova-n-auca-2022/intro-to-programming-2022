import java.util.Scanner;

public class Problem20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cases = 1;
        String letter;
        int victory = 0;
        int loss = 0;

        while (cases != 7){
            letter = scanner.nextLine();

            if (letter.equals("W")) {
                victory++;
            } else if (letter.equals("L")) {
                loss++;
            }
        }

        System.out.println(victory);
        System.out.println(loss);
        while (scanner.hasNext("W")){
            victory ++;
            loss = 6 - victory;
        }
    }
}
