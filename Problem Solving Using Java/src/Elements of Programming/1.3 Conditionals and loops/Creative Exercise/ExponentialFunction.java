// Exponential function. Assume that x is a positive variable of type double.
// Write a code fragment that uses the Taylor series expansion to set the value of sum
// to e x = 1 + x + x2/2! + x3/3! + . . . .

public class ExponentialFunction {
    public static void main(String[] args) {
        double x = 2.0; // Input value
        int terms = 5; // Number of terms in Taylor series

        double sum = 1.0; // Initialize sum with the first term

        // Compute additional terms using Taylor series expansion
        double powerX = 1.0; // Initialize x^i
        double factorial = 1.0; // Initialize i!
        System.out.println("Term 0: 1.0"); // Print the first term
        for (int i = 1; i < terms; i++) {
            powerX *= x; // Compute x^i for the current iteration
            factorial *= i; // Compute i! for the current iteration
            double term = powerX / factorial; // Compute x^i / i!
            sum += term; // Add the term to the sum
            System.out.println("Term " + i + ": " + term); // Print the current term
        }

        System.out.println("e^(" + x + ") = " + sum); // Print the final result
    }
} 
