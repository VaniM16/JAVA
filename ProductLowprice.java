import java.util.Scanner;
class Product
{                            
int pcode;
String pname;
double price;

public void Data()
{
Scanner s=new Scanner(System.in);
System.out.print("\n Enter  The Product Code:");
pcode=s.nextInt();
System.out.print("Enter The Product Name:");
pname=s.next();
System.out.print("Enter The Product Price:");
price=s.nextDouble();
}

public Product low(Product p1,Product p2)
{

Product temp=new Product();
if(this.price<p1.price && this.price<p2.price)
temp=this;
else if(p1.price<this.price && p1.price<p2.price)
temp=p1;
else if(p2.price<this.price && p2.price<p1.price)
temp=p2;
return temp;
}

public void display()
{
System.out.println("\n Product Code:"+pcode);
System.out.println(" Product Name:"+pname);
System.out.println(" Product Price:"+price);
}
}
public class ProductLowprice
{
public static void main(String args[])
{
Product p=new Product();
Product p1=new Product();
Product p2=new Product();
Product p3=new Product();
p1.Data();
p2.Data();
p3.Data();
p=p3.low(p1, p2);
System.out.println("\n DETAILS OF FIRST PRODUCT");
p1.display();
System.out.println("\n DETAILS OF SECOND PRODUCT");
p2.display();
System.out.println("\n DETAILS OF THIRD PRODUCT");
p3.display();
System.out.println("\n DETAILS OF PRODUCT WITH LOWEST PRICE");
p.display();



}
}
