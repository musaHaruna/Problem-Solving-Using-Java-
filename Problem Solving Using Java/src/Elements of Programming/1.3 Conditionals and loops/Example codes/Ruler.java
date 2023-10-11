public class Ruler {
 public static void main(String[] args)
{ // Simulate a fair coin flip.
int n = 5;
String ruler = "1";
for (int i = 2; i <= n; i++)
ruler = ruler + " " + i + " " + ruler;
System.out.println(ruler);
}
}
