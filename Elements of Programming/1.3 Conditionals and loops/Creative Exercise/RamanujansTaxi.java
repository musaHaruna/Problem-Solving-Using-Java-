public class RamanujansTaxi {
    public static void main(String[] args) {
        int n = 2;
        
        for (int a = 1; a <= n; a++) {
            for (int b = a; b <= n; b++) {
                int sum1 = a * a * a + b * b * b;
                    System.out.println("Sum1 " +sum1);
                    System.out.println("a " +a);
                    System.out.println("b " +b);
                    System.out.println("n " +n);

                for (int c = a + 1; c <= n; c++) {
                    for (int d = c; d <= n; d++) {
                        int sum2 = c * c * c + d * c * c;
                            System.out.println("Sum2 " +sum2);
                            System.out.println("c " +c);
                            System.out.println("d " +d);
                            System.out.println("n2nd loop " +n);

                        if (sum1 == sum2) {
                            System.out.println("Ramanujan's Taxi Number: " + sum1);
                        }
                    }
                }
            }
        }
    }
}
