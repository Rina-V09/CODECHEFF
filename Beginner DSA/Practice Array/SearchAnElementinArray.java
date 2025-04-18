import java.util.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        // Reading N and X
        int N = sc.nextInt();
        int X = sc.nextInt();
        
        // Reading the array A
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // Check if X is present in A
        boolean found = false;
        for (int i = 0; i < N; i++) {
            if (A[i] == X) {
                found = true;
                break;
            }
        }

        // Output the result
        if (found) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
