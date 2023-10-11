public class CouponCollector {
    public static int getCoupon(int n) {
        // Return a random integer between 0 and n-1.
        return (int) (Math.random() * n);
    }

    public static int collectCoupons(int n) {
        // Collect coupons until getting one of each value
        // and return the number of coupons collected.
        boolean[] isCollected = new boolean[n];
        int count = 0, distinct = 0;
        while (distinct < n) {
            int r = getCoupon(n);
            count++;
            if (!isCollected[r])
                distinct++;
            isCollected[r] = true;
        }
        return count;
    }

    public static void main(String[] args) {
        // Assign a value for n (number of coupons to collect)
        int n = 10; // Example: Collect 10 different coupons

        // Collect n different coupons and get the count
        int count = collectCoupons(n);

        // Print the count
        System.out.println("Number of coupons collected: " + count);
    }
}
