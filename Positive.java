import java.lang.Math;
import java.util.Scanner;
public class Positive{
           public static void main(String[] args){
                 Scanner reader=new Scanner(System.in);
                 System.out.print("Enter the number: ");
                 int num=reader.nextInt();
                 
                 String x=(num>0)?"positive":(num<0)?"negative":"zero";
                     System.out.println("Number " +num+ " is a " +x + " number");    
                     
    }
}