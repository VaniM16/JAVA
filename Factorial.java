import java.lang.Math;
import java.util.Scanner;
public class Factorial{
           public static void main(String[] args){
                 Scanner reader=new Scanner(System.in);
                 System.out.print("Enter the number: ");
                 int num=reader.nextInt();
                 int fact=1,i;
                 if(num<0)
                     System.out.println("Number " +num + " is less than 0");
                 else if(num==0)
                     System.out.println(" Number " +num + " is  0");
                 else {
                      for(i=1;i<=num;i++)
                           fact=fact*i;
                  
                      System.out.println("Factorial of number " +num + " is " +fact);
                 } 
                     
   }
}