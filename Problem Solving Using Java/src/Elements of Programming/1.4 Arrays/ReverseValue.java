public class ReverseValue {
    public static void main(String[] args) {
        int n = 4;
        double[] a = {1.0, 2.0, 3.0, 4.0, 5.0};  // Initial array
        
        System.out.println("Original Array:");
        displayArray(a);  // Display the original array

        for (int i = 0; i < n/2; i++) {
            double temp = a[i];
            a[i] = a[n-1-i];
            a[n-i-1] = temp;
            
            System.out.println("\nAfter swap " + (i+1) + ":");
            displayArray(a);  // Display the array after each swap
        }
    }

    // Helper method to display the array
    public static void displayArray(double[] arr) {
        for (double value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
