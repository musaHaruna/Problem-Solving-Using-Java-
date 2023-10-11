public class HarmonicSeries {
    public static double harmonic(int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    public static void main(String[] args) {

        int arguments[] = {10, 100, 1000, 10000};
        for (int i = 0; i < arguments.length; i++) {
            int arg = arguments[i];
            double value = harmonic(arg);
            System.out.println("Harmonic value for argument " + arg + ": " + value);
        }
    }
}

