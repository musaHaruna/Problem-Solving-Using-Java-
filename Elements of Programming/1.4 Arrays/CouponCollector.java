public class CouponCollector {
    public static void main(String[] args) {
        // Generate random values in [0..n) until finding each one.
        int n = 4;
        boolean[] isCollected = new boolean[n];
   
        int count = 0;
        int distinct = 0;
        
        while (distinct < n) {
            // Generate another coupon.
            int r = (int) (Math.random() * n);
            System.out.println(r);
            System.out.println(distinct);
            count++;
            
            if (!isCollected[r]) {
                distinct++;
                isCollected[r] = true;
            }
        } // n distinct coupons found.
        
        System.out.println(count);
    }
}
