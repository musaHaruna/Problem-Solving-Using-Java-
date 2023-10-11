public class ToneExample {

    public static void main(String[] args) {
        double frequency = 440.0;  // Frequency in hertz (e.g., A4 note)
        double duration = 2.0;     // Duration in seconds

        // Call the tone method to generate the array of sampled values
        double[] sampledValues = tone(frequency, duration);

        // Print the sampled values
        System.out.println("Sampled Values:");
        for (int i = 0; i < sampledValues.length; i++) {
            System.out.println(sampledValues[i]);
        }
    }

    public static double[] tone(double hz, double t) {
        int SAMPLING_RATE = 44100;
        int n = (int) (SAMPLING_RATE * t);
        double[] a = new double[n + 1];
        for (int i = 0; i <= n; i++)
            a[i] = Math.sin(2 * Math.PI * i * hz / SAMPLING_RATE);
        return a;
    }
}
