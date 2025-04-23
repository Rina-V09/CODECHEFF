import java.util.*;
class CodeChef{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int t=sc.nextInt();
    while(t-->0){
      int n = sc.nextInt();
      int[] a = new int[n];
      int[] b = new int[n];
      int happyDays=0;

      for(int i=0; i<n; i++){
        int a[i]=sc.nextInt();
      }

      for(int i=0; i<n; i++){
        int b[i]=sc.nextInt();
      }

      for(int i=0; i<n; i++){
        if(a[i] <= 2*b[i] && b[i] <= 2*a[i]){
          happyDays++;
        } 
      }
      System.out.println(happyDays);
    }
  }
}
