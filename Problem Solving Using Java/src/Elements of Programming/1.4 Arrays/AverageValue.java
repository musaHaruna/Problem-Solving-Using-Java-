public class AverageValue {
 
public static void main(String[] args) {
 int n = 4;
 int[] a = new int[n];// declare the array
 double sum = 0.0;
 for (int i = 0; i < n; i++){
     a[i] = i;
     sum += a[i];
     System.out.println(sum);
 }
 double average = sum / n;
 System.out.println(average);

    for (int i = 0; i < n; i++){
        System.out.println(a[i]);
    }


   
 }
}
