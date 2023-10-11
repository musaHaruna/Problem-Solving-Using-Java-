// Order check. Write a program that takes three double command-line
// arguments x, y, and z and prints true if the values are strictly ascending or descending
// ( x < y < z or x > y > z ), and false otherwise.

public class OrderCheck {
    public static void main(String[] args) {
        // Define the values of x, y, and z
        double x = 2.0;
        double y = 4.0;
        double z = 6.0;

        // Check if the values are strictly ascending or descending
        boolean isAscending = (x < y && y < z);
        boolean isDescending = (x > y && y > z);

        // Print the result
        System.out.println("Ascending: " + isAscending);
        System.out.println("Descending: " + isDescending);
    }
}