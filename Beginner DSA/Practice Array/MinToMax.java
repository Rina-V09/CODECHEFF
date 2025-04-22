import java.util.Scanner;
import java.util.Arrays;

class CodeChef{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int T=sc.nextInt();   //No. of testcases

    while(T-->0){
      int n=sc.nextInt();    //Total elements
      int[] a = new int[n];  //Array a
      int count=0;

      for(int i=0; i<n; i++){
        int a[i]=sc.nextInt();
      }
      Arrays.sort(a);    //Sorting array in ascending order
      int x=a[0];        

      for(int i=0; i<n; i++){
        if(a[i]>x){
          a[i]=x;
          count++;
        }
      }
      System.out.println(count);   //Return count
      
    }
     
  }
} 
