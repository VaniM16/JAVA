import java.lang.Math;
import java.util.Scanner;
public class Largest3{
           public static void main(String[] args){
                 Scanner reader=new Scanner(System.in);
                 System.out.print("Enter the first number: ");  
                 int num1=reader.nextInt();
                 System.out.print("Enter the second number: ");
                 int num2=reader.nextInt();
                 System.out.print("Enter the third number: ");
                 int num3=reader.nextInt();
                 if(num1>num2){
                    if(num1>num3)
                     System.out.println("Number " +num1 + " is greater");
                    else
                      System.out.println("Number " +num3 + " is greater");
                    } 
                 else if(num2>num3)
                      System.out.println("Number " +num2 + " is greater");
               
    }
}