public class Problem10 {
    public static void main(String[] args) {
        final int COUNT_OF_PRIMES = 50;
        final int COUNT_OF_PRIMES_IN_LINE = 10;
        int count = 0;
        int number = 2;

        System.out.println("The first 50 prime numbers are ");

        while (count < COUNT_OF_PRIMES) {
            boolean isPrime = true;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
                if (count % COUNT_OF_PRIMES_IN_LINE == 0) {
                    System.out.println(number);
                } else {
                    System.out.print(number + " ");
                }
            }

            number++;
        }
    }
}
