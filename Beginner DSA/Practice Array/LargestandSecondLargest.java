import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            // Your code goes here
            Arrays.sort(a);
            for(int i= n-1; i>=0;){
                if(a[i]!=a[i-1]){
                    System.out.println(a[i]+a[i-1]);
                    break;
                }else{
                    i--;
                }
            }
            
        }
    }
}
