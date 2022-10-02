import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int year = input.nextInt();
        double currentPopulation = 312032486;
        double secondsInYear = 31536000;
        double births = secondsInYear / 7.0;
        double deaths = secondsInYear / 13.0;
        double immigrants = secondsInYear / 45.0;
        double annualChange = births - deaths + immigrants;
        System.out.println("The population in " + year + " years is " + Math.round(currentPopulation + (year * annualChange)));

    }
}
