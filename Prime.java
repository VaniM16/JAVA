import java.lang.Math;
import java.util.Scanner;
public class Prime{
           public static void main(String[] args){
                 Scanner reader=new Scanner(System.in);
                 System.out.print("Enter the limit: ");
                 int num=reader.nextInt();
                 int i,j,n,c;
                
                 for(i=2;i<=num;i++){   
                     c=0;
                     for(j=1;j<=i;j++){
                   
                        if (i%j==0)
                          c++;
                     }
                    if(c==2)
 
                                          
                         System.out.print(+i  + " ");
                  }   
               
    }
}