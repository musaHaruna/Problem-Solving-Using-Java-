// Write a program Checkerboard that takes an integer command-line argument
// n and uses a loop nested within a loop to print out a two-dimensional n-by-n
// checkerboard pattern with alternating spaces and asterisks.



public class CheckerBoard {
 public static void main(String[] args) {
  int n = 8;
for (int i = 1; i <= n; i++) { // Print the ith line.
    for (int j = 1; j <= n; j++) { // Print the jth element in the ith line.
        if (((i + j) % 2 == 0 )) {
            System.out.print("*");
        }else
        System.out.print(" ");
     }
System.out.println(i);
}
}
}

