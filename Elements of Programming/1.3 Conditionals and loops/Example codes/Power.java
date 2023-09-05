public class Power
{
public static void main(String[] args)
{ // Print the first n powers of 2.
int n = 64;
int power = 1;
int i = 0;
while (power <= n)
{ // Print ith power of 2.
System.out.println(i + " " + power);
power = 2 * power;
i = i + 1;
}
}
}