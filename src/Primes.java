public class Primes {

    // Print all prime numbers less than 100
    public static void main(String[] args) {
        for (int i = 2; i<100; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    // Return true if n is prime, else return false
    public static boolean isPrime(int n) {
        for(int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
