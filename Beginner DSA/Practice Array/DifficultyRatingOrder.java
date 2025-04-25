import java.util.*;

class CodeChef{
  public sttaic void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while(t-->0){
      int n=sc.nextInt();
      int[] d = new int[n];

      for(int i=0; i<n; i++){
        int d[i]=sc.nextInt();
      }

      boolean isNonDecreasing = true;
      for(int i=1; i<n; i++){
        if(d[i]<d[i-1]){
          isNonDecreasing = false;
          break;
        }
      }
      System.out.println(isNonDecreasing ? "Yes" : "No");
    }
    sc.close();
  }
}
