// Ramanujan’s taxi. Srinivasa Ramanujan was an Indian mathematician
// who became famous for his intuition for numbers. When the English mathematician
// G. H. Hardy came to visit him one day, Hardy remarked that the number of
// his taxi was 1729, a rather dull number. To which Ramanujan replied, “No, Hardy!
// No, Hardy! It is a very interesting number. It is the smallest number expressible as
// the sum of two cubes in two different ways.” Verify this claim by writing a program
// that takes an integer command-line argument n and prints all integers less than or
// equal to n that can be expressed as the sum of two cubes in two different ways. In
// other words, find distinct positive integers a, b, c, and d such that a3 + b3 = c3 + d3.
// Use four nested for loops. 
// Solution still needs improvement


// My Solution 
// public class RamanujansTaxi {
//     public static void main(String[] args) {
//         int n = 2;
        
//         for (int a = 1; a <= n; a++) {
//             for (int b = a; b <= n; b++) {
//                 int sum1 = a * a * a + b * b * b;
//                     System.out.println("Sum1 " +sum1);
//                     System.out.println("a " +a);
//                     System.out.println("b " +b);
//                     System.out.println("n " +n);

//                 for (int c = a + 1; c <= n; c++) {
//                     for (int d = c; d <= n; d++) {
//                         int sum2 = c * c * c + d * c * c;
//                             System.out.println("Sum2 " +sum2);
//                             System.out.println("c " +c);
//                             System.out.println("d " +d);
//                             System.out.println("n2nd loop " +n);

//                         if (sum1 == sum2) {
//                             System.out.println("Ramanujan's Taxi Number: " + sum1);
//                         }
//                     }
//                 }
//             }
//         }
//     }
// }

// Book solution
public class RamanujansTaxi {

    public static void main(String[] args) {

        // read in one command-line argument
        int n = 100;

        // for each a, b, c, d, check whether a^3 + b^3 = c^3 + d^3
        for (int a = 1; a <= n; a++) {
            int a3 = a*a*a;
            if (a3 > n) break;

            // start at a to avoid print out duplicate
            for (int b = a; b <= n; b++) {
                int b3 = b*b*b;
                if (a3 + b3 > n) break;

                // start at a + 1 to avoid printing out duplicates
                for (int c = a + 1; c <= n; c++) {
                    int c3 = c*c*c;
                    if (c3 > a3 + b3) break;

                    // start at c to avoid printing out duplicates
                    for (int d = c; d <= n; d++) {
                        int d3 = d*d*d;
                        if (c3 + d3 > a3 + b3) break;

                        if (c3 + d3 == a3 + b3) {
                            System.out.print((a3+b3) + " = ");
                            System.out.print(a + "^3 + " + b + "^3 = ");
                            System.out.print(c + "^3 + " + d + "^3");
                            System.out.println();
                        }
                    }
                }
            }
        }
    }
}