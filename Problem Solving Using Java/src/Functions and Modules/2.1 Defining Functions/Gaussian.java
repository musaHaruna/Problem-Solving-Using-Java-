public class Gaussian {
    // Implement Gaussian (normal) distribution functions.

    public static double pdf(double x) {
        return Math.exp(-x * x / 2) / Math.sqrt(2 * Math.PI);
    }

    public static double cdf(double z) {
        if (z < -8.0) return 0.0;
        if (z > 8.0) return 1.0;

        double sum = 0.0;
        double term = z;

        for (int i = 3; sum != sum + term; i += 2) {
            sum = sum + term;
            term = term * z * z / i;
        }

        return 0.5 + pdf(z) * sum;
    }

    public static void main(String[] args) {
        double z = 2.0;   // Example value for z
        double mu = 0.0;  // Example mean
        double sigma = 1.0;  // Example standard deviation
        System.out.println((z - mu) / sigma);

        System.out.printf("CDF value: %.3f\n", cdf((z - mu) / sigma));
    }
}
