import java.util.Scanner;

public class Circle{
  double r;

  public double circmf(){
     return 2*3.14*r;
  }
  public double area(){
     return 3.14*r*r;
  }
    public static void main(String[] args)
    {
    Scanner reader= new Scanner(System.in) ;
    System.out.print("Enter the radius:");
   
       Circle objCircle;
       objCircle=new Circle();
       objCircle.r=reader.nextInt();

       double ar=objCircle.area();
       double cmf=objCircle.circmf();
       System.out.println("Circumference  of the circle= "+cmf);
       System.out.println("Area of the circle= "+ar);
      
       
    }
   
}

