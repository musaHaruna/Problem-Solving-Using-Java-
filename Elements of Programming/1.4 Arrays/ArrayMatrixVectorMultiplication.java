public class ArrayMatrixVectorMultiplication {
    public static void main(String[] args) {
        // Define a 2D array for the matrix
        double[][] a = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
          
        };

        // Define a 1D array for the vector
        double[] x = {2.0, 1.0, 3.0};

        // Determine the dimensions of the matrix and vector
        int m = a.length;  // Number of rows
        int n = a[0].length;  // Number of columns (assuming it's the same as the length of x)

        // Initialize the result vector
        double[] b = new double[m];

        // Perform matrix-vector multiplication
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                b[i] += a[i][j] * x[j];
            }
        }

        // Display the resulting vector b (product of matrix a and vector x)
        System.out.println("Resulting vector (b) after multiplication:");
        for (int i = 0; i < m; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
