// Wind chill. Given the temperature T (in degrees Fahrenheit) and the wind
// speed v (in miles per hour), the National Weather Service defines the effective temperature
// (the wind chill) as follows:
// w = 35.74  0.6215 T  (0.4275 T  35.75) v 0.16
// Write a program that takes two double command-line arguments temperature
// and velocity and prints the wind chill. Use Math.pow(a, b) to compute ab. Note :
// The formula is not valid if T is larger than 50 in absolute value or if v is larger than
// 120 or less than 3 (you may assume that the values you get are in that range).


public class WindChill {
    public static void main(String[] args) {
        // Predefined values for temperature and velocity
        double temperature = 60.0; // Example temperature in degrees Fahrenheit
        double velocity = 10.0;    // Example wind speed in miles per hour

        // Check if the temperature and velocity are within the valid range
        if (Math.abs(temperature) > 50.0 || velocity > 120.0 || velocity < 3.0) {
            System.out.println("Invalid input. Temperature or velocity is out of range.");
        }

        // Calculate wind chill using the provided formula
        double windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(velocity, 0.16)
                + 0.4275 * temperature * Math.pow(velocity, 0.16);

        // Display the result
        System.out.println("Wind Chill: " + windChill);
    }
}
