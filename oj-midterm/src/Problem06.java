import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int widthOfRoom = input.nextInt();
        int lengthOfRoom = input.nextInt();
        int lengthOfTile = input.nextInt();

        int widthDivision = widthOfRoom / lengthOfTile;
        int lengthDivision = lengthOfRoom / lengthOfTile;
        int countOfTiles = widthDivision * lengthDivision;

        System.out.println(countOfTiles);
    }
}
