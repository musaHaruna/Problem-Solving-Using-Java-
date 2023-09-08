public class ReverseValue {

public static void main(String[] args) {
    int n = 4;
    double[] a = new double[4];
    for (int i = 0; i < n/2; i++){
        double temp = a[i];
        a[i] = a[n-1-i];
        a[n-i-1] = temp;
}
}
}
