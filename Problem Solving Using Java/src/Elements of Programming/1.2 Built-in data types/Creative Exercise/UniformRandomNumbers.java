// Uniform random numbers. Write a program that prints five uniform random
// numbers between 0 and 1, their average value, and their minimum and maximum
// values. Use Math.random(), Math.min(), and Math.max().


public class UniformRandomNumbers {
    public static void main(String[] args) {
        // Generate and print five random numbers
        double random1 = Math.random();
        double random2 = Math.random();
        double random3 = Math.random();
        double random4 = Math.random();
        double random5 = Math.random();

        System.out.println("Random Number 1: " + random1);
        System.out.println("Random Number 2: " + random2);
        System.out.println("Random Number 3: " + random3);
        System.out.println("Random Number 4: " + random4);
        System.out.println("Random Number 5: " + random5);

        // Calculate and print average, minimum, and maximum values
        double sum = random1 + random2 + random3 + random4 + random5;
        double average = sum / 5;
        double minimum = Math.min(random1, Math.min(random2, Math.min(random3, Math.min(random4, random5))));
        double maximum = Math.max(random1, Math.max(random2, Math.max(random3, Math.max(random4, random5))));

        System.out.println("Average: " + average);
        System.out.println("Minimum Value: " + minimum);
        System.out.println("Maximum Value: " + maximum);
    }
}
