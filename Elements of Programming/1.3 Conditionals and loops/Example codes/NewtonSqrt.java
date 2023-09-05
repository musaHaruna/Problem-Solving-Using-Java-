public class NewtonSqrt
{
public static void main(String[] args)
{
double c = 4.0;
double EPSILON = 1e-15;
double t = c;
while (Math.abs(t - c/t) > EPSILON * t)
{ 
 // Replace t by the average of t and c/t.
 // System.out.println(Math.abs(t - c/t) > EPSILON * t);
 // System.out.println(c);
 // System.out.println(t);
 // System.out.println(c/t);
 // System.out.println(t-c/t);
 // System.out.println(EPSILON);
 // System.out.println(EPSILON *t);
t = (c/t + t) / 2.0;
// System.out.println(t); Note: logs is for trace purposes
}
System.out.println(t);
}
}