// Polar coordinates. Write a program that converts from Cartesian
// to polar coordinates. Your program should accept two double commandline
// arguments x and y and print the polar coordinates r and . Use the
// method Math.atan2(y, x) to compute the arctangent value of y/x that is
// in the range from  to .

public class PolarCordinate {
    public static void main(String[] args) {
        // Predefined values for Cartesian coordinates
        double x = 3.0; // Example x-coordinate
        double y = 4.0; // Example y-coordinate

        // Calculate r (polar radius)
        double r = Math.sqrt(x * x + y * y);

        // Calculate θ (polar angle) using Math.atan2
        double theta = Math.atan2(y, x);

        // Convert θ to degrees if needed (optional) 
        // double degrees = Math.toDegrees(theta);

        // Display the polar coordinates
        System.out.println("Polar Coordinates:");
        System.out.println("r: " + r);
        System.out.println("θ: " + theta);
    }
}
