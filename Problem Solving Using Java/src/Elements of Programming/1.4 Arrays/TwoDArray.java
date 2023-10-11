public class TwoDArray {
    public static void main(String[] args) {
        // Create a 2D array with predefined values
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6, 66},
            {7, 8, 9, 10, 11, 12}
        };
        
        // Display the 2D array
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
