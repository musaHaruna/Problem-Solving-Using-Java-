public class CopyArray {
public static void main(String[] args) {
int n = 4;
double[] b = new double[n];
 double[] a; // declare the array
 a = new double[n];
for (int i = 0; i < n; i++){
    a[i] = i;
    b[i] = a[i]; 
    System.out.println(a[i]);
    System.out.println(b[i]);
}


}
}





