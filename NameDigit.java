import java.lang.Math;
import java.util.Scanner;
public class NameDigit{
           public static void main(String[] args){
                 Scanner reader=new Scanner(System.in);
                 System.out.print("Enter the number between 0 and 9 : ");
                 int num=reader.nextInt();
                 switch(num)
                  {
                    case 0:
                      System.out.println("Number " +num + " is Zero");
                       break;
                    case 1:
                      System.out.println("Number " +num + " is One");
                       break;
                    case 2:
                      System.out.println("Number " +num + " is Two");
                       break;
                     case 3:
                      System.out.println("Number " +num + " is Three");
                       break;
                     case 4:
                      System.out.println("Number " +num + " is Four");
                       break;
                     case 5:
                      System.out.println("Number " +num + " is Five");
                       break;
                     case 6:
                      System.out.println("Number " +num + " is Six");
                       break;
                     case 7:
                      System.out.println("Number " +num + " is Seven");
                       break;
                     case 8:
                      System.out.println("Number " +num + " is Eight");
                       break;
                     case 9:
                      System.out.println("Number " +num + " is Nine");
                       break;
                    }
                
    }
}