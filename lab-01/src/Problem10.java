public class Problem10 {
    public static void main(String[] args) {
        double currentPopulation = 312032486;
        double secondsInYear = 31536000;
        double births = secondsInYear / 7.0;
        double deaths = secondsInYear / 13.0;
        double immigrants = secondsInYear / 45.0;
        double annualChange = births - deaths + immigrants;
        System.out.println(Math.round(currentPopulation + (1 * annualChange)));
        System.out.println(Math.round(currentPopulation + (2 * annualChange)));
        System.out.println(Math.round(currentPopulation + (3 * annualChange)));
        System.out.println(Math.round(currentPopulation + (4 * annualChange)));
        System.out.println(Math.round(currentPopulation + (5 * annualChange)));
    }
}
