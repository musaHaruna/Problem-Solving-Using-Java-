public class MathUtils {

    public static int abs(int x) {
        if (x < 0) return -x;
        else return x;
    }

    public static double abs(double x) {
        if (x < 0.0) return -x;
        else return x;
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= n / i; i++)
            if (n % i == 0) return false;
        return true;
    }

    public static double hypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    public static double harmonic(int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++)
            sum += 1.0 / i;
        return sum;
    }

    public static int uniform(int n) {
        return (int) (Math.random() * n);
    }

    public static void main(String[] args) {
        int intValue = -10;
        double doubleValue = -5.5;
        int primeCheck = 17;
        double a = 3.0;
        double b = 4.0;
        int harmonicValue = 5;
        int uniformValue = 10;

        // Displaying results for each method
        System.out.println("Absolute value of " + intValue + ": " + abs(intValue));
        System.out.println("Absolute value of " + doubleValue + ": " + abs(doubleValue));
        System.out.println("Is " + primeCheck + " prime? " + isPrime(primeCheck));
        System.out.println("Hypotenuse of a=" + a + " and b=" + b + ": " + hypotenuse(a, b));
        System.out.println("Harmonic value for n=" + harmonicValue + ": " + harmonic(harmonicValue));
        System.out.println("Random uniform value up to " + uniformValue + ": " + uniform(uniformValue));
    }
}
