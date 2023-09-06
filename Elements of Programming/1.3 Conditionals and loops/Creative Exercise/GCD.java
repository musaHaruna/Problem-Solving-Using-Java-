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

