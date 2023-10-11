public class ThreeSort {
    public static void main(String[] args) {
        // Define three integer values
        int a = 5;
        int b = 2;
        int c = 8;

        // Find the minimum and maximum values
        int min = Math.min(Math.min(a, b), c);
        int max = Math.max(Math.max(a, b), c);
        System.out.println(min);
        System.out.println(max);

        // Calculate the middle value (not max or min)
        int middle = a + b + c - max - min;

        // Print the values in ascending order
        System.out.println("Sorted Values in Ascending Order:");
        System.out.println(min);
        System.out.println(middle);
        System.out.println(max);
    }
}
