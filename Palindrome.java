import java.lang.Math;
import java.util.Scanner;
public class Palindrome{
           public static void main(String[] args){
                 Scanner reader=new Scanner(System.in);
                 System.out.print("Enter the number: ");
                 int num=reader.nextInt();
                 int org=num;
                 int rev=0,rem;
                 while(num!=0){
                      rem=num%10;
                      rev=rev*10+rem;
                      num=num/10;
                  
                  }
                if(org==rev)
                 System.out.println("Number " +org + " is  Palindrome ");
                else
                 System.out.println("Number " +org + " is  not Palindrome ");
                
   }
}