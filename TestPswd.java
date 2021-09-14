import java.lang.Exception;
import java.util.Scanner;

class ExcepUname extends Exception
 {
    ExcepUname(String message)
    {
      System.out.print(message);
    }
 }
class ExcepPswd extends Exception
 {
    ExcepPswd(String message)
    {
      System.out.print(message);
    }
 }


class TestPswd
{
  public static void main(String args[]) 
   {
      Scanner obj=new Scanner(System.in);
      String uname,pswd;
      int len;
      System.out.print("Enter the Username: ");
      uname=obj.nextLine();
      System.out.print("Enter the Password: ");
      pswd=obj.nextLine();
      len=uname.length();
      try
      {
           if(len<6)
      
             throw new ExcepUname("\n Username Must Have Atleast 6 Charaters !!!");
       
           else if(!pswd.equals("vani"))
             throw new ExcepPswd("Wrong Password !!!");
           else
            System.out.print("Done");
     }
     catch (ExcepUname n){
      System.out.print("\n Caught Exception ");
      System.out.print(n);
     }
     catch (ExcepPswd p){
      System.out.print("\n Caught Exception ");
      System.out.print(p);
     }
 }
}
 

