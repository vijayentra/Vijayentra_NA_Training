package Day1;

public class SquarePrime {

	public static void main(String[] args) {
		int[] numbers = {3,4,6,3,2,5,2,3,5,6 };

        // Print the squares of prime numbers
        for (int number : numbers) {
            if (isPrime(number)) {
                int square = number * number;
                System.out.println("Square of prime number " + number + ": " + square);
            }
        }
    }

    // Helper method to check if a number is prime
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
	}

}
