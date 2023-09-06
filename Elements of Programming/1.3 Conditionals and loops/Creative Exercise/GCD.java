// Write a program GreatestCommonDivisor that finds the greatest common
// divisor (gcd) of two integers using Euclid’s algorithm, which is an iterative computation
// based on the following observation: if x is greater than y, then if y divides x,
// the gcd of x and y is y; otherwise, the gcd of x and y is the same as the gcd of x % y
// and y.


public class GCD {
 public static void main(String[] args) {
  int x = 48;
  int y = 18;

   while(y != 0) {
    int remainder =  x % y;
    x = y;
    y = remainder;
    System.out.println(x);
   }
}
}

