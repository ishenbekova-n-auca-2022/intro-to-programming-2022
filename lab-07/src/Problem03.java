import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N? ");
        int number = scanner.nextInt();


        int[] a = new int[number];

        for (int i = 0; i < a.length; i++){
            System.out.print("Enter " + i + " element: ");
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System  .out.println();

        for (int i = a.length -1; i >= 0; i--){
            System.out.print(a[i] + " ");
        }
    }
}