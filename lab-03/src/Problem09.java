import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("scissor (0), rock (1), paper (2): ");
        int choice = input.nextInt();

        int compChoice = (int) (Math.random() * 3);
        String compChoiceName = "";
        String choiceName = "";

        if (compChoice == 0 || choice == 0){
            compChoiceName = "scissor";
            choiceName = "scissor";
        } else if (compChoice == 1 || choice == 1) {
            compChoiceName = "rock";
            choiceName = "rock";
        } else {
            compChoiceName = "paper";
            choiceName = "paper";
        }


        if (choice == 0 && compChoice == 2 || choice == 1 && compChoice == 0 || choice == 2 && compChoice == 1) {
            System.out.printf("The computer is %s. You are %s. You won", compChoiceName, choiceName );
        } else if (choice == 0 && compChoice == 0 || choice == 1 && compChoice == 1 || choice == 2 && compChoice == 2) {
            System.out.printf("The computer is %s. You are %s too. It is a draw", compChoiceName, choiceName);
        } else {
            System.out.printf("The computer is %s. You are %s. You lost", compChoiceName, choiceName);
        }
    }
}
