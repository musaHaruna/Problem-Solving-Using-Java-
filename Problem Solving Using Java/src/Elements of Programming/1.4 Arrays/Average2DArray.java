public class Average2DArray {
    public static void main(String[] args) {
        // Create a 2D array with predefined values
        double[][] a = {
            { 99.0, 85.0, 98.0, 0.0 },
            { 98.0, 57.0, 79.0, 0.0 },
            { 92.0, 77.0, 74.0, 0.0 },
            { 94.0, 62.0, 81.0, 0.0 },
            { 99.0, 94.0, 92.0, 0.0 },
            { 80.0, 76.5, 67.0, 0.0 },
            { 76.0, 58.5, 90.5, 0.0 },
            { 92.0, 66.0, 91.0, 0.0 },
            { 97.0, 70.5, 66.5, 0.0 },
            { 89.0, 89.5, 81.0, 0.0 },
        };

        int m = a.length;  // Number of rows
        int n = a[0].length;  // Number of columns, assuming all rows have the same length

        // Compute the average for each row and store in the last column
        for (int i = 0; i < m; i++) {
            double sum = 0.0;
            for (int j = 0; j < n; j++) {
                sum += a[i][j];
            }
            a[i][n - 1] = sum / n;  // Store the average in the last column
        }
        
        // Display the updated 2D array with averages
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        // Compute and display the average for each column
        for (int j = 0; j < n; j++) {
            double sum = 0.0;
            for (int i = 0; i < m; i++) {
                sum += a[i][j];
            }
            double columnAverage = sum / m;
            System.out.print(columnAverage + " ");
        }
    }
}
