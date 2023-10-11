import java.util.Arrays;

public class ArrayOperations {

    public static double max(double[] a) {
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < a.length; i++)
            if (a[i] > max) max = a[i];
        return max;
    }

    public static double dot(double[] a, double[] b) {
        double sum = 0.0;
        for (int i = 0; i < a.length; i++)
            sum += a[i] * b[i];
        return sum;
    }

    public static void exchange(String[] a, int i, int j) {
        String temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void print(double[] a) {
        System.out.println("Array length: " + a.length);
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
    }

    public static double[][] readDouble2D() {
        // Assume you have m, n, and 2D array elements available
        int m = 2;  // Example value for m (rows)
        int n = 3;  // Example value for n (columns)

        double[][] a = new double[m][n];

        // Assume you have the elements for the 2D array
        double[][] elements = {{1.1, 2.2, 3.3}, {4.4, 5.5, 6.6}};

        // Fill the array a with the provided elements
        for (int i = 0; i < m; i++)
            System.arraycopy(elements[i], 0, a[i], 0, n);

        return a;
    }

    public static void main(String[] args) {
        // Example usage and invocation of the provided methods

        // Example usage of max method
        double[] arr = {3.5, 2.7, 8.1, 4.2};
        System.out.println("Max value in the array: " + max(arr));

        // Example usage of dot method
        double[] arr1 = {1.0, 2.0, 3.0};
        double[] arr2 = {4.0, 5.0, 6.0};
        System.out.println("Dot product of arrays: " + dot(arr1, arr2));

        // Example usage of exchange method
        String[] strArr = {"apple", "banana", "cherry"};
        System.out.println("Array before exchange: " + Arrays.toString(strArr));
        exchange(strArr, 0, 2);
        System.out.println("Array after exchange: " + Arrays.toString(strArr));

        // Example usage of print method
        double[] arrToPrint = {1.0, 2.0, 3.0, 4.0};
        print(arrToPrint);

        // Example usage of readDouble2D method
        double[][] double2DArray = readDouble2D();
        System.out.println("2D Array contents:");
        for (double[] row : double2DArray) {
            for (double element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
