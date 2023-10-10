public class ArrayMatrixAddition {
    public static void main(String[] args) {
        // Define arrays a and b for matrix addition
        double[][] a = {
            {1.0, 2.0},
            {3.0, 4.0}
        };

        double[][] b = {
            {5.0, 6.0},
            {7.0, 8.0}
        };

        int n = a.length;  // Assuming both a and b are square matrices of the same size

        // Perform matrix addition
        double[][] c = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        // Display the resulting matrix c (sum of a and b)
        System.out.println("Resulting matrix (c) after addition:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
