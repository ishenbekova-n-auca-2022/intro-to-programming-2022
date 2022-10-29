import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("scissor (0), rock (1), paper (2): ");
        int computerChoice = (int) (Math.random() * 3);
        int userChoice = input.nextInt();

        String choiceName = "";
        String userChoiceName = "";

        switch (computerChoice) {
            case 0:
                choiceName = "scissor";
                break;
            case 1:
                choiceName = "rock";
                break;
            case 2:
                choiceName = "paper";
                break;
        }

        switch (userChoice) {
            case 0:
                userChoiceName = "scissor";
                break;
            case 1:
                userChoiceName = "rock";
                break;
            case 2:
                userChoiceName = "paper";
                break;
        }

        if (userChoice == 0 && computerChoice == 2) {
            System.out.printf("The computer is %s. You are %s. You won%n", choiceName, userChoiceName);
        } else if (userChoice == 1 && computerChoice == 0) {
            System.out.printf("The computer is %s. You are %s. You won%n", choiceName, userChoiceName);
        } else if (userChoice == 2 && computerChoice == 1) {
            System.out.printf("The computer is %s. You are %s. You won%n", choiceName, userChoiceName);
        } else if (userChoice == computerChoice) {
            System.out.printf("The computer is %s. You are %s too. It is a draw%n", choiceName, userChoiceName);
        } else {
            System.out.printf("The computer is %s. You are %s. You lost%n", choiceName, userChoiceName);
        }
    }
}
