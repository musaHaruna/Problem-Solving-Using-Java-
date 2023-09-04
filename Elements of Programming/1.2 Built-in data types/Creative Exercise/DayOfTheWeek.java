public class DayOfTheWeek {
    public static void main(String[] args) {
        // Define the date components (m, d, y)
        int m = 9; // September (example)
        int d = 4; // Day (example)
        int y = 2023; // Year (example)

        // Calculate the day of the week
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        // Print the result
        System.out.println("Day of the Week (0 = Sunday, 1 = Monday, ...): " + d0);
    }
}
