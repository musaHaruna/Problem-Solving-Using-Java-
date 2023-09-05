public class Binary {
    public static void main(String[] args) {
        int n = 19;
        int power = 1;

        while (power <= n/2) {
            power *= 2;
          
        }
        // Now power is the largest power of 2 <= n.

        while (power > 0) {
            // Cast out powers of 2 in decreasing order.
            if (n < power) {
                System.out.println("binary " + 0);
            } else {
                System.out.println("binary " + 1);
                n -= power;
               System.out.println(n);
           
            }
            power /= 2;
            System.out.println(power);
        }

        System.out.println();
    }
}
