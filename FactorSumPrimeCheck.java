import java.util.Random;

public class FactorSumPrimeCheck {

    public static void main(String[] args) {
        // Generate a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1; // Random number between 1 and 100
        System.out.println("Random number: " + number);

        // Find and sum the factors
        int sumOfFactors = 0;
        System.out.print("Factors: ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
                sumOfFactors += i;
            }
        }
        System.out.println("\nSum of factors: " + sumOfFactors);

        // Check if the sum of factors is prime
        if (isPrime(sumOfFactors)) {
            System.out.println("The sum of factors (" + sumOfFactors + ") is a prime number.");
        } else {
            System.out.println("The sum of factors (" + sumOfFactors + ") is not a prime number.");
        }
    }
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}


    

