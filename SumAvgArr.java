import java.util.Scanner;
public class SumAvgArr {
     public static void main(String  args[]) {
     int n,temp;
      Scanner reader=new Scanner(System.in);
      System.out.print("Enter the limit of array:");
      n=reader.nextInt();
      int a[] = new int[n];
      int sum=0,avg;
      System.out.println("Enter  elements of array:");
      for(int i=0;i<n;i++)
      {
          a[i]=reader.nextInt();
       }
       temp=a[0];
       for (int i=0;i<n;i++)
       {
            sum=sum+a[i];
      
        }
       avg=sum/n;
      System.out.println("Sum is : " +sum);
      System.out.println("Average is : " +avg);
    }
}