// Continuously compounded interest. Write a program that calculates and
// prints the amount of money you would have after t years if you invested P dollars
// at an annual interest rate r (compounded continuously). The desired value is given
// by the formula Pe rt.



public class CompoundInterest {
    public static void main(String[] args) {
        // Define input values
        double principal = 1000.0; // Principal amount
        double interestRate = 0.05; // Annual interest rate (as a decimal)
        double time = 5.0; // Time in years

        // Calculate the future value using the continuously compounded interest formula
        double e = Math.E; // Approximate value of e
        double futureValue = principal * Math.pow(e, interestRate * time);

        // Print the result
        System.out.println("The future value after " + time + " years is: $" + futureValue);
    }
}
