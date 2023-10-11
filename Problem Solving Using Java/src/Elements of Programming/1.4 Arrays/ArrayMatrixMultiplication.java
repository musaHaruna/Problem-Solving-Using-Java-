public class ArrayMatrixMultiplication {
    public static void main(String[] args) {
        // Define arrays a and b for matrix multiplication
        double[][] a = {
            {1.0, 2.0},
            {3.0, 4.0}
        };

        double[][] b = {
            {5.0, 6.0},
            {7.0, 8.0}
        };

        int n = a.length;  // Assuming both a and b are square matrices of the same size

        // Perform matrix multiplication
        double[][] c = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Dot product of row i from a and column j from b
                for (int k = 0; k < n; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        // Display the resulting matrix c (product of a and b)
        System.out.println("Resulting matrix (c) after multiplication:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
