import java.util.Scanner.*;

public Class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();  //Number of test cases

    while(t-->0){
      int n=sc.nextInt();    //Total number of items
      int x=sc.nextInt();    //Minimum Freshness Value
      int[] a=new int[n];   //Array to store freshness value of each items
      int[] b=new int[n];  // Array to store cost of esch items
      int sum=0;            //The total sum of the items the chef will pay for buying fresh items

      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }

      for(int j=0; j<n; j++){
        b[j]=sc.nextInt();
      }

      for(int i=0; i<n;i++){
        if(a[i]>=x){   //if the item freshness is greater or equal to defined freshness than
          sum += b[j];  //Add the cost in sum variable
        }
      }
      System.out.println(sum);
      
    }
  }
}
