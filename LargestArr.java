import java.util.Scanner;
public class LargestArr {
     public static void main(String  args[]) {
     int n,temp;
      Scanner reader=new Scanner(System.in);
      System.out.print("Enter the limit of array:");
      n=reader.nextInt();
      int a[] = new int[n];
      System.out.println("Enter  elements of array:");
      for(int i=0;i<n;i++)
      {
          a[i]=reader.nextInt();
       }
       temp=a[0];
       for (int i=0;i<n;i++)
       {
             if(a[i]>temp)
             {
                   temp =a[i];

              }
        }
      System.out.println("Largest number is : " +temp);
    }
}