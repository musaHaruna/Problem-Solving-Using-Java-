public class Factors {
    public static void main(String[] args) {
        // Print the prime factorization of n.
        long n = 375;
        for (long factor = 2; factor <= n / factor; factor++) {
            System.out.println("value of first n: "  + n/factor);
            // Test potential factor.
            while (n % factor == 0) {
                // Cast out and print factor.
                n /= factor;
                System.out.println("Value of inner while loop n: " + n);
                System.out.println("value of factor % n: " +  n % factor);
                System.out.println("value of Factor: " + factor + " ");
            }
            // Any factor of n must be greater than factor.
        }
        if (n > 1) {
            System.out.println("value of last n " + n);
        }
        System.out.println();
    }
}
