public class Harmonic
{
public static void main(String[] args)
{ // Compute the nth harmonic number.
int n = 3;
double sum = 0.0;
for (int i = 1; i <= n; i++)
{ // Add the ith term to the sum.
sum += 1.0/i;
System.out.println(sum);
}
System.out.println(sum);
}
}