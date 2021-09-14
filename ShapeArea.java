class ShapeArea{
 void area(float x){
   System.out.println("Area of Square= " +Math.pow(x,2)+ "sq units");
   }
 void area(float x,float y){
  System.out.println("Area of rectangle= " +x*y+ "sq units");
  }
 void area(double x)
  {
    double z=3.14*x*x;
    System.out.println("Area of circle= " +z+ " sq units"); 
   }
}
class Overload
{
 public static void main(String[] args)
  {
    ShapeArea ob=new ShapeArea();
    ob.area(5);
    ob.area(10,15);
    ob.area(2.5);
   }
} 