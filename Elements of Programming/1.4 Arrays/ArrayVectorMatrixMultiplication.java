public class ArrayVectorMatrixMultiplication {
    public static void main(String[] args) {
        // Define a 2D array for the matrix
        double[][] a = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0}
        };

        // Define a 1D array for the column vector
        double[] y = {2.0, 1.0};

        // Determine the dimensions of the matrix and column vector
        int m = a.length;  // Number of rows
        int n = a[0].length;  // Number of columns

        // Initialize the result vector
        double[] c = new double[n];

        // Perform matrix-column multiplication
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                c[j] += y[i] * a[i][j];
            }
        }

        // Display the resulting vector c (product of matrix a and column vector y)
        System.out.println("Resulting vector (c) after multiplication:");
        for (int j = 0; j < n; j++) {
            System.out.print(c[j] + " ");
        }
    }
}
