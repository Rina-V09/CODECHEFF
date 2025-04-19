import java.util.*;
import java.lang.*;
import java.io.*;

class CodeChef{
  public static void main(String[] args) throws java.lang.Exception{
    Scanner sc = new Scanner(System.in);
    int T= sc.nextInt();

    while(T>0){
      T--;

      int N=sc.nextInt();
      int max=0;
      int[] arr = new int[N];
      for(int i=0;i<N;i++){
        arr[i] = sc.nextInt();
        if(arr[i]>max){
          max=arr[i];
        }
      }

      System.out.println(max);
    }
  }
}
