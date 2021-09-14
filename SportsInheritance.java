import java.util.Scanner;

interface Sports {
    void read();
    void display();

}
class Student {
    Scanner reader=new Scanner(System.in);
    int rollno;
    float marks;
    Student(){
        rollno=0;
        marks=0;
    }
    void spread(){
        System.out.print("Enter Roll Number: ");
        rollno=reader.nextInt();
        System.out.print("Enter Academic Marks: ");
        marks=reader.nextFloat();
    }
    void spdisplay(){ 
        
        System.out.println("\nRoll Number: "+rollno);
        System.out.println("Academic Marks: "+marks);
    }
}

class Result extends Student implements Sports{
    Scanner reader=new Scanner(System.in);
    float tot,smark;
    public void read(){
        System.out.print("Enter sports mark: ");
        smark = reader.nextFloat();
    }
    public void display() {

        System.out.println("Sports Marks: "+smark);
        tot=marks+smark;
        System.out.println("Total Marks: "+tot);
    }
}
class SportsInheritance{
    public static void main(String[] args){
        Result r=new Result();
        r.spread();
        r.read();
        r.spdisplay();
        r.display();
    }
}