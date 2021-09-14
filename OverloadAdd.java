import java.util.Scanner;
class Add{
 
 void add(int x,int y){
   int z=x+y;
   System.out.println("Sum of 2 integers= " +z);
   }
 void add(int x,int y,int z){
  int w=x+y+z;
  System.out.println("Sum of 3 integers= " +w);
  }
 void add(float x,float y)
  {
    double z=x+y;
    System.out.println("Sum of 2 floats= " +z); 
   }
}
class OverloadAdd
{
 public static void main(String[] args)
  {
    int a,b,c,d,e;
    float f,g;
    
    Scanner reader=new Scanner(System.in);
    
    Add ob=new Add();
    System.out.print("Enter the 2 integers:"); 
    a=reader.nextInt();
    b=reader.nextInt();
    
    System.out.print("Enter the 3 integers:");
    c=reader.nextInt();  
    d=reader.nextInt();
    e=reader.nextInt();
    
   
    System.out.print("Enter the 2 floats:");
    f=reader.nextFloat();
    g=reader.nextFloat();
    
    ob.add(a,b);
    ob.add(c,d,e);
    ob.add(f,g);
    
   }
} 