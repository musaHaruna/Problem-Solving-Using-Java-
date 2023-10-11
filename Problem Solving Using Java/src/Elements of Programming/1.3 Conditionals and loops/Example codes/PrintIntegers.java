public class PrintIntegers {
    public static void main(String[] args) {
        int count = 0; // Initialize a counter to keep track of printed integers
        
        // Iterate through numbers from 1000 to 2000 (inclusive)
        for (int i = 1000; i <= 2000; i++) {
            // Check if the current number is divisible by 5
            if (i % 5 == 0) {
                System.out.print(i + " "); // Print the number
                count++; // Increment the counter

                // Check if we have printed five integers on this line
                if (count == 5) {
                    System.out.println(); // Start a new line
                    count = 0; // Reset the counter
                }
            }
        }
    }
}
