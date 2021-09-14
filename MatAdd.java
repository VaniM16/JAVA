import java.util.Scanner;
public class MatAdd{
     public static void main(String  args[]) {
     int row,col;
      Scanner reader=new Scanner(System.in);
      System.out.print("Enter the number of rows and columns:");
      row=reader.nextInt();
      col=reader.nextInt();
      int a[][] = new int[row][col];
      System.out.println("Enter  elements of  first matrix:");
      for(int i=0;i<row;i++)
      {
         for(int j=0;j<col;j++)
          {
            a[i][j]=reader.nextInt();
          }
      }
    
      int b[][] = new int[row][col];
      System.out.println("Enter  elements of  second matrix:");
      for(int i=0;i<row;i++)
      {
         for(int j=0;j<col;j++)
          {
            b[i][j]=reader.nextInt();
          }
      }
    int c[][] = new int[row][col];
     for(int i=0;i<row;i++)
      {
         for(int j=0;j<col;j++)
          {
            c[i][j]=a[i][j]+b[i][j];
          }
      }
      
      
      System.out.println("Matrix after addition:  ");
      for(int i=0;i<row;i++)
      { 
          for(int j=0;j<col;j++){
            System.out.print(+c[i][j] + " ");
           }
      System.out.println(" ");
      }
          
          
          
         } 
      }
       
      
    