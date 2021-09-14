import java.util.Scanner;
interface abc {
    double pi=3.14;
    void area(double x,double y);
    void peri(double x,double y);
    void area(double x);
    void peri(double x);
}
class Rectangle implements abc{
    public void area(double x, double y) {
        System.out.print ("Area of Rectangle is: "+(x*y));
    }
    public void peri(double x,double y){
        System.out.print ("Perimeter of Rectangle is: "+(2*(x+y)));
    }
    public void area(double x){ }
    public void peri(double x){ }
}
class Circle implements abc{
    public void area(double x){
        System.out.print ("Area of Circle is: "+(pi*x*x));
    }
    public void peri(double x){
        System.out.print ("Perimeter of Rectangle is: "+(2*pi*x));
    }
    public void area(double x, double y) {}
    public void peri(double x, double y) {}
}
class AreaInterface{
    public static void main(String arg[]){
        Rectangle r=new Rectangle();
        Circle c=new Circle();
        int choice;
        double l,b,s;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the choice: ");
        System.out.print("\n1. Area of Rectangle \n2.Area of Circle \n3.Perimeter of Rectangle \n4.Perimeter of Circle \n");
        choice= reader.nextInt();
        switch (choice)
        {
            case 1: System.out.print("Enter the length and breadth of rectangle: ");
                    l=reader.nextDouble();
                    b=reader.nextDouble();
                    r.area( l, b);
                    break;
            case 2: System.out.print("Enter the radius of circle: ");
                    s=reader.nextDouble();
                    c.area(s);
                    break;
            case 3: System.out.print("Enter the length and breadth of rectangle: ");
                    l=reader.nextDouble();
                    b=reader.nextDouble();
                    r.peri( l, b);
                    break;
            case 4: System.out.print("Enter the radius of circle: ");
                    s=reader.nextDouble();
                    c.peri(s);
                    break;
            default:
             System.out.print("Invalid Choice !");
        }
    }
}
