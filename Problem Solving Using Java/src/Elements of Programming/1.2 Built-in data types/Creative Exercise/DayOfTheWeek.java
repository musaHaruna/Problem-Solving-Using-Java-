// Day of the week. Write a program that takes a date as input and prints the
// day of the week that date falls on. Your program should accept three int commandline
// arguments: m (month), d (day), and y (year). For m, use 1 for January, 2 for
// February, and so forth. For output, print 0 for Sunday, 1 for Monday, 2 for Tuesday,
// and so forth. Use the following formulas, for the Gregorian calendar:
// y0 = y  (14  m) / 12
// x = y0  y0 / 4  y0 / 100  y0 / 400
// m0 = m  12  ((14  m) / 12)  2
// d0 = (d  x  (31  m0) / 12) % 7


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
